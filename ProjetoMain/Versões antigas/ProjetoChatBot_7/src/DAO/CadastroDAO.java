package DAO;

import DTO.CadastroDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class CadastroDAO {

    Connection con;
    PreparedStatement pstm;

    public void cadastrarUsuario(CadastroDTO objusuariodto) {
        String sql = "insert into usuario (nome, email, senha, dt_nasc, telefone) values (?, ?, ?, ?, ?)";

        con = new ConectionFactory().connection();

        try {
            
            pstm = con.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getNome());
            pstm.setString(2, objusuariodto.getEmail());
            pstm.setString(3, objusuariodto.getSenha());
            pstm.setString(4, objusuariodto.getDt_nasc());
            pstm.setString(5, objusuariodto.getTelefone());
            
            pstm.execute();
            pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "CadastroDAO" + erro);
        }

    }

}

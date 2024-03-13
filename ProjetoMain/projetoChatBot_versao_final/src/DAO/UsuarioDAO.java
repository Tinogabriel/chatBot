

package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    
    Connection con;
    
    public ResultSet autenticacaoUsuario(UsuarioDTO objusuariodto){
        con = new ConectionFactory().connection();
        
        try {
            String sql = "select 8 from usuario where nome = ? and senha = ? ";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setString(1, objusuariodto.getNome());
            pstm.setString(2, objusuariodto.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: ");
            return null;
        }
    }
}

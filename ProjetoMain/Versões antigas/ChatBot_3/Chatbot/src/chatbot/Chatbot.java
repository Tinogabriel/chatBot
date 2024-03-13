
package chatbot;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class Chatbot {

    public static void main(String[] args) {
        // code application logic here
        Main gui=new Main();
        gui.setVisible(true);
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui.setResizable(true);
        gui.setTitle("Wall-e ChatBot");

    }
    
}

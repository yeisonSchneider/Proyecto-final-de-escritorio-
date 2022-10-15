package Principal;

import javax.swing.UIManager;
import Ventanas.Login;


public class principal {

    public static void main(String args[]) {
        try {

            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            
            Login login = new Login();
            login.setVisible(true);
            login.setLocationRelativeTo(null);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

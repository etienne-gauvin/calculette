package calculette;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

/**
 * @author Etienne Gauvin <etiennegauvin41@gmail.com>
 */

public class Calculette
{
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)
    {
        try
        {
            // Chargement du L&F Nimbus
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            
            // Créer la fenêtre
            CalculetteFrame calculetteFrame = new CalculetteFrame();
            
            // Chargement de l'icône
            Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");
            calculetteFrame.setIconImage(icon);
            
            // Afficher la fenêtre
            calculetteFrame.setLocationRelativeTo(null);
            calculetteFrame.setVisible(true);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Iconos3 implements Icon{

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Image image = new ImageIcon(getClass().getResource("imagenes/info.png")).getImage();
        g.drawImage(image, x, y, c);
    }

    @Override
    public int getIconWidth() {
        return 50;
    }

    @Override
    public int getIconHeight() {
        return 50;
    }
    

}
import java.awt.Image;
import javax.swing.ImageIcon;


public class Personajes {

    public int posper=0;
    public ImageIcon imgper1;
    public ImageIcon imgper2;
    public ImageIcon imgper3;
    public ImageIcon imgper11;
    public ImageIcon imgper12;
    public ImageIcon imgper13;
    
    public ImageIcon obtenerImagen(int tamx){
        ImageIcon per = new ImageIcon(getClass().getResource("/Imagenes/princesa1.png"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(tamx, 150, Image.SCALE_SMOOTH);
        per = new ImageIcon(imgtam);
        return per;
    }
}

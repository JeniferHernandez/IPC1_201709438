
import javax.swing.ImageIcon;


public class imagenesR {
    
    public ImageIcon icoImagen;
    public ImageIcon ImageP(int vDado){
        switch(vDado){
            case 1:
                icoImagen = new ImageIcon("C:\\Users\\Erick\\Pictures\\Dados\\1.png");break;
            case 2:
                icoImagen = new ImageIcon("C:\\Users\\Erick\\Pictures\\Dados\\2.png");break;
            case 3:
                icoImagen = new ImageIcon("C:\\Users\\Erick\\Pictures\\Dados\\3.png");break;
            case 4:    
                icoImagen = new ImageIcon("C:\\Users\\Erick\\Pictures\\Dados\\4.png");break;
            case 5:    
                icoImagen = new ImageIcon("C:\\Users\\Erick\\Pictures\\Dados\\5.png");break;
            case 6:    
                icoImagen = new ImageIcon("C:\\Users\\Erick\\Pictures\\Dados\\6.png");break;
         }
        return icoImagen;
    }

    Object getImage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

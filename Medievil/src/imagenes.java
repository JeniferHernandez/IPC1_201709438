
import javax.swing.ImageIcon;

public class imagenes {

    public ImageIcon icoImagen;
    public ImageIcon gifDado(int Dado1){
        switch(Dado1){
            case 1:
                icoImagen = new ImageIcon("C:\\Users\\Erick\\Pictures\\Dados\\dado.gif"); break;  
            case 2:
                icoImagen = new ImageIcon("C:\\Users\\Erick\\Pictures\\Dados\\dado.gif");break;
            case 3:
                icoImagen = new ImageIcon("C:\\Users\\Erick\\Pictures\\Dados\\dado.gif");break;
            case 4:    
                icoImagen = new ImageIcon("C:\\Users\\Erick\\Pictures\\Dados\\dado.gif");break;
            case 5:    
                icoImagen = new ImageIcon("C:\\Users\\Erick\\Pictures\\Dados\\dado.gif");break;
            case 6:    
                icoImagen = new ImageIcon("C:\\Users\\Erick\\Pictures\\Dados\\dado.gif");break;
         }
        return icoImagen;
    }
}

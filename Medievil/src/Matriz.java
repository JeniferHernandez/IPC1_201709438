
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class Matriz extends Medievil{
    JLabel[][] bMatriz;
    JPanel panel;
    public Personajes per; 
    public int[][] cMatriz;
    public int tambloquex = 0;
    public int tam = 0;
    
    public Matriz(){
        add(getjpanel());
        inicializar();
    }
    
    public int tamanioMatriz(){
         int tamanio =Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamanio de tablero: ", JOptionPane.QUESTION_MESSAGE));
        while(true){
       
            if(tamanio <8 || tamanio >18 ){
        JOptionPane.showMessageDialog(null,"Rango incorrecto"," ", JOptionPane.ERROR_MESSAGE);
        tamanio =Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamanio de tablero ", JOptionPane.QUESTION_MESSAGE));
            }
            else{
                
            break;
           
        }
        
    }
       return tamanio;
    }
    javax.swing.border.Border borde;
    public JPanel getjpanel(){
        int tamanio = tamanioMatriz();
        panel = new JPanel();
        panel.setBorder(borde);
        
        bMatriz = new JLabel[tamanio][tamanio];
        cMatriz = new int[tamanio][tamanio]; 
        panel.setBounds(30,30,400,400);
        /*int numr = (int)Math.random()*10;*/
       borde = LineBorder.createGrayLineBorder();
        
        panel.setLayout(new GridLayout(tamanio,tamanio));
        
       /* cMatriz[0][0] = 1;
                this.per = new Personajes();
                this.per.posper = 0;
           for(int i=0; i<tamanio; i++){
            for(int j=0; j<tamanio; j++){
                cMatriz[i][j] = 0;
            }
           }
           repintar();
        return panel;*/
    
       for(int i=0; i<tamanio; i++){
            for(int j=0; j<tamanio; j++){
                bMatriz[i][j] = new JLabel();
                bMatriz[i][j].setBorder(borde);
                panel.add(bMatriz [i][j]);
                
                
            }
        }
        return panel;
    }
    public void repintar(){
        for(int i=0; i<tam; i++){
            for(int j=0; j<tam; j++){
                JLabel Matriz; 
                
                if(cMatriz[i][j]==0){
                    Matriz = new JLabel();
                    Matriz.setOpaque(false);
                    Matriz.setBorder(BorderFactory.createLineBorder(new Color(0,0,1)));
                    Matriz.setBounds(i*j* tambloquex, 0,tambloquex, 150);
                    bMatriz[i][j] = Matriz;
                    panel.add(bMatriz[i][j], BorderLayout.CENTER);
                    panel.repaint();
                }
                 if(cMatriz[i][j]==1){
                    Matriz = new JLabel(this.per.obtenerImagen(tambloquex));
                    Matriz.setOpaque(false);
                    Matriz.setBorder(BorderFactory.createLineBorder(new Color(0,0,1)));
                    Matriz.setBounds(i*j* tambloquex, 0,tambloquex, 150);
                    bMatriz[i][j] = Matriz;
                    panel.add(bMatriz[i][j], BorderLayout.CENTER);
                    panel.repaint();
            }
           }
    }
    }

    public void inicializar(){
        setLayout(null);
        setSize(900,700);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String [] args){
        Matriz m = new Matriz(); 
    }

    private String getText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
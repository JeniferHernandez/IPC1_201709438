/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Matriz extends JFrame {
   JButton[][] bMatriz;
   JPanel panel;
   JLabel texto; 
   
   public Matriz(){
       add(getjpanel());
       add(gettexto());
       inicializar();
   }
   public int tamMatriz(){
       int tam=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese tamanio",JOptionPane.QUESTION_MESSAGE));
       
       return tam;
   }
   public JPanel getjpanel(){
       int tam = tamMatriz();
       panel = new JPanel();
       bMatriz = new JButton[tam][tam];
       
       panel.setBounds(100,100,300,300);
       
       int numr = (int)Math.random()*10; 
       
       panel.setLayout(new GridLayout(tam,tam));
       
       for(int i=0; i<tam;i++){
           for(int j=0;j<tam;j++){
               bMatriz[i][j] = new JButton(String.valueOf(numr));
               panel.add(bMatriz[i][j]);
           }
       }
       
       return panel;
   }
   
   public JLabel gettexto(){
       texto = new JLabel("Matriz");
       texto.setBounds(10,10,70,80);
       
       return texto;
   }
   
   public void inicializar(){
       setLayout(null);
       setSize(600,600);
       setVisible(true);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}

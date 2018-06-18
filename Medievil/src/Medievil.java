
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erick
 */
public class Medievil extends javax.swing.JFrame {

     String nombre = JOptionPane.showInputDialog("Ingrese nombre del jugador 1: ", JOptionPane.QUESTION_MESSAGE);
     
     String[] personajes1 = {"Princesa", "Guerrero", "Mago"};
     String per1 = (String) JOptionPane.showInputDialog(null, "seleccione personaje 1", "personajes", JOptionPane.INFORMATION_MESSAGE, null, personajes1, personajes1[0]);
     String per2 = (String) JOptionPane.showInputDialog(null, "seleccione personaje 2", "personajes", JOptionPane.INFORMATION_MESSAGE, null, personajes1, personajes1[0]);
     String per3 = (String) JOptionPane.showInputDialog(null, "seleccione personaje 3", "personajes", JOptionPane.INFORMATION_MESSAGE, null, personajes1, personajes1[0]);

     String nombre2 = JOptionPane.showInputDialog("Ingrese nombre del jugador 2: ", JOptionPane.QUESTION_MESSAGE);
  
     String[] personajes2 = {"Princesa", "Guerrero", "Mago"};
     String pers1 = (String) JOptionPane.showInputDialog(this,"seleccione personaje 1","personajes", JOptionPane.INFORMATION_MESSAGE, null, personajes2, personajes2[0]);
     String pers2 = (String) JOptionPane.showInputDialog(this,"seleccione personaje 2","personajes", JOptionPane.INFORMATION_MESSAGE, null, personajes2, personajes2[0]);
     String pers3 = (String) JOptionPane.showInputDialog(this,"seleccione personaje 3","personajes", JOptionPane.INFORMATION_MESSAGE, null, personajes2, personajes2[0]);
   
    
    
     
    public Medievil() {
        initComponents();
        
     
        this.J1.setText(nombre);
        this.J2.setText(nombre2);
        this.P1J1.setText(per1);
        this.P2J1.setText(per2);
        this.P3J1.setText(per3);
        this.P1J2.setText(pers1);
        this.P2J2.setText(pers2);
        this.P3J2.setText(pers3);
        
        
        
        
        
        setLocationRelativeTo(null);
        t = new Timer(130, acciones);
        t.start();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        J2 = new javax.swing.JTextField();
        P3J1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        J1 = new javax.swing.JTextField();
        P1J1 = new javax.swing.JTextField();
        P2J1 = new javax.swing.JTextField();
        P3J2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        P1J2 = new javax.swing.JTextField();
        P2J2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnparar = new javax.swing.JButton();
        lbd = new javax.swing.JLabel();
        btntirar = new javax.swing.JButton();
        lb = new javax.swing.JLabel();
        lbt = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        jLabel2.setText("VIDAS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(470, 550, 60, 14);

        jLabel3.setText("JUGADOR 1");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 500, 80, 14);

        jLabel4.setText("TIEMPO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(470, 40, 90, 14);

        jLabel5.setText("VIDAS");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 560, 50, 14);

        jLabel6.setText("JUGADOR 2");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(450, 500, 80, 14);

        J2.setEditable(false);
        getContentPane().add(J2);
        J2.setBounds(540, 500, 100, 20);

        P3J1.setEditable(false);
        getContentPane().add(P3J1);
        P3J1.setBounds(280, 580, 100, 20);

        jLabel9.setText("PERSONAJES");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(300, 500, 100, 14);

        J1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J1ActionPerformed(evt);
            }
        });
        getContentPane().add(J1);
        J1.setBounds(110, 500, 100, 20);

        P1J1.setEditable(false);
        getContentPane().add(P1J1);
        P1J1.setBounds(280, 520, 100, 20);

        P2J1.setEditable(false);
        getContentPane().add(P2J1);
        P2J1.setBounds(280, 550, 100, 20);

        P3J2.setEditable(false);
        getContentPane().add(P3J2);
        P3J2.setBounds(670, 580, 100, 20);

        jLabel10.setText("PERSONAJES");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(690, 500, 100, 14);

        P1J2.setEditable(false);
        getContentPane().add(P1J2);
        P1J2.setBounds(670, 520, 100, 20);

        P2J2.setEditable(false);
        getContentPane().add(P2J2);
        P2J2.setBounds(670, 550, 100, 20);

        jButton1.setText("Abajo");
        getContentPane().add(jButton1);
        jButton1.setBounds(610, 430, 90, 40);

        jButton2.setText("Derecha");
        getContentPane().add(jButton2);
        jButton2.setBounds(710, 400, 90, 40);

        jButton3.setText("Izquierda");
        getContentPane().add(jButton3);
        jButton3.setBounds(510, 400, 90, 40);

        jButton4.setText("Arriba");
        getContentPane().add(jButton4);
        jButton4.setBounds(610, 370, 90, 40);

        btnparar.setText("Parar");
        btnparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpararActionPerformed(evt);
            }
        });
        getContentPane().add(btnparar);
        btnparar.setBounds(460, 170, 80, 40);

        lbd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbd);
        lbd.setBounds(560, 80, 0, 0);

        btntirar.setText("Tirar");
        btntirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntirarActionPerformed(evt);
            }
        });
        getContentPane().add(btntirar);
        btntirar.setBounds(460, 100, 80, 40);

        lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lb);
        lb.setBounds(550, 70, 310, 280);

        lbt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lbt);
        lbt.setBounds(530, 30, 210, 40);

        jMenu1.setText("Opciones");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Timer t;
        private int m,s; 
        Integer tim = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tiempo de juego: ",JOptionPane.QUESTION_MESSAGE));
        private ActionListener acciones = new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e) {
             
             s++;
             if(s==60){
                 s=0;
                 ++m;
             
             }
           
                 if(m== tim){
                 JOptionPane.showMessageDialog(null,"Se acabo su tiempo","", JOptionPane.INFORMATION_MESSAGE);
                 t.stop();
                  m=0; s=0; 
                  System.exit(0);
                  
                    }

         
             actualizarLabel();
             /*throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.*/
         }
            
        };
        
        private void actualizarLabel(){
            String tiempo = (m<=9?"0":"")+m+":" +(s<=9?"0":"")+s;
            lbt.setText(tiempo);
        }
        
        
        
        
        
    private void btntirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntirarActionPerformed
        // TODO add your handling code here:
        Dado objDado = new Dado();
        int dados = objDado.calcularnu();
        imagenes objImag1 = new imagenes();
        lb.setIcon(objImag1.gifDado(dados));
    }//GEN-LAST:event_btntirarActionPerformed

    private void btnpararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpararActionPerformed
        // TODO add your handling code here:
        Dado objDado = new Dado();
        imagenesR objImag1 = new imagenesR();
        int num1 = objDado.calcularnu();
        lb.setIcon(objImag1.ImageP(num1));
        
    }//GEN-LAST:event_btnpararActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void J1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J1ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_J1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Medievil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medievil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medievil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medievil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medievil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField J1;
    public static javax.swing.JTextField J2;
    private javax.swing.JTextField P1J1;
    private javax.swing.JTextField P1J2;
    private javax.swing.JTextField P2J1;
    private javax.swing.JTextField P2J2;
    private javax.swing.JTextField P3J1;
    private javax.swing.JTextField P3J2;
    private javax.swing.JButton btnparar;
    private javax.swing.JButton btntirar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lbd;
    private javax.swing.JLabel lbt;
    // End of variables declaration//GEN-END:variables
}

package examenlab5p2_luishenriquez;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class ExamenLab5P2_LuisHenriquez extends javax.swing.JFrame {

    public ExamenLab5P2_LuisHenriquez() {
        initComponents();
        
        usuarios.add(new Civil("Juan", "Borjas", "Boro@", "Masculino", "Francisco Morazán", new Date(2002, 01, 25)));
        usuarios.add(new Civil("Carlos", "Espinal", "1234", "Masculino", "Cortés", new Date(2004, 8, 25)));
        usuarios.add(new Civil("Daniel", "Juarez", "4321", "Masculino", "Francisco Morazán", new Date(2004, 03, 21)));
        usuarios.add(new Empleado("Ingeniero en sistemas", "Head of IT", 2, 
                "Emilio", "Cantarero", "BestPasswordEver", "Masculino", "Comayagua", new Date(2004, 06, 9)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        dg_empleado = new javax.swing.JDialog();
        dg_civil = new javax.swing.JDialog();
        bg_principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        bt_entrar = new javax.swing.JButton();
        pf_contrasena = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre Completo:");

        javax.swing.GroupLayout dg_empleadoLayout = new javax.swing.GroupLayout(dg_empleado.getContentPane());
        dg_empleado.getContentPane().setLayout(dg_empleadoLayout);
        dg_empleadoLayout.setHorizontalGroup(
            dg_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dg_empleadoLayout.setVerticalGroup(
            dg_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout dg_civilLayout = new javax.swing.GroupLayout(dg_civil.getContentPane());
        dg_civil.getContentPane().setLayout(dg_civilLayout);
        dg_civilLayout.setHorizontalGroup(
            dg_civilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dg_civilLayout.setVerticalGroup(
            dg_civilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg_principal.setBackground(new java.awt.Color(255, 255, 255));
        bg_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("LogIn");
        bg_principal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Contraseña:");
        bg_principal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 180, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre Completo:");
        bg_principal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 180, -1));

        tf_nombre.setBackground(new java.awt.Color(204, 204, 204));
        tf_nombre.setForeground(new java.awt.Color(0, 0, 0));
        tf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombreActionPerformed(evt);
            }
        });
        bg_principal.add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 250, 40));

        bt_entrar.setBackground(new java.awt.Color(0, 0, 0));
        bt_entrar.setForeground(new java.awt.Color(255, 255, 255));
        bt_entrar.setText("Entrar");
        bt_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_entrarActionPerformed(evt);
            }
        });
        bg_principal.add(bt_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        pf_contrasena.setBackground(new java.awt.Color(204, 204, 204));
        pf_contrasena.setForeground(new java.awt.Color(0, 0, 0));
        bg_principal.add(pf_contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 250, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nombreActionPerformed

    private void bt_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_entrarActionPerformed
        String[] nombre = new String [2];
        nombre = tf_nombre.getText().split(" ");
        String contrasena = pf_contrasena.getText();
        System.out.println(nombre[0]);
        System.out.println(nombre[1]);
        boolean acceso = false;
        
        for (int i = 0; i < usuarios.size(); i++) {
            String nombreActual = usuarios.get(i).getNombre();
            String apellidoActual = usuarios.get(i).getApellido();
            String contrasenaActual = usuarios.get(i).getContrasena();
            
            
            if (nombre[0].equals(nombreActual) && nombre[1].equals(apellidoActual)) {
                if (pf_contrasena.getText().equals(contrasenaActual)) {
                    this.setVisible(false);
                    tf_nombre.setText("");
                    pf_contrasena.setText("");
                    acceso = true;
                    
                }
            }
        }
        
        if (!acceso) {
                JOptionPane.showMessageDialog(this, "Stranger danger.");
            }
        
        
    }//GEN-LAST:event_bt_entrarActionPerformed

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
            java.util.logging.Logger.getLogger(ExamenLab5P2_LuisHenriquez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamenLab5P2_LuisHenriquez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamenLab5P2_LuisHenriquez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamenLab5P2_LuisHenriquez.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamenLab5P2_LuisHenriquez().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_principal;
    private javax.swing.JButton bt_entrar;
    private javax.swing.JDialog dg_civil;
    private javax.swing.JDialog dg_empleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pf_contrasena;
    private javax.swing.JTextField tf_nombre;
    // End of variables declaration//GEN-END:variables
    public static ArrayList<Usuario> usuarios = new ArrayList();

}

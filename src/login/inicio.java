
package login;

public class inicio extends javax.swing.JFrame {
    String nombre="Jona", contra="123";
   
    public inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        X = new javax.swing.JButton();
        contrasena = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/310818.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, 130));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 150, 20));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Contraseña");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 190, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tocar.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 30, 40));

        X.setBackground(new java.awt.Color(204, 0, 0));
        X.setForeground(new java.awt.Color(255, 255, 255));
        X.setText("X");
        X.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });
        getContentPane().add(X, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 10, 20, 30));

        contrasena.setBackground(new java.awt.Color(255, 255, 255));
        contrasena.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        contrasena.setForeground(new java.awt.Color(0, 0, 0));
        contrasena.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 160, 40));

        Nombre.setBackground(new java.awt.Color(255, 255, 255));
        Nombre.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        Nombre.setForeground(new java.awt.Color(0, 0, 0));
        Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Nombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/manga-hatsune-miku-vocaloid-wallpaper-preview.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_XActionPerformed
                                            
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
         Menu ventana=new Menu();
        if (Nombre.getText().equals(nombre) && contrasena.getText().equals(contra))
        {
            ventana.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton X;
    private javax.swing.JTextField contrasena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}

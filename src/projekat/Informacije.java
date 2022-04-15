package projekat;

public class Informacije extends javax.swing.JFrame {

    public Informacije() {
        initComponents();
    }
    private static final long serialVersionUID = 1L;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupaDugmica = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        paketi_cb = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        info_TA = new javax.swing.JTextArea();
        prikaziInformacije_B = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Informacije ");

        jLabel1.setText("Paketi");

        jButton1.setText("Izlaz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        paketi_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "S+ NET", "M", "M+", "L", "L+", "L+ NET", "X", "X+", "XS", "XL", "XL+", "XL+ NET+" }));

        info_TA.setColumns(20);
        info_TA.setLineWrap(true);
        info_TA.setRows(5);
        jScrollPane1.setViewportView(info_TA);

        prikaziInformacije_B.setText("Prikazi");
        prikaziInformacije_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prikaziInformacije_BActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(396, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(paketi_cb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(prikaziInformacije_B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paketi_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(prikaziInformacije_B))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void prikaziInformacije_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prikaziInformacije_BActionPerformed
        prikaziInformacije();
    }//GEN-LAST:event_prikaziInformacije_BActionPerformed

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
            java.util.logging.Logger.getLogger(Informacije.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informacije.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informacije.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informacije.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informacije().setVisible(true);
            }
        });
    }

    private void prikaziInformacije() {
        switch (paketi_cb.getSelectedItem().toString()) {
            case "S":
                info_TA.setText("Pretplata: " + paketi_cb.getSelectedItem().toString() + " :\n50 minuta za pozive prema svim mrezama na teritoriji Republike Srbije.\n100 SMS poruka prema svim mrezama na teritoriji Republike Srbije.\n300MB mobilnog interneta.");
                break;
            case "S+ NET":
                info_TA.setText("Pretplata: " + paketi_cb.getSelectedItem().toString() + " :\n70 minuta za pozive prema svim mrezama na teritoriji Republike Srbije.\n120 SMS poruka prema svim mrezama na teritoriji Republike Srbije.\n700MB mobilnog interneta.");
                break;
            case "M":
                info_TA.setText("Pretplata: " + paketi_cb.getSelectedItem().toString() + " :\n100 minuta za pozive prema svim mrezama na teritoriji Republike Srbije.\n150 SMS poruka prema svim mrezama na teritoriji Republike Srbije.\n800MB mobilnog interneta.");
                break;
            case "M+":
                info_TA.setText("Pretplata: " + paketi_cb.getSelectedItem().toString() + " :\n120 minuta za pozive prema svim mrezama na teritoriji Republike Srbije.\n170 SMS poruka prema svim mrezama na teritoriji Republike Srbije.\n15 SMS poruka prema MTEL mrezi na teritoriji Republike Srpske.\n1GB mobilnog interneta.");
                break;
            case "L":
                info_TA.setText("Pretplata: " + paketi_cb.getSelectedItem().toString() + " :\n150 minuta za pozive prema svim mrezama na teritoriji Republike Srbije.\n160 SMS poruka prema svim mrezama na teritoriji Republike Srbije.\n1.2GB mobilnog interneta.");
                break;
            case "L+":
                info_TA.setText("Pretplata: " + paketi_cb.getSelectedItem().toString() + " :\n170 minuta za pozive prema svim mrezama na teritoriji Republike Srbije.\n180 SMS poruka prema svim mrezama na teritoriji Republike Srbije.\n30 SMS poruka prema MTEL mrezi na teritoriji Republike Srpske.\n2GB mobilnog interneta.");
                break;
            case "L+ NET":
                info_TA.setText("Pretplata: " + paketi_cb.getSelectedItem().toString() + " :\n170 minuta za pozive prema svim mrezama na teritoriji Republike Srbije.\n180 SMS poruka prema svim mrezama na teritoriji Republike Srbije.\n30 SMS poruka prema MTEL mrezi na teritoriji Republike Srpske.\n1.3GB mobilnog interneta.");
                break;
            case "X":
                info_TA.setText("Pretplata: " + paketi_cb.getSelectedItem().toString() + " :\n250 minuta za pozive prema svim mrezama na teritoriji Republike Srbije.\n50 minuta za pozive prema MTEL mrezi na teritoriji Republike Srpske.\nNeograniceno SMS poruka prema svim mrezama na teritoriji Republike Srbije.\n50 SMS poruka prema MTEL mrezi na teritoriji Republike Srpske.\n2GB mobilnog interneta.\n300MB mobilnog interneta na teritoriji Republike Srpske.");
                break;
            case "X+":
                info_TA.setText("Pretplata: " + paketi_cb.getSelectedItem().toString() + " :\n300 minuta za pozive prema svim mrezama na teritoriji Republike Srbije.\n100 minuta za pozive prema MTEL mrezi na teritoriji Republike Srpske.\nNeograniceno SMS poruka prema svim mrezama na teritoriji Republike Srbije.\n100 SMS poruka prema MTEL mrezi na teritoriji Republike Srpske.\n2.3GB mobilnog interneta.\n500MB mobilnog interneta na teritoriji Republike Srpske.");
                break;
            case "XS":
                info_TA.setText("Pretplata: " + paketi_cb.getSelectedItem().toString() + " :\n500 minuta za pozive prema svim mrezama na teritoriji Republike Srbije.\n200 minuta za pozive prema MTEL mrezi na teritoriji Republike Srpske.\nNeograniceno SMS poruka prema svim mrezama na teritoriji Republike Srbije.\n200 SMS poruka prema MTEL mrezi na teritoriji Republike Srpske.\n2.7GB mobilnog interneta.\n1GB mobilnog interneta na teritoriji Republike Srpske.");
                break;
            case "XL":
                info_TA.setText("Pretplata: " + paketi_cb.getSelectedItem().toString() + " :\nNeograniceno minuta za pozive prema svim mrezama na teritoriji Republike Srbije.\n300 minuta za pozive prema MTEL mrezi na teritoriji Republike Srpske.\nNeograniceno SMS poruka prema svim mrezama na teritoriji Republike Srbije.\n350 SMS poruka prema MTEL mrezi na teritoriji Republike Srpske.\n3.5GB mobilnog interneta.\n2GB mobilnog interneta na teritoriji Republike Srpske.");
                break;
            case "XL+":
                info_TA.setText("Pretplata: " + paketi_cb.getSelectedItem().toString() + " :\nNeograniceno minuta za pozive prema svim mrezama na teritoriji Republike Srbije.\n500 minuta za pozive prema MTEL mrezi na teritoriji Republike Srpske.\nNeograniceno SMS poruka prema svim mrezama na teritoriji Republike Srbije.\nNeograniceno SMS poruka prema MTEL mrezi na teritoriji Republike Srpske.\n4GB mobilnog interneta.\n2GB mobilnog interneta na teritoriji Republike Srpske.");
                break;
            default:
                info_TA.setText("Pretplata: " + paketi_cb.getSelectedItem().toString() + " :\nNeograniceno minuta za pozive prema svim mrezama na teritoriji Republike Srbije.\nNeograniceno minuta za pozive prema MTEL mrezi na teritoriji Republike Srpske.\nNeograniceno SMS poruka prema svim mrezama na teritoriji Republike Srbije.\nNeograniceno SMS poruka prema MTEL mrezi na teritoriji Republike Srpske.\n6GB mobilnog interneta.\n3GB mobilnog interneta na teritoriji Republike Srpske.");
                break;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupaDugmica;
    private javax.swing.JTextArea info_TA;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> paketi_cb;
    private javax.swing.JButton prikaziInformacije_B;
    // End of variables declaration//GEN-END:variables

}

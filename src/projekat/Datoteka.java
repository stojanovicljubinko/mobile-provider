
package projekat;

public class Datoteka extends javax.swing.JFrame {

    Stampac p = new Stampac();

    public Datoteka(String s1, String s2, String s3, String s4, String s5, String d, double bk, double sk, double paket, boolean rata) {
        initComponents();

        nazivDatoteke_TF.setText("Zahtev - " + s1);
        sadrzajDatoteke_TF.append("Ime i prezime:   " + s1 + "\nPrebivaliste:   " + s2 + "\nProizvodjac:   " + s3 + "\nModel:   " + s4 + "\nBroj telefona:   " + s5 + "\nCena telefona:   " + d);

        double cena;
        double ukupno = (sk + (paket * 24));

        if (rata) {
            sadrzajDatoteke_TF.append("\nKonacna cena:   " + sk + "\nPretplata:   " + paket + " mesecno" + "\n------------------------------" + "\nUkupno:   " + ukupno + " DIN");

        } else {
            sadrzajDatoteke_TF.append("\nKonacna cena:   " + bk + "\nPretplata:   " + paket + " mesecno" + "\n------------------------------" + "\nUkupno:   " + ukupno + " DIN");

        }
    }

    public Datoteka() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nazivDatoteke_TF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        sadrzajDatoteke_TF = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        velicinaDatoteke_TF = new javax.swing.JTextField();
        dodajUred_B = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        brojZahteva_TF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        DatotekeReda_CB = new javax.swing.JComboBox<>();
        obrisi_B = new javax.swing.JButton();
        prikaziSadrzaj_B = new javax.swing.JButton();
        stampaj_B = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datoteka zahteva ");

        jLabel1.setText("Naziv datoteke:");

        sadrzajDatoteke_TF.setColumns(20);
        sadrzajDatoteke_TF.setLineWrap(true);
        sadrzajDatoteke_TF.setRows(5);
        sadrzajDatoteke_TF.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                sadrzajDatoteke_TFCaretUpdate(evt);
            }
        });
        jScrollPane1.setViewportView(sadrzajDatoteke_TF);

        jLabel2.setText("Potvrdjeni zahtev:");

        jLabel3.setText("Velicina fajla:");

        dodajUred_B.setText("Dodaj zahtev u red za stampu");
        dodajUred_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajUred_BActionPerformed(evt);
            }
        });

        jLabel4.setText("Broj dokumenata:");

        brojZahteva_TF.setEditable(false);
        brojZahteva_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brojZahteva_TFActionPerformed(evt);
            }
        });

        jLabel5.setText("Dokumenti za stampu");

        DatotekeReda_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatotekeReda_CBActionPerformed(evt);
            }
        });

        obrisi_B.setText("Obrisi zahtev");
        obrisi_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obrisi_BActionPerformed(evt);
            }
        });

        prikaziSadrzaj_B.setText("Ponovo prikazi zahtev");
        prikaziSadrzaj_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prikaziSadrzaj_BActionPerformed(evt);
            }
        });

        stampaj_B.setText("Stampaj zahtev");
        stampaj_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stampaj_BActionPerformed(evt);
            }
        });

        jButton1.setText("Izlaz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Sacuvaj");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DatotekeReda_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(velicinaDatoteke_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dodajUred_B, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(prikaziSadrzaj_B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(obrisi_B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stampaj_B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(nazivDatoteke_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(brojZahteva_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nazivDatoteke_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(brojZahteva_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(obrisi_B)
                        .addGap(18, 18, 18)
                        .addComponent(prikaziSadrzaj_B)
                        .addGap(18, 18, 18)
                        .addComponent(stampaj_B))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dodajUred_B)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(velicinaDatoteke_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DatotekeReda_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sadrzajDatoteke_TFCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_sadrzajDatoteke_TFCaretUpdate
        int vd = this.sadrzajDatoteke_TF.getText().length();
        this.velicinaDatoteke_TF.setText(String.valueOf(vd));
    }//GEN-LAST:event_sadrzajDatoteke_TFCaretUpdate

    private void dodajUred_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajUred_BActionPerformed
        p.dodaj(new Zahtev(this.sadrzajDatoteke_TF.getText(), Integer.parseInt(this.velicinaDatoteke_TF.getText()), this.nazivDatoteke_TF.getText()));
        reset();
    }//GEN-LAST:event_dodajUred_BActionPerformed

    private void prikaziSadrzaj_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prikaziSadrzaj_BActionPerformed
        Zahtev x = (Zahtev) this.DatotekeReda_CB.getSelectedItem();
        this.sadrzajDatoteke_TF.setText(x.getSadrzajZahteva());
        this.nazivDatoteke_TF.setText(x.getNazivZahteva());
    }//GEN-LAST:event_prikaziSadrzaj_BActionPerformed

    private void obrisi_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obrisi_BActionPerformed
        Zahtev x = (Zahtev) this.DatotekeReda_CB.getSelectedItem();
        this.p.obrisi(x);
        reset();
    }//GEN-LAST:event_obrisi_BActionPerformed

    private void stampaj_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stampaj_BActionPerformed
        this.p.stampaj();
        reset();
    }//GEN-LAST:event_stampaj_BActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.p.stampaj();
        reset();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void DatotekeReda_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatotekeReda_CBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatotekeReda_CBActionPerformed

    private void brojZahteva_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brojZahteva_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brojZahteva_TFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void reset() {
        p.dokumentiReda(DatotekeReda_CB);
        this.brojZahteva_TF.setText(p.brojDokumenata());
        this.nazivDatoteke_TF.setText("");
        this.velicinaDatoteke_TF.setText("");
        this.sadrzajDatoteke_TF.setText("");
    }

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
            java.util.logging.Logger.getLogger(Datoteka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datoteka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datoteka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datoteka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datoteka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DatotekeReda_CB;
    private javax.swing.JTextField brojZahteva_TF;
    private javax.swing.JButton dodajUred_B;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nazivDatoteke_TF;
    private javax.swing.JButton obrisi_B;
    private javax.swing.JButton prikaziSadrzaj_B;
    private javax.swing.JTextArea sadrzajDatoteke_TF;
    private javax.swing.JButton stampaj_B;
    private javax.swing.JTextField velicinaDatoteke_TF;
    // End of variables declaration//GEN-END:variables
}

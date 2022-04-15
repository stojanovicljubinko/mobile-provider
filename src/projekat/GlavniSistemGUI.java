package projekat;

import java.text.DecimalFormat;

public class GlavniSistemGUI extends javax.swing.JFrame {

    public GlavniSistemGUI() {
        initComponents();
        upozorenje_L.setVisible(false);
        id_TF.setText("1");
        id_TF.setFocusable(false);
        podaci_CB.setFocusable(false);
        imePrezime_TF.setFocusable(true);
        greska_L.setVisible(false);
    }
    Podaci p = new Podaci();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        imePrezime_TF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        proizvodjac_TF = new javax.swing.JTextField();
        model_TF = new javax.swing.JTextField();
        cenaTelefona_TF = new javax.swing.JTextField();
        brojTelefona_TF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        paket_CB = new javax.swing.JComboBox<>();
        rata_CB = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Ta = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        upozorenje_L = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        prebivaliste_TF = new javax.swing.JTextField();
        id_TF = new javax.swing.JTextField();
        greska_L = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        podaci_CB = new javax.swing.JComboBox<>();
        prikazi_B = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interfejs");

        jButton1.setText("Potvrdi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Ime i prezime");

        imePrezime_TF.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                imePrezime_TFCaretUpdate(evt);
            }
        });
        imePrezime_TF.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                imePrezime_TFMouseMoved(evt);
            }
        });

        jLabel2.setText("Proizvodjac");

        proizvodjac_TF.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                proizvodjac_TFCaretUpdate(evt);
            }
        });

        model_TF.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                model_TFCaretUpdate(evt);
            }
        });

        cenaTelefona_TF.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                cenaTelefona_TFCaretUpdate(evt);
            }
        });
        cenaTelefona_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cenaTelefona_TFActionPerformed(evt);
            }
        });

        brojTelefona_TF.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                brojTelefona_TFCaretUpdate(evt);
            }
        });

        jLabel3.setText("Paket");

        jLabel4.setText("Broj telefona");

        jLabel7.setText("Cena telefona");

        jLabel9.setText("Model");

        paket_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "S+ NET", "M", "M+", "L", "L+", "L+ NET", "X", "X+", "XS", "XL", "XL+", "XL NET+" }));

        rata_CB.setText("placanje na rate");
        rata_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rata_CBActionPerformed(evt);
            }
        });

        tabla_Ta.setColumns(20);
        tabla_Ta.setLineWrap(true);
        tabla_Ta.setRows(5);
        jScrollPane1.setViewportView(tabla_Ta);

        jButton2.setText("Dodatne informacije");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        upozorenje_L.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        upozorenje_L.setForeground(new java.awt.Color(204, 0, 0));
        upozorenje_L.setText("Upozorenje! Moze se desiti da bude ukljucena kamata i troskovi transakcija!");

        jLabel5.setText("Prebivaliste");

        prebivaliste_TF.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                prebivaliste_TFCaretUpdate(evt);
            }
        });

        greska_L.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        greska_L.setForeground(new java.awt.Color(204, 0, 51));
        greska_L.setText("Greska");

        jButton3.setText("Podnesi zahtev");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        podaci_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                podaci_CBActionPerformed(evt);
            }
        });

        prikazi_B.setText("Trenutna ponuda");
        prikazi_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prikazi_BActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("Izadji");
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(upozorenje_L)
                            .addComponent(rata_CB))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(paket_CB, 0, 180, Short.MAX_VALUE)
                                        .addGap(59, 59, 59))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel1)
                                                .addComponent(proizvodjac_TF)
                                                .addComponent(model_TF)
                                                .addComponent(brojTelefona_TF)
                                                .addComponent(imePrezime_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                                .addComponent(jLabel5)
                                                .addComponent(prebivaliste_TF))
                                            .addComponent(jLabel3)
                                            .addComponent(cenaTelefona_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(greska_L))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(podaci_CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(id_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(prikazi_B, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(podaci_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imePrezime_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prebivaliste_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proizvodjac_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(model_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(brojTelefona_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cenaTelefona_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(greska_L)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paket_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rata_CB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(upozorenje_L)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(prikazi_B)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rata_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rata_CBActionPerformed
        if (rata_CB.isSelected()) {
            upozorenje_L.setText("Upozorenje! Moze se desiti da bude ukljucena kamata i troskovi transakcija!");
            upozorenje_L.setVisible(true);
        } else {
            upozorenje_L.setVisible(false);
        }
    }//GEN-LAST:event_rata_CBActionPerformed

    private void imePrezime_TFMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imePrezime_TFMouseMoved

    }//GEN-LAST:event_imePrezime_TFMouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        greska_L.setVisible(false);
        if (!imePrezime_TF.getText().isEmpty() && !prebivaliste_TF.getText().isEmpty() && !proizvodjac_TF.getText().isEmpty() && !model_TF.getText().isEmpty() && !brojTelefona_TF.getText().isEmpty() && !cenaTelefona_TF.getText().isEmpty()) {
            opsluziDugme();
            podaci_CB.addItem(proizvodjac_TF.getText() + " " + model_TF.getText() + " - " + paket_CB.getSelectedItem());
        } else {
            greska_L.setVisible(true);
            greska_L.setText("Popunite sva polja!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void imePrezime_TFCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_imePrezime_TFCaretUpdate
        opsluzi();
    }//GEN-LAST:event_imePrezime_TFCaretUpdate

    private void proizvodjac_TFCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_proizvodjac_TFCaretUpdate
        opsluzi();
    }//GEN-LAST:event_proizvodjac_TFCaretUpdate

    private void model_TFCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_model_TFCaretUpdate
        opsluzi();
    }//GEN-LAST:event_model_TFCaretUpdate

    private void brojTelefona_TFCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_brojTelefona_TFCaretUpdate
        opsluzi();
    }//GEN-LAST:event_brojTelefona_TFCaretUpdate

    private void cenaTelefona_TFCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_cenaTelefona_TFCaretUpdate
        opsluzi();
    }//GEN-LAST:event_cenaTelefona_TFCaretUpdate

    private void prebivaliste_TFCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_prebivaliste_TFCaretUpdate
        opsluzi();
    }//GEN-LAST:event_prebivaliste_TFCaretUpdate

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Informacije().show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cenaTelefona_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cenaTelefona_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cenaTelefona_TFActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        opsluziCene();
        popuniIsprazniOtvori();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void prikazi_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prikazi_BActionPerformed
        new Ponuda().show();
    }//GEN-LAST:event_prikazi_BActionPerformed

    private void podaci_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_podaci_CBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_podaci_CBActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(1);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    public void reset() {
        imePrezime_TF.setText("");
        prebivaliste_TF.setText("");
        proizvodjac_TF.setText("");
        model_TF.setText("");
        brojTelefona_TF.setText("");
        cenaTelefona_TF.setText("");
        int i = Integer.parseInt(id_TF.getText());
        i++;
        id_TF.setText(String.valueOf(i));
    }

    private void popuniIsprazniOtvori() {
        if (daLiJePrazno()) {
            new Datoteka(imePrezime_TF.getText(), prebivaliste_TF.getText(), proizvodjac_TF.getText(), model_TF.getText(), brojTelefona_TF.getText(), cenaTelefona_TF.getText(), bezRate, saRatom, paket, rata).setVisible(true);
        }
        imePrezime_TF.setText("");
        prebivaliste_TF.setText("");
        proizvodjac_TF.setText("");
        model_TF.setText("");
        brojTelefona_TF.setText("");
        cenaTelefona_TF.setText("");
        int i = Integer.parseInt(id_TF.getText());
        i++;
        id_TF.setText(String.valueOf(i));
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
            java.util.logging.Logger.getLogger(GlavniSistemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GlavniSistemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GlavniSistemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GlavniSistemGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GlavniSistemGUI().setVisible(true);
            }
        });
    }
    boolean rata;

    private void opsluzi() {
        tabla_Ta.setText(" Ime i prezime:   " + imePrezime_TF.getText() + "\n    Prebivaliste:   " + prebivaliste_TF.getText() + "\n--------------------------------------------------------" + "\n     Proizvodjac:   " + proizvodjac_TF.getText() + "\n               Model:   " + model_TF.getText() + "\n   Broj telefona:   " + brojTelefona_TF.getText() + "\nCena telefona:   " + cenaTelefona_TF.getText() + "DIN");
    }

    private void opsluziDugme() {
        opsluzi();
        boolean zastavica = false;
        if (rata_CB.isSelected()) {
            zastavica = true;
        }
        if (zastavica) {
            tabla_Ta.append("\n\nIzabrani paket:   " + paket_CB.getSelectedItem().toString() + " na 24 rate");
            opsluziCene();
        } else {
            tabla_Ta.append("\n\nIzabrani paket:   " + paket_CB.getSelectedItem().toString());
            opsluziCene();
        }
    }
    double konacnaCena, pdv, kamata;
    double paket, saRatom, bezRate;

    private void opsluziCene() {
        if (!imePrezime_TF.getText().isEmpty() && !prebivaliste_TF.getText().isEmpty() && !proizvodjac_TF.getText().isEmpty() && !model_TF.getText().isEmpty() && !brojTelefona_TF.getText().isEmpty() && !cenaTelefona_TF.getText().isEmpty()) {
            if (isNumeric(cenaTelefona_TF.getText()) || cenaTelefona_TF.getText().isEmpty()) {

                konacnaCena = Integer.parseInt(cenaTelefona_TF.getText());

                kamata = konacnaCena / 12;
                pdv = konacnaCena / 90;

                //"S", "S+ NET", "M", "M+", "L", "L+", "L+ NET", "X", "X+", "XS", "XL", "XL+", "XL NET+" 
                switch (paket_CB.getSelectedItem().toString()) {
                    case "S":
                        paket = 1010;
                        break;
                    case "S+ NET":
                        paket = 1300;
                        break;
                    case "M":
                        paket = 1600;
                        break;
                    case "M+":
                        paket = 1750;
                        break;
                    case "L":
                        paket = 1900;
                        break;
                    case "L+":
                        paket = 2100;
                        break;
                    case "L+ NET":
                        paket = 2300;
                        break;
                    case "X":
                        paket = 3000;
                        break;
                    case "X+":
                        paket = 3250;
                        break;
                    case "XS":
                        paket = 3500;
                        break;
                    case "XL":
                        paket = 3900;
                        break;
                    case "XL+":
                        paket = 4150;
                        break;
                    case "XL NET+":
                        paket = 4800;
                        break;
                }
                DecimalFormat df = new DecimalFormat("#.#");
                saRatom = konacnaCena + kamata + pdv;
                bezRate = konacnaCena + pdv;
                if (rata_CB.isSelected()) {
                    tabla_Ta.append("\n--------------------------------------------------------" + "\nKonacna cena:   " + df.format(saRatom) + "\nPretplata:   " + paket + " mesecno");
                    rata = true;
                } else {
                    tabla_Ta.append("\n--------------------------------------------------------" + "\nKonacna cena:   " + df.format(bezRate) + "\nPretplata:   " + paket + " mesecno");
                    rata = false;
                }
            } else {
                greska_L.setVisible(true);
                greska_L.setText("Cena nije broj ili nije popunjeno!");
            }
        } else {
            greska_L.setVisible(true);
            greska_L.setText("Popunite sva polja!");
        }
    }

    private boolean proveraPolja() {
        if (!imePrezime_TF.getText().isEmpty() && !prebivaliste_TF.getText().isEmpty() && !proizvodjac_TF.getText().isEmpty() && !model_TF.getText().isEmpty() && !brojTelefona_TF.getText().isEmpty() && !cenaTelefona_TF.getText().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean daLiJePrazno() {
        if (!imePrezime_TF.getText().isEmpty() && !prebivaliste_TF.getText().isEmpty() && !proizvodjac_TF.getText().isEmpty() && !model_TF.getText().isEmpty() && !brojTelefona_TF.getText().isEmpty() && !cenaTelefona_TF.getText().isEmpty()) {
            return true;
        }
        return false;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField brojTelefona_TF;
    private javax.swing.JTextField cenaTelefona_TF;
    private javax.swing.JLabel greska_L;
    private javax.swing.JTextField id_TF;
    private javax.swing.JTextField imePrezime_TF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField model_TF;
    private javax.swing.JComboBox<String> paket_CB;
    private javax.swing.JComboBox<String> podaci_CB;
    private javax.swing.JTextField prebivaliste_TF;
    private javax.swing.JButton prikazi_B;
    private javax.swing.JTextField proizvodjac_TF;
    private javax.swing.JCheckBox rata_CB;
    private javax.swing.JTextArea tabla_Ta;
    private javax.swing.JLabel upozorenje_L;
    // End of variables declaration//GEN-END:variables
}

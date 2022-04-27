package projekat;

import java.awt.Toolkit;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class Ponuda extends javax.swing.JFrame {

 
    public Ponuda() {
        initComponents();
        aktuelnaPonuda();
    }
    
    public void aktuelnaPonuda(){
          DefaultTableModel model = (DefaultTableModel) tabela_T.getModel();

    Vector row1 = new Vector();
    row1.add("Samsung ");
    row1.add("M51");
    row1.add("35585DIN");
    row1.add("dostupno");
    model.addRow(row1);
    Vector row2 = new Vector();
    row2.add("Samsung");
    row2.add("M02s");
    row2.add("42085DIN");
    row2.add("dostupno");
    model.addRow(row2);
    Vector row3 = new Vector();
    row3.add("Samsung");
    row3.add("A32");
    row3.add("37225DIN");
    row3.add("dostupno");
    model.addRow(row3);
    Vector row4 = new Vector();
    row4.add("Samsung");
    row4.add("A72");
    row4.add("62010DIN");
    row4.add("nedostupno");
    model.addRow(row4);
    Vector row5 = new Vector();
    row5.add("Samsung");
    row5.add("A52");
    row5.add("51071DIN");
    row5.add("dostupno");
    model.addRow(row5);
    Vector row6 = new Vector();
    row6.add("Samsung");
    row6.add("F52");
    row6.add("39011DIN");
    row6.add("nedostupno");
    model.addRow(row6);
    Vector row7 = new Vector();
    row7.add("Samsung");
    row7.add("M42");
    row7.add("33205DIN");
    row7.add("nedostupno");
    model.addRow(row7);
    Vector row8 = new Vector();
    row8.add("Samsung");
    row8.add("M12");
    row8.add("22020DIN");
    row8.add("dostupno");
    model.addRow(row8);
    Vector row9 = new Vector();
    row9.add("Samsung");
    row9.add("A22");
    row9.add("28055DIN");
    row9.add("dostupno");
    model.addRow(row9);
    Vector row10 = new Vector();
    row10.add("Samsung");
    row10.add("M32");
    row10.add("30015DIN");
    row10.add("dostupno");
    model.addRow(row10);
    Vector row11 = new Vector();
    row11.add("Huawei");
    row11.add("P20");
    row11.add("32005DIN");
    row11.add("nedostupno");
    model.addRow(row11);
    Vector row12 = new Vector();
    row12.add("Huawei");
    row12.add("Mate 30");
    row12.add("43115DIN");
    row12.add("dostupno");
    model.addRow(row12);
    Vector row13 = new Vector();
    row13.add("Huawei");
    row13.add("P30");
    row13.add("37002DIN");
    row13.add("dostupno");
    model.addRow(row13);
    Vector row14 = new Vector();
    row14.add("Huawei");
    row14.add("P40");
    row14.add("49112DIN");
    row14.add("dostupno");
    model.addRow(row14);
    Vector row15 = new Vector();
    row15.add("Huawei");
    row15.add("Mate 40");
    row15.add("52150DIN");
    row15.add("nedostupno");
    model.addRow(row15);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_T = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Punuda ");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/logo.png")));

        tabela_T.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Proizvodjac", "Model", "Cena", "Dostupnost"
            }
        ));
        jScrollPane1.setViewportView(tabela_T);

        jButton1.setText("Izlaz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ponuda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_T;
    // End of variables declaration//GEN-END:variables
}

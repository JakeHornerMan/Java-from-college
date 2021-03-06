/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapp;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author x16318711
 */
public class BankingGUI extends javax.swing.JFrame {
    private ArrayList<Current> clist;
    private ArrayList<Savings> slist;
    
    private String accnam, type, irate, atmc;
    private int accnum;
    private double bal;
    /**
     * Creates new form BankingGUI
     */
    public BankingGUI() {
        initComponents();
        clist = new ArrayList<>();
        slist = new ArrayList<>();
        
        accnam = "";
        type = "";
        irate ="";
        atmc="";
        accnum = 0;
        bal = 0.0;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        accnumtf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        baltf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        accnametf = new javax.swing.JTextField();
        Currentbtn = new javax.swing.JButton();
        Savingsbtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        viewcurbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Account Number:");

        accnumtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accnumtfActionPerformed(evt);
            }
        });

        jLabel2.setText("Balence:");

        jLabel3.setText("Account Name:");

        accnametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accnametfActionPerformed(evt);
            }
        });

        Currentbtn.setText("Current");
        Currentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurrentbtnActionPerformed(evt);
            }
        });

        Savingsbtn.setText("Savings");
        Savingsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavingsbtnActionPerformed(evt);
            }
        });

        jButton2.setText("Store Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Banking");

        viewcurbtn.setText("View Current");
        viewcurbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewcurbtnActionPerformed(evt);
            }
        });

        jButton1.setText("View Savings");
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
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(viewcurbtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Currentbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(accnumtf)
                                .addComponent(baltf)
                                .addComponent(accnametf)
                                .addComponent(Savingsbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)))
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accnumtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(baltf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(accnametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Currentbtn)
                    .addComponent(Savingsbtn))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewcurbtn)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accnumtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accnumtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accnumtfActionPerformed

    private void accnametfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accnametfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accnametfActionPerformed

    private void CurrentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurrentbtnActionPerformed
        // TODO add your handling code here:
        type = "Current";
        atmc = "0.25 euro";
    }//GEN-LAST:event_CurrentbtnActionPerformed

    private void SavingsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavingsbtnActionPerformed
        // TODO add your handling code here:
        type ="Savings";
        irate = "3.4%";
    }//GEN-LAST:event_SavingsbtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (type.equals("Current")){
            accnum = Integer.parseInt(accnumtf.getText());
            bal = Double.parseDouble(baltf.getText());
            accnam = accnametf.getText();
            
            Current c = new Current();
            
            c.setAccnum(accnum);
            c.setBal(bal);
            c.setAccnam(accnam);
            c.setType(type);
            c.setAtmc(atmc);
            
            clist.add(c);
        }
        else if(type.equals("Savings")){
            accnum = Integer.parseInt(accnumtf.getText());
            bal = Double.parseDouble(baltf.getText());
            accnam = accnametf.getText();
            
            Savings s = new Savings();
            
            s.setAccnum(accnum);
            s.setBal(bal);
            s.setAccnam(accnam);
            s.setType(type);
            s.setIrate(irate);
            
            slist.add(s);
        }
        else{
            JOptionPane.showMessageDialog(null, "please select an Account Type");
        }
        
        accnumtf.setText("");
        accnametf.setText("");
        baltf.setText("");
        
        type = "";
        irate ="";
        atmc ="";
    }//GEN-LAST:event_jButton2ActionPerformed

    private void viewcurbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewcurbtnActionPerformed
        // TODO add your handling code here:
        for(int i = 0; i<clist.size();i++){
            JOptionPane.showMessageDialog(null, "Account Number: "+ clist.get(i).getAccnum()+"\n Balence :"+ clist.get(i).getBal()+"\n Account Name: "+clist.get(i).getAccnam()+"\n Type: "+clist.get(i).getType()+"\n Atm Charge: "+clist.get(i).getAtmc());
        }
    }//GEN-LAST:event_viewcurbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        for(int j = 0; j<clist.size();j++){
            JOptionPane.showMessageDialog(null, "Account Number: "+ slist.get(j).getAccnum()+"\n Balence :"+ slist.get(j).getBal()+"\n Account Name: "+slist.get(j).getAccnam()+"\n Type: "+slist.get(j).getType()+"\n Interest Rate: "+slist.get(j).getIrate());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(BankingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankingGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Currentbtn;
    private javax.swing.JButton Savingsbtn;
    private javax.swing.JTextField accnametf;
    private javax.swing.JTextField accnumtf;
    private javax.swing.JTextField baltf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton viewcurbtn;
    // End of variables declaration//GEN-END:variables
}

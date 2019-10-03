

/*
 * Jake Horner and Ken Dolan
 * 5/10/2018
 * HomesGUI.java
 */
package homesapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author x16312261
 */
public class HomesGUI extends javax.swing.JFrame implements Serializable {

    private ArrayList<HomeOwner> ownerlist;
    private ArrayList<Homeless> lesslist;
    private ArrayList<Renting> rentlist;

    private String name, dob, hStat, mStat, whyHomeless;
    private int pplInHouse;
    private double annIncome, rent;
    private int counto, countl, countr;

    /**
     * Creates new form HomesGUI
     */
    public HomesGUI() {
        initComponents();
        ownerlist = new ArrayList<>();
        lesslist = new ArrayList<>();
        rentlist = new ArrayList<>();

        name = new String();
        dob = new String();
        hStat = new String();
        mStat = new String();
        whyHomeless = new String();
        rent = 0.0;
        annIncome = 0.0;
        pplInHouse = 0;
        counto = 2;
        countl = 2;
        countr = 2;

        mStatlbl.setVisible(false);
        mStattf.setVisible(false);
        pplInHouselbl.setVisible(false);
        pplInHousetf.setVisible(false);
        rentlbl.setVisible(false);
        renttf.setVisible(false);
        whylbl.setVisible(false);
        whytf.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homeslbl = new javax.swing.JLabel();
        namelbl = new javax.swing.JLabel();
        doblbl = new javax.swing.JLabel();
        ownerbtn = new javax.swing.JButton();
        rentingbtn = new javax.swing.JButton();
        homelessbtn = new javax.swing.JButton();
        nametf = new javax.swing.JTextField();
        dobtf = new javax.swing.JTextField();
        mStatlbl = new javax.swing.JLabel();
        pplInHouselbl = new javax.swing.JLabel();
        pplInHousetf = new javax.swing.JTextField();
        annIncomelbl = new javax.swing.JLabel();
        annIncometf = new javax.swing.JTextField();
        rentlbl = new javax.swing.JLabel();
        renttf = new javax.swing.JTextField();
        whylbl = new javax.swing.JLabel();
        whytf = new javax.swing.JTextField();
        AddDetailsBtn = new javax.swing.JButton();
        showHobtn = new javax.swing.JButton();
        showHlbtn = new javax.swing.JButton();
        showRentbtn = new javax.swing.JButton();
        mStattf = new javax.swing.JTextField();
        saverbtn = new javax.swing.JButton();
        savehlbtn = new javax.swing.JButton();
        savehobtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        homeslbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        homeslbl.setText("Homes Survey");

        namelbl.setText("Name:");

        doblbl.setText("Date of Birth:");

        ownerbtn.setText("Owner");
        ownerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ownerbtnActionPerformed(evt);
            }
        });

        rentingbtn.setText("Renting");
        rentingbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentingbtnActionPerformed(evt);
            }
        });

        homelessbtn.setText("Homeless");
        homelessbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homelessbtnActionPerformed(evt);
            }
        });

        dobtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobtfActionPerformed(evt);
            }
        });

        mStatlbl.setText("Marital status:");

        pplInHouselbl.setText("Number of residents:");

        annIncomelbl.setText("Annual income:");

        annIncometf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annIncometfActionPerformed(evt);
            }
        });

        rentlbl.setText("Monthly Rent:");

        renttf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renttfActionPerformed(evt);
            }
        });

        whylbl.setText("Your Story:");

        whytf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whytfActionPerformed(evt);
            }
        });

        AddDetailsBtn.setText("Add Details");
        AddDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDetailsBtnActionPerformed(evt);
            }
        });

        showHobtn.setText("Print HomeOwners");
        showHobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showHobtnActionPerformed(evt);
            }
        });

        showHlbtn.setText("Print Homeless");
        showHlbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showHlbtnActionPerformed(evt);
            }
        });

        showRentbtn.setText("Print Renters");
        showRentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showRentbtnActionPerformed(evt);
            }
        });

        saverbtn.setText("Save Renters");
        saverbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saverbtnActionPerformed(evt);
            }
        });

        savehlbtn.setText("Save Homeless");
        savehlbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savehlbtnActionPerformed(evt);
            }
        });

        savehobtn.setText("Save Owners");
        savehobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savehobtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(savehobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(saverbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(showHobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(showRentbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(savehlbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showHlbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(annIncomelbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(doblbl))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dobtf, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nametf, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(annIncometf, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(homeslbl)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ownerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pplInHouselbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(mStatlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rentingbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(homelessbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(renttf, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(whytf, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(mStattf, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pplInHousetf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(whylbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rentlbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(AddDetailsBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(namelbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(doblbl))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dobtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annIncomelbl)
                    .addComponent(annIncometf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ownerbtn)
                    .addComponent(rentingbtn)
                    .addComponent(homelessbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mStatlbl)
                    .addComponent(mStattf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pplInHouselbl)
                    .addComponent(pplInHousetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rentlbl)
                    .addComponent(renttf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(whylbl)
                    .addComponent(whytf, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddDetailsBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saverbtn)
                    .addComponent(savehobtn)
                    .addComponent(savehlbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showRentbtn)
                    .addComponent(showHobtn)
                    .addComponent(showHlbtn))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dobtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobtfActionPerformed

    private void annIncometfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annIncometfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_annIncometfActionPerformed

    private void renttfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renttfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_renttfActionPerformed

    private void whytfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whytfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_whytfActionPerformed

    private void homelessbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homelessbtnActionPerformed
        hStat = ("Homeless");

        mStatlbl.setVisible(false);
        mStattf.setVisible(false);
        pplInHouselbl.setVisible(false);
        pplInHousetf.setVisible(false);
        rentlbl.setVisible(false);
        renttf.setVisible(false);
        whylbl.setVisible(true);
        whytf.setVisible(true);
    }//GEN-LAST:event_homelessbtnActionPerformed

    private void rentingbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentingbtnActionPerformed
        hStat = ("Renting");

        mStatlbl.setVisible(false);
        mStattf.setVisible(false);
        pplInHouselbl.setVisible(false);
        pplInHousetf.setVisible(false);
        rentlbl.setVisible(true);
        renttf.setVisible(true);
        whylbl.setVisible(false);
        whytf.setVisible(false);
    }//GEN-LAST:event_rentingbtnActionPerformed

    private void ownerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ownerbtnActionPerformed
        hStat = ("Owner");

        mStatlbl.setVisible(true);
        mStattf.setVisible(true);
        pplInHouselbl.setVisible(true);
        pplInHousetf.setVisible(true);
        rentlbl.setVisible(false);
        renttf.setVisible(false);
        whylbl.setVisible(false);
        whytf.setVisible(false);
    }//GEN-LAST:event_ownerbtnActionPerformed

    private void AddDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDetailsBtnActionPerformed
        // TODO add your handling code here:
        if (hStat.equals("Owner")) {
            name = nametf.getText();
            dob = dobtf.getText();
            mStat = mStattf.getText();
            pplInHouse = Integer.parseInt(pplInHousetf.getText());
            annIncome = Double.parseDouble(annIncometf.getText());

            HomeOwner ho = new HomeOwner();
            ho.setName(name);
            ho.setDob(dob);
            ho.sethStat(hStat);
            ho.setmStat(mStat);
            ho.setAnnIncome(annIncome);
            ho.setPplInHouse(pplInHouse);

            ownerlist.add(ho);

            counto++;

        } else if (hStat.equals("Homeless")) {
            name = nametf.getText();
            dob = dobtf.getText();
            whyHomeless = whytf.getText();

            Homeless hl = new Homeless();
            hl.setName(name);
            hl.setDob(dob);
            hl.sethStat(hStat);
            hl.setWhyHomeless(whyHomeless);

            lesslist.add(hl);

            countl++;

        } else if (hStat.equals("Renting")) {
            name = nametf.getText();
            dob = dobtf.getText();
            annIncome = Double.parseDouble(annIncometf.getText());
            rent = Double.parseDouble(renttf.getText());

            Renting hr = new Renting();
            hr.setName(name);
            hr.setDob(dob);
            hr.sethStat(hStat);
            hr.setAnnIncome(annIncome);
            hr.setRent(rent);

            rentlist.add(hr);

            countr++;

        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Home Status Button");
        }

        nametf.setText("");
        dobtf.setText("");
        annIncometf.setText("");
        mStattf.setText("");
        pplInHousetf.setText("");
        renttf.setText("");
        whytf.setText("");

        name = new String();
        dob = new String();
        hStat = new String();
        mStat = new String();
        whyHomeless = new String();
        rent = 0.0;
        annIncome = 0.0;
        pplInHouse = 0;

        mStatlbl.setVisible(false);
        mStattf.setVisible(false);
        pplInHouselbl.setVisible(false);
        pplInHousetf.setVisible(false);
        rentlbl.setVisible(false);
        renttf.setVisible(false);
        whylbl.setVisible(false);
        whytf.setVisible(false);

    }//GEN-LAST:event_AddDetailsBtnActionPerformed

    private void showHobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showHobtnActionPerformed

        File readOwnerFile;
        FileInputStream fStream;
        ObjectInputStream oStream;

        try {
            readOwnerFile = new File("Owner.dat");
            fStream = new FileInputStream(readOwnerFile);
            oStream = new ObjectInputStream(fStream);

            ArrayList<HomeOwner> xList;
            xList = (ArrayList<HomeOwner>) oStream.readObject();
            
            for (HomeOwner x : xList) {
                JOptionPane.showMessageDialog(null, "Name: " + x.getName() + "\n Date of Birth: " + x.getDob() + "\n Home Status: " + x.gethStat() + "\n Marital Status: " + x.getmStat() + "\n Annual Income: " + x.getAnnIncome() + "\n People in House: " + x.getPplInHouse());
            }
            oStream.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_showHobtnActionPerformed

    private void showHlbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showHlbtnActionPerformed

        File readHomelessFile;
        FileInputStream hStream;
        ObjectInputStream qStream;

        try {
            readHomelessFile = new File("Homeless.dat");
            hStream = new FileInputStream(readHomelessFile);
            qStream = new ObjectInputStream(hStream);

            ArrayList<Homeless> yList;
            yList = (ArrayList<Homeless>) qStream.readObject();

            for (Homeless y : yList) {
                JOptionPane.showMessageDialog(null, "Name: " + y.getName() + "\n Date of Birth: " + y.getDob() + "\n Home Status: " + y.gethStat() + "\n Annual Income: " + y.getAnnIncome() + " Why: " + y.getWhyHomeless());
            }
            qStream.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_showHlbtnActionPerformed

    private void showRentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showRentbtnActionPerformed
        File readRentingFile;
        FileInputStream gStream;
        ObjectInputStream pStream;

        try {
            readRentingFile = new File("Renting.dat");
            gStream = new FileInputStream(readRentingFile);
            pStream = new ObjectInputStream(gStream);

            ArrayList<Renting> zList;
            zList = (ArrayList<Renting>) pStream.readObject();
            
            for(Renting z : zList){
            JOptionPane.showMessageDialog(null, "Name: " + z.getName() + "\n Date of Birth: " + z.getDob() + "\n Home Status: " + z.gethStat() + "\n Annual Income: " + z.getAnnIncome() + "\n Monthly Rent: " + z.getRent());
            }
            pStream.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_showRentbtnActionPerformed

    private void saverbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saverbtnActionPerformed
        // TODO add your handling code here:
        
        File RentingFile;
        FileOutputStream gStream;
        ObjectOutputStream pStream;

        try {
            RentingFile = new File("Renting.dat");
            gStream = new FileOutputStream(RentingFile);
            pStream = new ObjectOutputStream(gStream);

            pStream.writeObject(rentlist);
            
            JOptionPane.showMessageDialog(null, "object written successfully");
            
            pStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_saverbtnActionPerformed

    private void savehobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savehobtnActionPerformed
        // TODO add your handling code here:
        File OwnerFile;
        FileOutputStream fStream;
        ObjectOutputStream oStream;

        try {
            OwnerFile = new File("Owner.dat");
            fStream = new FileOutputStream(OwnerFile);
            oStream = new ObjectOutputStream(fStream);

            oStream.writeObject(ownerlist);
            
            JOptionPane.showMessageDialog(null, "object written successfully");
            
            oStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_savehobtnActionPerformed

    private void savehlbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savehlbtnActionPerformed
        // TODO add your handling code here:
        File HomelessFile;
        FileOutputStream hStream;
        ObjectOutputStream qStream;

        try {
            HomelessFile = new File("Homeless.dat");
            hStream = new FileOutputStream(HomelessFile);
            qStream = new ObjectOutputStream(hStream);

            qStream.writeObject(lesslist);

            JOptionPane.showMessageDialog(null, "object written successfully");

            qStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_savehlbtnActionPerformed

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
            java.util.logging.Logger.getLogger(HomesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomesGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDetailsBtn;
    private javax.swing.JLabel annIncomelbl;
    private javax.swing.JTextField annIncometf;
    private javax.swing.JLabel doblbl;
    private javax.swing.JTextField dobtf;
    private javax.swing.JButton homelessbtn;
    private javax.swing.JLabel homeslbl;
    private javax.swing.JLabel mStatlbl;
    private javax.swing.JTextField mStattf;
    private javax.swing.JLabel namelbl;
    private javax.swing.JTextField nametf;
    private javax.swing.JButton ownerbtn;
    private javax.swing.JLabel pplInHouselbl;
    private javax.swing.JTextField pplInHousetf;
    private javax.swing.JButton rentingbtn;
    private javax.swing.JLabel rentlbl;
    private javax.swing.JTextField renttf;
    private javax.swing.JButton savehlbtn;
    private javax.swing.JButton savehobtn;
    private javax.swing.JButton saverbtn;
    private javax.swing.JButton showHlbtn;
    private javax.swing.JButton showHobtn;
    private javax.swing.JButton showRentbtn;
    private javax.swing.JLabel whylbl;
    private javax.swing.JTextField whytf;
    // End of variables declaration//GEN-END:variables
}

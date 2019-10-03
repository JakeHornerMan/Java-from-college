/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author x16312261
 */
public class EmployeeGUI extends javax.swing.JFrame {
    Employee e;
    Employee log[] = new Employee[100];
    int count;
    String name;
    String id;
    String DOB;
    double salary;
    double rate;
    double hours;
    
    ArrayList<Employee> employee = new ArrayList();
    /**
     * Creates new form EmployeeGUI
     */
    public EmployeeGUI() {
        initComponents();
        rateLbl.setVisible(false);
        rateTF.setVisible(false);
        hoursLbl.setVisible(false);
        hoursTF.setVisible(false);
        salaryLbl.setVisible(false);
        salaryTF.setVisible(false);
        count = 2;
        readFromFile();
        
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
        nameLbl = new javax.swing.JLabel();
        idLbl = new javax.swing.JLabel();
        DOBLbl = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        idTF = new javax.swing.JTextField();
        DOBTF = new javax.swing.JTextField();
        rateLbl = new javax.swing.JLabel();
        hoursLbl = new javax.swing.JLabel();
        salaryLbl = new javax.swing.JLabel();
        rateTF = new javax.swing.JTextField();
        hoursTF = new javax.swing.JTextField();
        salaryTF = new javax.swing.JTextField();
        printBtn = new javax.swing.JButton();
        computeWPayBtn = new javax.swing.JButton();
        floorStaffBtn = new javax.swing.JButton();
        managerBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Employee Application");

        nameLbl.setText("Name:");

        idLbl.setText("ID:");

        DOBLbl.setText("DOB:");

        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });

        idTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTFActionPerformed(evt);
            }
        });

        rateLbl.setText("Rate:");

        hoursLbl.setText("Hours:");

        salaryLbl.setText("Salary:");

        rateTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateTFActionPerformed(evt);
            }
        });

        hoursTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoursTFActionPerformed(evt);
            }
        });

        salaryTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryTFActionPerformed(evt);
            }
        });

        printBtn.setText("Print");
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });

        computeWPayBtn.setText("Compute Weekly Pay");
        computeWPayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeWPayBtnActionPerformed(evt);
            }
        });

        floorStaffBtn.setText("Floor Staff");
        floorStaffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floorStaffBtnActionPerformed(evt);
            }
        });

        managerBtn.setText("Manager");
        managerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerBtnActionPerformed(evt);
            }
        });

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(printBtn)
                            .addComponent(idLbl))
                        .addGap(37, 37, 37)
                        .addComponent(computeWPayBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hoursLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hoursTF, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salaryLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salaryTF, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(nameLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameTF))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rateLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(DOBLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idTF)
                                    .addComponent(DOBTF, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(floorStaffBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(addBtn))
                            .addComponent(managerBtn))))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(floorStaffBtn))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLbl)
                            .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DOBLbl)
                            .addComponent(DOBTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(managerBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rateLbl)
                    .addComponent(rateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoursLbl)
                    .addComponent(hoursTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salaryTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salaryLbl))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printBtn)
                    .addComponent(computeWPayBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rateTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rateTFActionPerformed

    private void salaryTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryTFActionPerformed

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTFActionPerformed

    private void idTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTFActionPerformed

    private void hoursTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoursTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hoursTFActionPerformed

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
        // TODO add your handling code here:
        if (e instanceof FloorStaff){
        String name = nameTF.getText();
        String id = idTF.getText();
        String DOB = DOBTF.getText();
        double rate = Double.parseDouble(rateTF.getText());
        double hours = Double.parseDouble(hoursTF.getText());
        
        e.setName(name);
        e.setId(id);
        e.setDOB(DOB);
        ((FloorStaff)e).setRate(rate);
        ((FloorStaff)e).setHours(hours);
        
        String output = e.printDetails();
        JOptionPane.showMessageDialog(null,output);
    }
        if (e instanceof Manager){
        String name = nameTF.getText();
        String id = idTF.getText();
        String DOB = DOBTF.getText();
        double salary = Double.parseDouble(salaryTF.getText());
        //double hours = Double.parseDouble(hoursTF.getText());
        
        e.setName(name);
        e.setId(id);
        e.setDOB(DOB);
        ((Manager)e).setSalary(salary);
        //((FloorStaff)e).setHours(hours);
        /*
        String output = e.printDetails();
        JOptionPane.showMessageDialog(null,output);
        */
        for(Employee e:employee){
            JOptionPane.showMessageDialog(null, e.printDetails());
        }
    }
    }//GEN-LAST:event_printBtnActionPerformed

    private void computeWPayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeWPayBtnActionPerformed
        // TODO add your handling code here:
        if (e instanceof FloorStaff){
            e.setName(nameTF.getText());
            e.setDOB(DOBTF.getText());
            e.setId(idTF.getText());
            ((FloorStaff)e).setHours(Double.parseDouble(hoursTF.getText()));
            ((FloorStaff)e).setRate(Double.parseDouble(rateTF.getText()));
            
            e.computeWPay();
            
            JOptionPane.showMessageDialog(null,((FloorStaff)e).getWPay());
        }
        
        if (e instanceof Manager){
            e.setName(nameTF.getText());
            e.setDOB(DOBTF.getText());
            e.setId(idTF.getText());
            ((Manager)e).setSalary(Double.parseDouble(salaryTF.getText()));
            
            e.computeWPay();
            
            JOptionPane.showMessageDialog(null, ((Manager)e).getWPay());
        }
    }//GEN-LAST:event_computeWPayBtnActionPerformed

    private void floorStaffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floorStaffBtnActionPerformed
        // TODO add your handling code here:
        rateLbl.setVisible(true);
        rateTF.setVisible(true);
        hoursLbl.setVisible(true);
        hoursTF.setVisible(true);
        salaryLbl.setVisible(false);
        salaryTF.setVisible(false);
        e = new FloorStaff();
    }//GEN-LAST:event_floorStaffBtnActionPerformed

    private void managerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerBtnActionPerformed
        // TODO add your handling code here:
        salaryLbl.setVisible(true);
        salaryTF.setVisible(true);
        rateLbl.setVisible(false);
        rateTF.setVisible(false);
        hoursLbl.setVisible(false);
        hoursTF.setVisible(false);
        e = new Manager();
    }//GEN-LAST:event_managerBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        if(e instanceof Manager){
            name = nameTF.getText();
            id = idTF.getText();
            DOB = DOBTF.getText();
            salary = Double.parseDouble(salaryTF.getText());
            
            e.setName(name);
            e.setId(id);
            e.setDOB(DOB);
            ((Manager)e).setSalary(salary);
           
            /*
            log[count]=e;
            count++;
            */
            
            employee.add(e);
        }
        if(e instanceof FloorStaff){
            name = nameTF.getText();
            id=idTF.getText();
            DOB=DOBTF.getText();
            rate=Double.parseDouble(rateTF.getText());
            hours=Double.parseDouble(hoursTF.getText());
            
            e.setName(name);
            e.setId(id);
            e.setDOB(DOB);
            ((FloorStaff) e).setRate(rate);
            ((FloorStaff)e).setHours(hours);
            
            /*
            log[count]=e;
            count++;*/
            employee.add(e);
        }
        writeToFile();
    }//GEN-LAST:event_addBtnActionPerformed
    
    public void writeToFile(){
        try{
            //Declare and Create objects for output
            File f = new File("output.dat");//create and declare File object
            FileOutputStream fStream = new FileOutputStream(f);
            ObjectOutputStream oStream = new ObjectOutputStream(fStream);
            oStream.writeObject(log);
            //close the output Stream
            oStream.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
    public void readFromFile(){
        try{
            File f = new File("output.dat");
            FileInputStream fStream = new FileInputStream(f);
            ObjectInputStream oStream = new ObjectInputStream(fStream);
            log = (Employee[])oStream.readObject();
            oStream.close();
        }
        catch(IOException|ClassNotFoundException ex){
            System.out.println(ex);
        }
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
            java.util.logging.Logger.getLogger(EmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DOBLbl;
    private javax.swing.JTextField DOBTF;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton computeWPayBtn;
    private javax.swing.JButton floorStaffBtn;
    private javax.swing.JLabel hoursLbl;
    private javax.swing.JTextField hoursTF;
    private javax.swing.JLabel idLbl;
    private javax.swing.JTextField idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton managerBtn;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton printBtn;
    private javax.swing.JLabel rateLbl;
    private javax.swing.JTextField rateTF;
    private javax.swing.JLabel salaryLbl;
    private javax.swing.JTextField salaryTF;
    // End of variables declaration//GEN-END:variables
}
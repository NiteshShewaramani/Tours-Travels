/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerLeads;

import Classdoc.DBConnection;
import java.sql.SQLException;

/**
 *
 * @author Neeraj
 */
public class PassportLead extends javax.swing.JPanel {

    /**
     * Creates new form PassportLead
     */
    public PassportLead(int n,String user,String name)
    {
        this();
        lead=n;
    }
    public PassportLead() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel47 = new javax.swing.JLabel();
        cbFor = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNotes = new javax.swing.JTextArea();
        txtPassonTo = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnSignup10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(51, 51, 51));
        jLabel47.setText("Person to");
        add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, -1, -1));

        cbFor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cbFor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 330, 30));

        jLabel48.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(51, 51, 51));
        jLabel48.setText("For");
        add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        jLabel49.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(51, 51, 51));
        jLabel49.setText("Notes");
        add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        jLabel50.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(51, 51, 51));
        jLabel50.setText("Status");
        add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, -1));

        txtNotes.setColumns(20);
        txtNotes.setRows(5);
        jScrollPane1.setViewportView(txtNotes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 330, 140));
        add(txtPassonTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 330, -1));
        add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 330, -1));

        jPanel2.setBackground(new java.awt.Color(54, 33, 89));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSignup10.setText("Save");
        btnSignup10.setBackground(new java.awt.Color(255, 255, 255));
        btnSignup10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnSignup10.setForeground(new java.awt.Color(255, 255, 255));
        btnSignup10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignup10MouseClicked(evt);
            }
        });
        jPanel2.add(btnSignup10, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 11, -1, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 100, 40));

        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 130, 20));
    }// </editor-fold>//GEN-END:initComponents
int lead;
    String p_for,notes,status,passonto;
    private void btnSignup10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignup10MouseClicked
        // TODO add your handling code here:
        jPanel2MouseClicked(null);
    }//GEN-LAST:event_btnSignup10MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        p_for=cbFor.getSelectedItem().toString();
        notes=txtNotes.getText();
        status=txtStatus.getText();
        passonto=txtPassonTo.getText();
        
        if(notes.length()==0)
        {
        jLabel1.setText("Enter notes");
        return;
        }
        
        jLabel1.setText("");
        
        String sql=String.format("insert into passport_lead values(%s,'%s','%s','%s','%s')",lead, p_for,notes,status,passonto);
        System.out.println(sql);
        try{
        int result=DBConnection.executeUpdate(sql);
        if(result<0)
        {
            System.out.println("something went wrong in passport lead");
            return;
        }
        jLabel1.setText("Saved");
        }
        catch(SQLException e)
        {
           System.out.println(e+"in passport lead");
        }
        
    }//GEN-LAST:event_jPanel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnSignup10;
    private javax.swing.JComboBox<String> cbFor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtNotes;
    private javax.swing.JTextField txtPassonTo;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}

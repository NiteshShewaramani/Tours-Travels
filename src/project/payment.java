
package project;
import Classdoc.DBConnection;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class payment extends javax.swing.JPanel {

    /**
     * Creates new form payment
     */
    public payment(String user,Dimension dim) {
        initComponents();
        jPanel2.setVisible(false);
        this.setSize(dim);
        txtuser.setText(""+user);
        ccb.addItem("");
        addCustomer();
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ccb = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbm = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtcid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnsearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        txtuser = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Customername");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        ccb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ccbItemStateChanged(evt);
            }
        });
        jPanel2.add(ccb, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 100, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Customermobile");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jPanel2.add(cbm, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 100, -1));

        jButton1.setBackground(new java.awt.Color(54, 33, 89));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 400, 160));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Customerid");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        txtcid.setBackground(new java.awt.Color(240, 240, 240));
        txtcid.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.add(txtcid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 110, -1));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Don't Know");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, 20));

        btnsearch.setBackground(new java.awt.Color(54, 33, 89));
        btnsearch.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel3.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, 120));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoiceno", "Invoicedate", "Paymentdate", "PaymentType", "Referenceno", "AmountPaid", "Discount", "GST", "Totalamount", "Balance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 920, 160));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Customer A/C");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Account no");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("User");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.setText("05632100001472");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 100, -1));

        txtuser.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 100, -1));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 100, -1));

        jButton2.setBackground(new java.awt.Color(54, 33, 89));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Close Tab");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 370, -1, -1));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1029, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
Connection con =null;
 ResultSet  rs= null ;
 Statement st=null;
String sql;
    private void ccbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ccbItemStateChanged
 cbm.removeAllItems();
 addCustomerMobile(ccb.getSelectedItem().toString());
    }//GEN-LAST:event_ccbItemStateChanged

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
jPanel2.setVisible(true);
 jPanel3.setVisible(false);

 
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
addCustomerID();
jPanel3.setVisible(true);
jPanel2.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
DefaultTableModel t1=(DefaultTableModel)jTable1.getModel(); 
 String b,c,d,e;
 int a;
 double f,g,h,i,j;
try
{
    
//    Class.forName("java.sql.Driver");
//      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/accountsoft", "root", "1234");
//      st=con.createStatement(); 
      sql="Select * from payment where cid ='"+txtcid.getText()+"';";
 ResultSet rs1=DBConnection.executeQuery(sql);
      System.out.println(""+sql);
while(rs1.next())
{
a=rs1.getInt("invoiceno");
b=rs1.getDate("invoicedate").toString();
c=rs1.getDate("paymentdate").toString();
d=rs1.getString("paymenttype");
e=rs1.getString("referenceno");
f=rs1.getDouble("amountpaid");
g=rs1.getDouble("discount");
h=rs1.getDouble("tax");
i=rs1.getDouble("actualamount");
j=rs1.getDouble("balance");
t1.addRow(new Object[]{a,b,c,d,e,f,g,h,i,j});
}
}
catch(Exception ex)
{
    JOptionPane.showMessageDialog(this,ex);
    System.out.println("erroe msg"+ex.getMessage());
}
//        fetch();
    }//GEN-LAST:event_btnsearchActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
DefaultTableModel t1=(DefaultTableModel)jTable1.getModel(); 
int a=jTable1.getSelectedRow();
String h=t1.getValueAt(a, 0).toString();
 // NewDashBoard.removeTab(this);
  // NewDashBoard.newPay(h);

        System.out.println(""+a); 
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsearch;
    private javax.swing.JComboBox<String> cbm;
    private javax.swing.JComboBox<String> ccb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txtcid;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables

public void addCustomer()
    {
 
        sql="select cname from customer_details";
        System.out.println(sql);
        try{
        ResultSet rs=DBConnection.executeQuery(sql);
        while(rs.next())
        {
           ccb.addItem(rs.getString("cname"));
        }
        }
        catch(SQLException e)
        {
            System.out.println("railway sqlexception constructor");
        }
    }

    public void addCustomerMobile(String name)
{
        sql=String.format("Select mobile_no from customer_details where cname='%s'",name);
        System.out.println("mobile = "+sql);
        try{
            ResultSet rs=DBConnection.executeQuery(sql);
            while(rs.next())
            {
                cbm.addItem(rs.getString("mobile_no"));
            }
        }
        catch(SQLException e)
        {
            System.out.println("sqlexception in addcustomer mobile method railway"+e.getMessage());
        }

}
public void addCustomerID()
{
    sql=String.format("Select cid from customer_details where cname='%s' and mobile_no='%s'", ccb.getSelectedItem().toString(),cbm.getSelectedItem().toString());
    System.out.println(sql);
    try{
        ResultSet rs=DBConnection.executeQuery(sql);
        if(rs.next())
        {
            txtcid.setText(rs.getString("cid"));
        }
    }
    catch(SQLException e)
    {
        System.out.println("railway getcustomerid sqlexception");
    }
}
}


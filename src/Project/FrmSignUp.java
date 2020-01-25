
package Project;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Date;

public class FrmSignUp extends javax.swing.JFrame {


    public FrmSignUp() {
        initComponents();
        
        lblUname1.setText("");
        lblRpwd1.setText("");

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnSubmit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblSignupfirst = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        lblUsername = new javax.swing.JLabel();
        txtUname = new javax.swing.JTextField();
        lblUname1 = new javax.swing.JLabel();
        lblPwd = new javax.swing.JLabel();
        txtPwd = new javax.swing.JPasswordField();
        lblRpwd = new javax.swing.JLabel();
        txtRpwd = new javax.swing.JPasswordField();
        lblRpwd1 = new javax.swing.JLabel();
        jXPanel2 = new org.jdesktop.swingx.JXPanel();
        lblGender = new javax.swing.JLabel();
        rdbMale = new javax.swing.JRadioButton();
        rdbFemale = new javax.swing.JRadioButton();
        lblDob = new javax.swing.JLabel();
        jDC = new org.jdesktop.swingx.JXDatePicker();
        lblName = new javax.swing.JLabel();
        txtFirst = new javax.swing.JTextField();
        txtLast = new javax.swing.JTextField();
        lblMobile = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jXPanel3 = new org.jdesktop.swingx.JXPanel();
        cbxCity = new javax.swing.JComboBox();
        lblCity = new javax.swing.JLabel();
        lblStreet = new javax.swing.JLabel();
        cbxStreet = new javax.swing.JComboBox();
        cbxStop = new javax.swing.JComboBox();
        cbxRegion = new javax.swing.JComboBox();
        lblRegion = new javax.swing.JLabel();
        lblStop = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        lblSignupfirst.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblSignupfirst.setText("Sign Up");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jXPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Account Details"));

        lblUsername.setText("Username:");

        txtUname.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtUnameCaretUpdate(evt);
            }
        });
        txtUname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUnameFocusLost(evt);
            }
        });
        txtUname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnameActionPerformed(evt);
            }
        });

        lblPwd.setText("Password:");

        lblRpwd.setText("Re-Type Password:");

        txtRpwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRpwdFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jXPanel1Layout = new javax.swing.GroupLayout(jXPanel1);
        jXPanel1.setLayout(jXPanel1Layout);
        jXPanel1Layout.setHorizontalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRpwd)
                    .addComponent(lblPwd)
                    .addComponent(lblUsername))
                .addGap(29, 29, 29)
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jXPanel1Layout.createSequentialGroup()
                        .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUname)
                            .addComponent(txtPwd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUname1)
                            .addComponent(lblRpwd1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jXPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblRpwd1, lblUname1, txtPwd, txtRpwd, txtUname});

        jXPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblPwd, lblRpwd, lblUsername});

        jXPanel1Layout.setVerticalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jXPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jXPanel1Layout.createSequentialGroup()
                        .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsername))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPwd)))
                    .addGroup(jXPanel1Layout.createSequentialGroup()
                        .addComponent(lblUname1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRpwd1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRpwd)
                    .addComponent(txtRpwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jXPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblPwd, lblRpwd, lblRpwd1, lblUname1, lblUsername, txtPwd, txtRpwd, txtUname});

        jXPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Personal Details"));

        lblGender.setText("Gender:");

        buttonGroup1.add(rdbMale);
        rdbMale.setText("Male");

        buttonGroup1.add(rdbFemale);
        rdbFemale.setText("Female");

        lblDob.setText("Date Of Birth :");

        lblName.setText("Name:");

        txtFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstActionPerformed(evt);
            }
        });

        txtLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastActionPerformed(evt);
            }
        });

        lblMobile.setText("Mobile Number:");

        lblEmail.setText("Email-Id :");

        javax.swing.GroupLayout jXPanel2Layout = new javax.swing.GroupLayout(jXPanel2);
        jXPanel2.setLayout(jXPanel2Layout);
        jXPanel2Layout.setHorizontalGroup(
            jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jXPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblGender)
                            .addComponent(lblDob)))
                    .addGroup(jXPanel2Layout.createSequentialGroup()
                        .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMobile)
                            .addComponent(lblEmail))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jXPanel2Layout.createSequentialGroup()
                            .addComponent(jDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXPanel2Layout.createSequentialGroup()
                            .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jXPanel2Layout.createSequentialGroup()
                                    .addComponent(rdbMale)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rdbFemale))
                                .addGroup(jXPanel2Layout.createSequentialGroup()
                                    .addComponent(txtFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtLast, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(121, 121, 121)))
                    .addGroup(jXPanel2Layout.createSequentialGroup()
                        .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(168, 168, 168))))
        );

        jXPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jDC, rdbFemale, rdbMale, txtFirst, txtLast, txtMobile});

        jXPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblDob, lblEmail, lblGender, lblMobile, lblName});

        jXPanel2Layout.setVerticalGroup(
            jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(rdbMale)
                    .addComponent(rdbFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDob)
                    .addComponent(jDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMobile)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jXPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jDC, lblDob, lblEmail, lblGender, lblMobile, lblName, rdbFemale, rdbMale, txtEmail, txtFirst, txtLast, txtMobile});

        jXPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Address Details"));

        cbxCity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pune" }));
        cbxCity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbxCityFocusLost(evt);
            }
        });
        cbxCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCityActionPerformed(evt);
            }
        });

        lblCity.setText("City:");

        lblStreet.setText("Street:");

        cbxStreet.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbxStreetFocusLost(evt);
            }
        });
        cbxStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxStreetActionPerformed(evt);
            }
        });

        cbxStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxStopActionPerformed(evt);
            }
        });

        cbxRegion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbxRegionFocusLost(evt);
            }
        });
        cbxRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxRegionActionPerformed(evt);
            }
        });

        lblRegion.setText("Region:");

        lblStop.setText("Stop:");

        javax.swing.GroupLayout jXPanel3Layout = new javax.swing.GroupLayout(jXPanel3);
        jXPanel3.setLayout(jXPanel3Layout);
        jXPanel3Layout.setHorizontalGroup(
            jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStreet)
                    .addComponent(lblCity))
                .addGap(18, 18, 18)
                .addGroup(jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCity, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jXPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblStop))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRegion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxRegion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxStop, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jXPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbxCity, cbxRegion, cbxStop, cbxStreet});

        jXPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCity, lblRegion, lblStop, lblStreet});

        jXPanel3Layout.setVerticalGroup(
            jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegion)
                    .addComponent(cbxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStop)
                    .addComponent(cbxStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxStop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStreet))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jXPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxCity, cbxRegion, cbxStop, cbxStreet, lblCity, lblRegion, lblStop, lblStreet});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(lblSignupfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jXPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jXPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jXPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSubmit)
                .addGap(46, 46, 46)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblSignupfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnClear)
                    .addComponent(btnSubmit))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        try{
        Connect c1=new Connect();
        DBCollection dbc=c1.connectAccount();
        BasicDBObject bdb=new BasicDBObject();
        String pwd;
        String rpwd;
        String city=cbxCity.getSelectedItem().toString();
        String first=txtFirst.getText();
        String last=txtLast.getText();
        String email=txtEmail.getText();
        String mobile=txtMobile.getText();
        String region=cbxRegion.getSelectedItem().toString();
        Date dob = jDC.getDate();
        pwd=new String(txtPwd.getPassword());
        rpwd=new String(txtRpwd.getPassword());
       // String stop=cbxStop.getSelectedItem().toString();
        String street=cbxStreet.getSelectedItem().toString();
        String uname=txtUname.getText();
        String gender=null; 
        if(rdbMale.isSelected())
            {
            gender=rdbMale.getText();
            }
        else
            {
            gender=rdbFemale.getText();
            }
        
        /*DBCursor cursor=dbc.find();
        while(cursor.hasNext())
        {
            DBObject obj=cursor.next();
           String user= obj.get("username").toString();
        if( uname.equals(user))
        {
          lblUnameT.setVisible(true);
        }
        }*/

        bdb.put("fname",first);
        bdb.put("lname",last);
        bdb.put("username",uname);
        bdb.put("password",pwd);
        bdb.put("dob",dob);
        bdb.put("mobile",mobile);
        bdb.put("email",email);
        bdb.put("gender",gender);
        bdb.put("city",city);
        bdb.put("region",region);
        bdb.put("street",street);

        //bdb.put("stop",stop);
        dbc.insert(bdb);
        
        FrmWelcome f2=new FrmWelcome();
        f2.setVisible(true);
        this.setVisible(false);}
        catch(Exception e){}
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        
        cbxRegion.removeAllItems();
        txtFirst.setText("");
        txtLast.setText("");
      
        cbxStreet.removeAllItems();
        txtPwd.setText("");
        txtRpwd.setText("");
        cbxCity.removeAllItems();
        cbxCity.addItem("Pune");
        cbxStreet.removeAllItems();
        txtUname.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        FrmWelcome f1=new FrmWelcome();
        f1.setVisible(true);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtUnameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtUnameCaretUpdate
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtUnameCaretUpdate
     
    private void txtUnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUnameFocusLost
        // TODO add your handling code here:
        
        Connect c1=new Connect();
        DBCollection dbc=c1.connectAccount();
        
        BasicDBObject dbd=new BasicDBObject();
        
       
        DBCursor cursor=dbc.find();
        String uname=txtUname.getText();
        while(cursor.hasNext())
        {
            DBObject obj=cursor.next();
            
            if(uname.equals((String) obj.get("username")))
            {
               lblUname1.setText("Username Taken!!");
               break;
            }
            
            else
            {
              lblUname1.setText("Username Available!!");
            }
        }
    }//GEN-LAST:event_txtUnameFocusLost

    private void txtUnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnameActionPerformed

    private void txtRpwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRpwdFocusLost
        // TODO add your handling code here:
      
        String pass=new String(txtPwd.getPassword());
        String rpwd23=new String(txtRpwd.getPassword());
            
        
            if(pass.equals(rpwd23))
            {
              lblRpwd1.setText("Password Verified!!");
         
            }
            
            if(!pass.equals(rpwd23))
            {
               lblRpwd1.setText("Password Wrong!!");
            }
            
            
        
    }//GEN-LAST:event_txtRpwdFocusLost

    private void txtLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastActionPerformed

    private void cbxCityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbxCityFocusLost
        // TODO add your handling code here:
        Connect c1=new Connect();
        DBCollection dbc=c1.connectRegion();
        BasicDBObject bdb=new BasicDBObject();
        DBCursor cursor=dbc.find();
        while(cursor.hasNext())
        {
            DBObject obj=cursor.next();
            String region=obj.get("name").toString();
            cbxRegion.addItem(region);
        }
    }//GEN-LAST:event_cbxCityFocusLost

    private void cbxCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCityActionPerformed

    private void cbxRegionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbxRegionFocusLost
        // TODO add your handling code here:
        String selected=cbxRegion.getSelectedItem().toString();
        Connect c1=new Connect();
        DBCollection dbc=c1.connectStreet(selected);
        BasicDBObject bdb=new BasicDBObject();
        DBCursor cursor=dbc.find();
        while(cursor.hasNext())
        {
            DBObject obj=cursor.next();
            String street=obj.get("name").toString();
            cbxStreet.addItem(street);
        }
    }//GEN-LAST:event_cbxRegionFocusLost

    private void cbxRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxRegionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxRegionActionPerformed

    private void cbxStreetFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbxStreetFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_cbxStreetFocusLost

    private void cbxStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxStreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxStreetActionPerformed

    private void cbxStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxStopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxStopActionPerformed

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
            java.util.logging.Logger.getLogger(FrmSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbxCity;
    private javax.swing.JComboBox cbxRegion;
    private javax.swing.JComboBox cbxStop;
    private javax.swing.JComboBox cbxStreet;
    private org.jdesktop.swingx.JXDatePicker jDC;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXPanel jXPanel2;
    private org.jdesktop.swingx.JXPanel jXPanel3;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblMobile;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblRegion;
    private javax.swing.JLabel lblRpwd;
    private javax.swing.JLabel lblRpwd1;
    private javax.swing.JLabel lblSignupfirst;
    private javax.swing.JLabel lblStop;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblUname1;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JRadioButton rdbFemale;
    private javax.swing.JRadioButton rdbMale;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirst;
    private javax.swing.JTextField txtLast;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JPasswordField txtRpwd;
    private javax.swing.JTextField txtUname;
    // End of variables declaration//GEN-END:variables
}

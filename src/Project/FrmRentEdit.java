/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Project;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */
public class FrmRentEdit extends javax.swing.JFrame {

    /**
     * Creates new form FrmRentEdit
     */
    public FrmRentEdit() {
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

        btnHome = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jxTable = new org.jdesktop.swingx.JXTable();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Renting Options");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jxTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jxTable.setEditable(false);
        jScrollPane1.setViewportView(jxTable);

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
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
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRefresh)
                        .addGap(0, 334, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnHome)
                    .addComponent(btnRefresh))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int i = jxTable.getSelectedRow();
        System.out.println( "Column Name:"+ jxTable.getColumnName(1));
        String u =(String)jxTable.getValueAt(i, 1);
        System.out.println(u);
        Connect c1=new Connect();
        DBCollection dbc1=c1.connectRent();
        BasicDBObject bdb1=new BasicDBObject("unique",u);          
        dbc1.remove(bdb1); 
        btnRefreshActionPerformed(evt);
 //TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        FrmHomepage f1 = new FrmHomepage();
        f1.setVisible(rootPaneCheckingEnabled);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

        FrmRentCar f4 = new FrmRentCar();
        FrmWelcome f3 = new FrmWelcome();
        String curUser = f3.getUser();
        String curId = ""+f4.getRentNo();
        curId.trim();
        Connect c=new Connect();
        DBCollection dbc=c.connectRent();
        BasicDBObject bdb=new BasicDBObject();
          String[] columnNames = {"Id","Name","User","From City","From Region","From Street","From Stop","To City","To Region","To Street","To Stop","Driver","Car","Time","Date"};
        DefaultTableModel dtm = new DefaultTableModel(columnNames,0);
        DBCursor cursor=dbc.find();
        while(cursor.hasNext())
        {
            DBObject obj = cursor.next();
            String fregion   =(String)obj.get("fregion");
            String fstreet   =(String)obj.get("fstreet");
            String fstop     =(String)obj.get("fstop");
            String fcity     =(String)obj.get("fcity");
            String tregion   =(String)obj.get("fregion");
            String tstreet   =(String)obj.get("fstreet");
            String tstop     =(String)obj.get("fstop");
            String tcity     =(String)obj.get("fcity");

            String driver   =(String)obj.get("driver");
            String car      =(String)obj.get("car");
            String time     =(String)obj.get("time");
            String date     =(String)obj.get("date");
            String user     =(String)obj.get("user");
            String id       =(String)obj.get("id");
            String unique   =(String)obj.get("unique");
            if(curUser.equals(user) )
                {
                dtm.addRow(new Object[]{id,unique,user,fcity,fregion,fstreet,fstop,tcity,tregion,tstreet,tstop,driver,car,time,date});
                }
            jxTable.setModel(dtm);
        
        }
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
// TODO add your handling code here:
         System.out.println("In Refresh Button");
        FrmRentCar f4 = new FrmRentCar();
        FrmWelcome f3 = new FrmWelcome();
        String curUser = f3.getUser();
        String curId = ""+f4.getRentNo();
        curId.trim();
        jxTable.updateUI();
        jxTable.removeAll();
        jxTable.repaint();
         System.out.println("Table deleted");
        Connect c=new Connect();
        DBCollection dbc=c.connectRent();
        BasicDBObject bdb=new BasicDBObject();
        String[] columnNames = {"Id","Name","User","From City","From Region","From Street","From Stop","To City","To Region","To Street","To Stop","Driver","Car","Time","Date"};
        DefaultTableModel dtm = new DefaultTableModel(columnNames,0);
        DBCursor cursor=dbc.find();
        while(cursor.hasNext())
        {
            DBObject obj = cursor.next();
            String fregion   =(String)obj.get("fregion");
            String fstreet   =(String)obj.get("fstreet");
            String fstop     =(String)obj.get("fstop");
            String fcity     =(String)obj.get("fcity");
            String tregion   =(String)obj.get("fregion");
            String tstreet   =(String)obj.get("fstreet");
            String tstop     =(String)obj.get("fstop");
            String tcity     =(String)obj.get("fcity");

            String driver   =(String)obj.get("driver");
            String car      =(String)obj.get("car");
            String time     =(String)obj.get("time");
            String date     =(String)obj.get("date");
            String user     =(String)obj.get("user");
            String id       =(String)obj.get("id");
            String unique   =(String)obj.get("unique");
            if(curUser.equals(user) )
                {
                dtm.addRow(new Object[]{id,unique,user,fcity,fregion,fstreet,fstop,tcity,tregion,tstreet,tstop,driver,car,time,date});
                }
            jxTable.setModel(dtm);
        }
        jxTable.updateUI();
        System.out.println("Out Of While");
        this.setVisible(false);
        FrmRentEdit f5= new FrmRentEdit();
        f5.setVisible(true);

    }//GEN-LAST:event_btnRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRentEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRentEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRentEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRentEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRentEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXTable jxTable;
    // End of variables declaration//GEN-END:variables
}

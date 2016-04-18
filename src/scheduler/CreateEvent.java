/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ayomitunde
 */
public class CreateEvent extends javax.swing.JFrame {

    public String[] months = new String[]{"null", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    static final String[] users = {"Users"};
    static DefaultTableModel _userModel = new DefaultTableModel(users, 100);
    Event newEvent;
    static int _rowCounter = 0;
    

    /**
     * Creates new form CreateEvent
     */
    public CreateEvent() {
        initComponents();
        showUsers();
        
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
        txtEventName = new javax.swing.JTextField();
        jdpDateSelector = new org.jdesktop.swingx.JXDatePicker();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Date date = new Date();
        SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        jspTimeSelector = new javax.swing.JSpinner(sm);
        btnCreateEvent = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cmbPriority = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUserTable = new javax.swing.JTable();
        rbnDept = new javax.swing.JRadioButton();
        txtEventDescr = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setText("Event Title");

        txtEventName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEventNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Event Date");

        jLabel3.setText("Event Time");

        JSpinner.DateEditor de = new JSpinner.DateEditor(jspTimeSelector, "HH:mm:ss");
        jspTimeSelector.setEditor(de);

        btnCreateEvent.setText("Create Event");
        btnCreateEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEventActionPerformed(evt);
            }
        });

        jLabel4.setText("Priority");

        cmbPriority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low", "Medium", "High"}));

        jLabel5.setText("Participants");

        tblUserTable.setModel(_userModel);
        jScrollPane1.setViewportView(tblUserTable);

        rbnDept.setText("Add Department");
        rbnDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnDeptActionPerformed(evt);
            }
        });

        txtEventDescr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEventDescrActionPerformed(evt);
            }
        });

        jLabel6.setText("Description");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(btnCreateEvent))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEventDescr)
                                    .addComponent(txtEventName, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jspTimeSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdpDateSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(rbnDept)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEventName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEventDescr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jdpDateSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jspTimeSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cmbPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbnDept))
                .addGap(31, 31, 31)
                .addComponent(btnCreateEvent)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEventActionPerformed
        // TODO add your handling code here:
        String eventName = txtEventName.getText();
        if("".equals(eventName)){
            JOptionPane.showMessageDialog(null, "Please add an event name", "NAME ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            String eventDescr = txtEventDescr.getText();
        Date eventDate = jdpDateSelector.getDate();
        String time = jspTimeSelector.getValue().toString();
        User creator = GUI._currentUser;
        //time matching for easy access
        String timePattern = "\\d{2}:\\d{2}:\\d{2}";
        Pattern timeP = Pattern.compile(timePattern);
        Matcher m = timeP.matcher(time);
        if (m.find()) {
            time = m.group();
        }
        String date = eventDate.toString();
        String ndate = date.substring(date.indexOf(" ") + 1);
        String Mon = ndate.substring(0, ndate.indexOf(" "));

        String datePattern = "\\w{3} \\d{2}";
        Pattern dateP = Pattern.compile(datePattern);
        m = dateP.matcher(ndate);
        if (m.find()) {
            ndate = m.group();
        }

        for (int i = 0; i < months.length; i++) {
            if (months[i] == null ? Mon == null : months[i].equals(Mon)) {
                if (!ndate.contains(Mon)) {
                } else {
                    ndate = ndate.replace(Mon, String.valueOf(i));
                }
            }
        }
        ndate += date.substring(date.lastIndexOf(" "));
        ndate = ndate.replaceAll(" ", "/");
        // create new event here
        newEvent = new Event(eventName, eventDescr, ndate, time, creator);
        if (GUI._upcomingEventsModel.getRowCount() < 6) {
            GUI._upcomingEventsModel.setValueAt(newEvent.getEventName() + " at " + newEvent.getEventTime(), GUI._upcomingEventsModel.getRowCount(), 0);
        }
        ArrayList<Event> userEvents = GUI._userInfo.get(creator) == null ? new ArrayList<>() : GUI._userInfo.get(creator); // should not be equal null.. check!!
        userEvents.add(newEvent);
        GUI._userInfo.put(creator, userEvents);
        try {
            //GUI._allEvents.add(newEvent);
            dbModel.createEvent(eventName, eventDescr, ndate, time, "low", false, creator.getUsername());
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CreateEvent.class.getName()).log(Level.SEVERE, null, ex);
        }
        getSelectedUsers();
        Serialize.saveUserFiles(Serialize._fileLocation);
        String currentDate = GUI._df.format(GUI._currentDate);
        GUI.updateUpcoming(currentDate);
        GUI.refreshCalendar(GUI._realMonth, GUI._realYear);
        this.setVisible(false);
        }
        
    }//GEN-LAST:event_btnCreateEventActionPerformed

    public boolean deptState() {
        return rbnDept.isSelected();
    }
    private void rbnDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnDeptActionPerformed
        // TODO add your handling code here:
        showUsers();
    }//GEN-LAST:event_rbnDeptActionPerformed

    private void txtEventDescrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEventDescrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEventDescrActionPerformed

    private void txtEventNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEventNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEventNameActionPerformed

    private void getSelectedUsers() {
        try {
            int[] selectedRows = tblUserTable.getSelectedRows();
            for (int i = 0; i < selectedRows.length; i++) {
                Object object = tblUserTable.getValueAt(selectedRows[i], 0);
                String objectSelected = String.valueOf(object);
                if (Arrays.asList(GUI._dept).contains(objectSelected)) {
                    ArrayList<User> departments = GUI._allDepts.get(objectSelected);
                    if (departments != null) {
                        for (Iterator<User> it = departments.iterator(); it.hasNext();) {
                            User deptUser = it.next();
                            newEvent.addAttendee(deptUser.getUsername());
                            try {
                                int userId = dbModel.findId(deptUser.getUsername(), "User");
                                int eventId = dbModel.findId(newEvent.getEventName(), "Event");
                                dbModel.insertUserEvent(userId, eventId);
                            } catch (ClassNotFoundException | SQLException ex) {
                                Logger.getLogger(CreateEvent.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                } else {
                    try {
                        String username = String.valueOf(object);
                        newEvent.addAttendee(username);
                        int userId = dbModel.findId(username, "User");
                        int eventId = dbModel.findId(newEvent.getEventName(), "Event");
                        dbModel.insertUserEvent(userId, eventId);
                    } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(CreateEvent.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            int userId = dbModel.findId(GUI._currentUser.getUsername(), "User");
            int eventId = dbModel.findId(newEvent.getEventName(), "Event");
            dbModel.insertUserEvent(userId, eventId);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CreateEvent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void showDepts() {
        for (String s : GUI._dept) {
            _userModel.setValueAt(s, _rowCounter, 0);
            _rowCounter++;
        }
    }

    private void showUsers() {
        _rowCounter = 0;
        if (rbnDept.isSelected()) {
            showDepts();
        } else {
            //reset
            for (int i = 0; i < 50; i++) {
                _userModel.setValueAt(null, i, 0);
            }
        }
        try {
            dbModel.showUsers(GUI._currentUser.getUsername());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CreateEvent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void run() {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CreateEvent().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateEvent;
    private static javax.swing.JComboBox<String> cmbPriority;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    public static org.jdesktop.swingx.JXDatePicker jdpDateSelector;
    private static javax.swing.JSpinner jspTimeSelector;
    public static javax.swing.JRadioButton rbnDept;
    private static javax.swing.JTable tblUserTable;
    private javax.swing.JTextField txtEventDescr;
    private javax.swing.JTextField txtEventName;
    // End of variables declaration//GEN-END:variables
}

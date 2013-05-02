/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit.panels;

import dit.DEIDGUI;
import java.awt.Component;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author christianprescott & angelo
 */
public class TransferPanel extends javax.swing.JPanel implements WizardPanel{
    private Component[] SaveComponents, FTPComponents;
    public static File tarSaveDir = null;
    public static boolean doSave = true, doFTP = false;
    public static int FTPProtocol = 0, ShareMode = 0, FTPPort = -1;
    public static String FTPServer = "", FTPUser = "";

    /**
     * Creates new form TransferPanel
     */
    public TransferPanel() {
        initComponents();
        jLabel2.setText("Click 'Help' for instructions.");
        DEIDGUI.title = "Transfer Options";
        DEIDGUI.helpButton.setEnabled(true);
        SaveComponents = new Component[] {
            jButtonBrowse, 
            jLabelSaveLocation};
        FTPComponents = new Component[]{
            jLabelFTPProtocol, jComboBoxFTPProtocol,
            jLabelFTPServer, jTextFieldFTPServer, jTextFieldFTPPort,
            jLabelFTPUser, jTextFieldFTPUser,
            jLabelFTPPassword, jPasswordFieldFTPPassword,
        };
                
        jCheckBoxSave.setSelected(doSave);
        for(Component c : SaveComponents){
            c.setEnabled(doSave);
        }
        jCheckBoxFTP.setSelected(doFTP);
        for(Component c : FTPComponents){
            c.setEnabled(doFTP);
        }
        if(tarSaveDir == null){
            jLabelSaveLocation.setText("No save location selected");
        } else {
            jLabelSaveLocation.setText(tarSaveDir.getAbsolutePath());
        }
        jComboBoxFTPProtocol.setSelectedIndex(FTPProtocol);
        jTextFieldFTPServer.setText(FTPServer);
        if(FTPPort < 0){
            jTextFieldFTPPort.setText("Port (optional)");
        } else {
            jTextFieldFTPPort.setText(Integer.toString(FTPPort));
        }
        jTextFieldFTPUser.setText(FTPUser);
        jComboBoxSharing.setSelectedIndex(ShareMode);
        
        DEIDGUI.continueButton.setEnabled(false);
    }

    private boolean ValidateFields(){
        if (jCheckBoxAgree.isSelected() && 
            ((jCheckBoxSave.isSelected() && tarSaveDir!=null ) || jCheckBoxFTP.isSelected())) {
            DEIDGUI.continueButton.setEnabled(true);
            return true;
        } else {
            DEIDGUI.continueButton.setEnabled(false);
            return false;
        }
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
        jLabelSharing = new javax.swing.JLabel();
        jComboBoxSharing = new javax.swing.JComboBox();
        jTextFieldFTPServer = new javax.swing.JTextField();
        jTextFieldFTPPort = new javax.swing.JTextField();
        jTextFieldFTPUser = new javax.swing.JTextField();
        jPasswordFieldFTPPassword = new javax.swing.JPasswordField();
        jCheckBoxAgree = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jCheckBoxSave = new javax.swing.JCheckBox();
        jButtonBrowse = new javax.swing.JButton();
        jLabelSaveLocation = new javax.swing.JLabel();
        jCheckBoxFTP = new javax.swing.JCheckBox();
        jComboBoxFTPProtocol = new javax.swing.JComboBox();
        jLabelFTPProtocol = new javax.swing.JLabel();
        jLabelFTPServer = new javax.swing.JLabel();
        jLabelFTPUser = new javax.swing.JLabel();
        jLabelFTPPassword = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(400, 320));

        jLabel1.setText("<html><p>You have confirmed that the data has been de-identified. Choose how the images will be shared. </p><p>&nbsp;</p></html>");
        jLabel1.setMinimumSize(new java.awt.Dimension(20, 32));

        jLabelSharing.setText("Sharing");

        jComboBoxSharing.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No share", "Enclave", "All share" }));

        jTextFieldFTPServer.setEnabled(false);

        jTextFieldFTPPort.setText("Port (optional)");
        jTextFieldFTPPort.setEnabled(false);
        jTextFieldFTPPort.setMinimumSize(new java.awt.Dimension(103, 28));

        jTextFieldFTPUser.setEnabled(false);

        jPasswordFieldFTPPassword.setToolTipText("Password");
        jPasswordFieldFTPPassword.setEnabled(false);

        jCheckBoxAgree.setText("I agree");
        jCheckBoxAgree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAgreeActionPerformed(evt);
            }
        });

        jLabel3.setText("<html><p>I have inspected the de-identified data and confirmed that no personal health information is present in the de-identified dataset that could be used to identify a participant.</p></html>");
        jLabel3.setMinimumSize(new java.awt.Dimension(20, 32));

        jCheckBoxSave.setSelected(true);
        jCheckBoxSave.setText("Save result on my computer");
        jCheckBoxSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSaveActionPerformed(evt);
            }
        });

        jButtonBrowse.setText("Browse...");
        jButtonBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBrowseActionPerformed(evt);
            }
        });

        jLabelSaveLocation.setText("No save location selected");

        jCheckBoxFTP.setText("Transfer result to a remote location");
        jCheckBoxFTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFTPActionPerformed(evt);
            }
        });

        jComboBoxFTPProtocol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SFTP", "FTPS" }));
        jComboBoxFTPProtocol.setEnabled(false);
        jComboBoxFTPProtocol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFTPProtocolActionPerformed(evt);
            }
        });

        jLabelFTPProtocol.setText("Protocol");
        jLabelFTPProtocol.setEnabled(false);

        jLabelFTPServer.setText("Server");
        jLabelFTPServer.setEnabled(false);

        jLabelFTPUser.setText("User");
        jLabelFTPUser.setEnabled(false);

        jLabelFTPPassword.setText("Password");
        jLabelFTPPassword.setEnabled(false);

        jLabel2.setText("jLabel2");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(6, 6, 6)
                                .add(jLabelSharing)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jComboBoxSharing, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(jLabel2))
                            .add(jCheckBoxSave)
                            .add(layout.createSequentialGroup()
                                .add(29, 29, 29)
                                .add(jButtonBrowse)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabelSaveLocation))
                            .add(jCheckBoxFTP)
                            .add(jCheckBoxAgree))
                        .add(0, 80, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(29, 29, 29)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabelFTPServer)
                            .add(jLabelFTPProtocol)
                            .add(jLabelFTPUser))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(jTextFieldFTPUser)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabelFTPPassword)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPasswordFieldFTPPassword))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(jTextFieldFTPServer)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextFieldFTPPort, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(jComboBoxFTPProtocol, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelSharing)
                    .add(jComboBoxSharing, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2))
                .add(18, 18, 18)
                .add(jCheckBoxSave)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonBrowse)
                    .add(jLabelSaveLocation))
                .add(18, 18, 18)
                .add(jCheckBoxFTP)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jComboBoxFTPProtocol, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelFTPProtocol))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextFieldFTPServer, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldFTPPort, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelFTPServer))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextFieldFTPUser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPasswordFieldFTPPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelFTPUser)
                    .add(jLabelFTPPassword))
                .add(18, 18, 18)
                .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jCheckBoxAgree)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxAgreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAgreeActionPerformed
        ValidateFields();
    }//GEN-LAST:event_jCheckBoxAgreeActionPerformed

    private void jCheckBoxSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSaveActionPerformed
        doSave = jCheckBoxSave.isSelected();
        for(Component c : SaveComponents){
            c.setEnabled(jCheckBoxSave.isSelected());
        }
        ValidateFields();
    }//GEN-LAST:event_jCheckBoxSaveActionPerformed

    private void jCheckBoxFTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFTPActionPerformed
        doFTP = jCheckBoxFTP.isSelected();
        for(Component c : FTPComponents){
            c.setEnabled(jCheckBoxFTP.isSelected());
        }
        ValidateFields();
    }//GEN-LAST:event_jCheckBoxFTPActionPerformed

    private void jButtonBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBrowseActionPerformed
        // Open file browser
        final javax.swing.JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.setMultiSelectionEnabled(false);

        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            if (file.canRead()) {
                tarSaveDir = file;
                jLabelSaveLocation.setText(tarSaveDir.getAbsolutePath());
                ValidateFields();
            } else {
                JOptionPane.showMessageDialog(this, "This directory could not "
                        + "be opened.", "Invalid Save Location",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_jButtonBrowseActionPerformed

    private void jComboBoxFTPProtocolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFTPProtocolActionPerformed
        FTPProtocol = jComboBoxFTPProtocol.getSelectedIndex();
    }//GEN-LAST:event_jComboBoxFTPProtocolActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBrowse;
    private javax.swing.JCheckBox jCheckBoxAgree;
    private javax.swing.JCheckBox jCheckBoxFTP;
    private javax.swing.JCheckBox jCheckBoxSave;
    private javax.swing.JComboBox jComboBoxFTPProtocol;
    private javax.swing.JComboBox jComboBoxSharing;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFTPPassword;
    private javax.swing.JLabel jLabelFTPProtocol;
    private javax.swing.JLabel jLabelFTPServer;
    private javax.swing.JLabel jLabelFTPUser;
    private javax.swing.JLabel jLabelSaveLocation;
    private javax.swing.JLabel jLabelSharing;
    private javax.swing.JPasswordField jPasswordFieldFTPPassword;
    private javax.swing.JTextField jTextFieldFTPPort;
    private javax.swing.JTextField jTextFieldFTPServer;
    private javax.swing.JTextField jTextFieldFTPUser;
    // End of variables declaration//GEN-END:variables

    @Override
    public WizardPanel getNextPanel() {
        if(jCheckBoxSave.isSelected() && tarSaveDir == null){
            JOptionPane.showMessageDialog(this, "You must choose a directory "
                    + "to save the tarball", "Invalid Save Location",
                JOptionPane.ERROR_MESSAGE);
            throw new IllegalStateException("No tarball save directory selected.");
        }
        
        FTPServer = jTextFieldFTPServer.getText().trim();
        try {
            FTPPort = Integer.parseInt(jTextFieldFTPPort.getText());
        } catch (NumberFormatException e) {
            FTPPort = -1;
        }
        FTPUser = jTextFieldFTPUser.getText().trim();
        ShareMode = jComboBoxSharing.getSelectedIndex();
        
        return new TransferProgressPanel(jPasswordFieldFTPPassword);
    }

    @Override
    public WizardPanel getPreviousPanel() {
        return new AuditPanel();
    }
}

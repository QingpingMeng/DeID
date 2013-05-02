/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit.panels;

import dit.DEIDGUI;
import dit.DeidData;

/**
 *
 * @author christianprescott & angelo
 */
public class CompletePanel extends javax.swing.JPanel implements WizardPanel{

    /**
     * Creates new form CompletePanel
     */
    public CompletePanel() {
        initComponents();
        DEIDGUI.title = "Complete";
        DEIDGUI.helpButton.setEnabled(true);
        DEIDGUI.continueButton.setEnabled(false);
        DEIDGUI.cancelButton.setEnabled(false);
        DEIDGUI.backButton.setEnabled(false);        
        if (!DeidData.tarfilesavedpath.equals(""))
        {
            int lg = DeidData.tarfilesavedpath.length();
            if (lg < 70)
                jLabel2.setText("<html><p>The tar file has been saved to </p><div>" + DeidData.tarfilesavedpath+"</div></html>");
            else {
            String str1 = DeidData.tarfilesavedpath.substring(0, 70);
            String str2 = DeidData.tarfilesavedpath.substring(71);
            System.out.println(str1);
            System.out.println(str2);
            jLabel2.setText("<html><p>The tar file has been saved to </p><p>" + str1 +"</p><p>"+ str2 + "</p></html>");
        
                    }
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("Complete");

        jButton1.setText("Done");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 104, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jLabel1)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 500, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(144, 144, 144)
                .add(jButton1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    @Override
    public WizardPanel getNextPanel() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public WizardPanel getPreviousPanel() {
        return new TransferPanel();
    }
}

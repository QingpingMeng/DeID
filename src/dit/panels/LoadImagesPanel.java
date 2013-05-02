package dit.panels;

import dit.*;
import java.io.File;
import java.io.*; 
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import java.util.Vector;
import java.util.List; 
import java.util.ArrayList;
import java.lang.String;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author christianprescott
 */
public class LoadImagesPanel extends JPanel implements WizardPanel {

    /**
     * Creates new form LoadImagesPanel
     */
    public LoadImagesPanel() {
        initComponents();
        DEIDGUI.title = "Load Images";
        DEIDGUI.helpButton.setEnabled(true);
        jButton2.setVisible(false);
        if (DeidData.inputFiles != null) {
           // jListImages.setListData(DeidData.inputFiles);
            DeidData.inputFiles.removeAllElements();
            //DEIDGUI.log("Loaded existing input file list: " + DeidData.inputFiles.toString());
        }
         jListImages.addListSelectionListener(new ListSelectionListener(){
           @Override  public void valueChanged(ListSelectionEvent e){
                 jLabel2.setText(jListImages.getSelectedValues().length+" line(s) selected");
             
             }
         }
                 
                 );
        DEIDGUI.log("LoadImagesPanel initialized");
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
        jButtonLoadImages = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListImages = new javax.swing.JList();
        jButtonRemove = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jLabel1.setText("<html><p>Select images or directories of images to de-identify. Images may be in DICOM, Analyze, or NIfTI format. DICOM and Analyze files will be converted to NIfTI.</p><p>&nbsp;</p></html>");

        jButtonLoadImages.setText("Add images...");
        jButtonLoadImages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadImagesActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jListImages);

        jButtonRemove.setText("Remove selected");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });

        jButton1.setText("Select All");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear All");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("No line is selected.");

        jLabel3.setText("0 images loaded");

        jButton3.setText("Add directories...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane2)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(jButtonLoadImages)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 123, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 207, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(11, 11, 11)
                                .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(layout.createSequentialGroup()
                                .add(0, 4, Short.MAX_VALUE)
                                .add(jButtonRemove)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jButton1)
                                .add(12, 12, 12)
                                .add(jButton2)
                                .add(12, 12, 12)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonLoadImages)
                    .add(jButtonRemove)
                    .add(jButton1)
                    .add(jButton2)
                    .add(jButton3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jLabel3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ReadAllFile(Vector<File> list, String filePath) {  
        File f = null;  
        f = new File(filePath);  
        File[] files = f.listFiles(); // get all files           
        for (File file : files) {  
            if(file.isDirectory()) {  
                  
                ReadAllFile(list, file.getAbsolutePath());  
            } else { 
                if (file.getName().endsWith(".nii")||file.getName().endsWith(".nii.gz")||file.getName().endsWith(".dcm")||file.getName().endsWith(".img")||file.getName().endsWith(".hdr"))
                list.add(file);  
            }  
        } 
        //for(int i=0; i< list.size(); i++) {  
          //  System.out.println(list.get(i).getAbsolutePath());  
        //}  
        
    }  
    //private Vector<File> displayedFiles = new Vector<File>();
    private void jButtonLoadImagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadImagesActionPerformed
        final javax.swing.JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fc.setMultiSelectionEnabled(true);
        
       
        fc.setAcceptAllFileFilterUsed(false);
        fc.addChoosableFileFilter(new ImageFilter());
        String dirrec;
        //angelo added
        File filename = new File("/tmp/imagepath.txt");
        try{
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            dirrec = br.readLine();
            System.out.println(dirrec);
            if (dirrec!= null)
            {
                fc.setCurrentDirectory(new File(dirrec));
            }
            
        }catch(IOException e)
        {
            fc.setCurrentDirectory(null);
        }
            
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File[] selectedFiles = fc.getSelectedFiles();
           //angelo added
            for (int idx = 0; idx < selectedFiles.length; idx ++)
            {
                if(selectedFiles[idx].isDirectory())            
                {
                    Vector<File> imgfiles = new Vector<File>();
                    ReadAllFile(imgfiles, selectedFiles[idx].getAbsolutePath());
                    DeidData.parentPath = selectedFiles[idx].getAbsolutePath();
                   System.out.println("haha"+ DeidData.parentPath);
                    DeidData.inputFiles.addAll(imgfiles);
                }
                //for(int i=0; i< imgfiles.size(); i++) {  
                //System.out.println(imgfiles.get(i).getAbsolutePath());  


                else{DeidData.inputFiles.add(selectedFiles[idx]);}
                //System.out.println("haha:"+ idx + selectedFiles.length);
            
            }
            //DeidData.inputFiles.addAll(Arrays.asList(selectedFiles));            
            //for(int i=0; i< DeidData.inputFiles.size(); i++) {  
            //System.out.println(DeidData.inputFiles.get(i).getAbsolutePath());  
            //} 
            jListImages.setListData(DeidData.inputFiles);
           
            String dir = fc.getSelectedFile().getParent();
            System.out.println(dir);
            
                
            if (!filename.exists()){
                try{
                    filename.createNewFile();
                }
                catch (IOException e) {
                DEIDGUI.log("Fail to create file!" );
                }
                
                }
            try 
            {
                
                RandomAccessFile  pathfile = new RandomAccessFile (filename,"rw");
                pathfile.writeBytes(dir);                
            }catch(IOException e)
            {
                DEIDGUI.log("No Parent Directory Found!" );
            } 
            DEIDGUI.log("Added " + selectedFiles.length + " input images");
           jLabel3.setText(selectedFiles.length +" image(s) loaded.");
        }
        
    }//GEN-LAST:event_jButtonLoadImagesActionPerformed

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        Object[] selection = jListImages.getSelectedValues();
        DeidData.inputFiles.removeAll(Arrays.asList(selection));
        jListImages.setListData(DeidData.inputFiles);
        DEIDGUI.log("Removed " + selection.length + " input images");
        jLabel2.setText("No line is selected.");
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       int ind[];
       ind = new int[DeidData.inputFiles.size()];
        for(int i = 0; i< DeidData.inputFiles.size();i++ )
       {
           ind[i] = i;           
           
       }
       jListImages.setSelectedIndices(ind);
       jLabel2.setText(DeidData.inputFiles.size()+" line(s) selected.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jListImages.clearSelection();
        jLabel2.setText("No line is selected.");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         final javax.swing.JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.setMultiSelectionEnabled(true);        
       
        fc.setAcceptAllFileFilterUsed(false);
       // fc.addChoosableFileFilter(new ImageFilter());
        //String dirrec;
        //angelo added
       // File filename = new File("/tmp/imagepath.txt");
       /* try{
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            dirrec = br.readLine();
            System.out.println(dirrec);
            if (dirrec!= null)
            {
                fc.setCurrentDirectory(new File(dirrec));
            }
            
        }catch(IOException e)
        {
            fc.setCurrentDirectory(null);
        }*/
            
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File[] selectedFiles = fc.getSelectedFiles();
           //angelo added
            for (int idx = 0; idx < selectedFiles.length; idx ++)
            {
                if(selectedFiles[idx].isDirectory())            
                {
                    Vector<File> imgfiles = new Vector<File>();
                    ReadAllFile(imgfiles, selectedFiles[idx].getAbsolutePath());
                    DeidData.parentPath = selectedFiles[idx].getAbsolutePath();
                   System.out.println("haha"+ DeidData.parentPath);
                    DeidData.inputFiles.addAll(imgfiles);
                }
                //for(int i=0; i< imgfiles.size(); i++) {  
                //System.out.println(imgfiles.get(i).getAbsolutePath());  


                else{DeidData.inputFiles.add(selectedFiles[idx]);}
                System.out.println("haha:"+ idx + selectedFiles.length);
            
            }
            //DeidData.inputFiles.addAll(Arrays.asList(selectedFiles));            
            //for(int i=0; i< DeidData.inputFiles.size(); i++) {  
            //System.out.println(DeidData.inputFiles.get(i).getAbsolutePath());  
            //} 
            jListImages.setListData(DeidData.inputFiles);
           
            String dir = fc.getSelectedFile().getParent();
            System.out.println(dir);
            
                
         
            DEIDGUI.log("Added " + selectedFiles.length + " input images");
           jLabel3.setText(selectedFiles.length +" image(s) loaded.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonLoadImages;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jListImages;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    @Override
    public WizardPanel getNextPanel() {
        final WizardPanel nextPanel;

        DeidData.niftiFiles.clear();
        // Determine if conversions of the selected images are necessary
        HashSet<File> dicomDirs = new HashSet<File>(),
                analyzePairs = new HashSet<File>();
        Iterator<File> imageIt = FileUtils.getFileListRecursively(
                DeidData.inputFiles, 1).iterator();
        while (imageIt.hasNext()) {
            File curImage = imageIt.next();
            String extension = FileUtils.getExtension(curImage);
            if (extension.equals(FileUtils.Extensions.dicom)) {
                // Use the parent directory of the file because dcm2nii will do
                // so anyway. Specifying each file is redundant.
                dicomDirs.add(curImage.getParentFile());
            } else if (extension.equals(FileUtils.Extensions.analyzehdr)
                    || extension.equals(FileUtils.Extensions.analyzeimg)) {
                analyzePairs.add(FileUtils.stripExtension(curImage));
            } else if (extension.equals(FileUtils.Extensions.nifti)||extension.equals(FileUtils.Extensions.niftigz)) {
                DeidData.niftiFiles.add(curImage);
            }
        }

        if (dicomDirs.size() > 0 || analyzePairs.size() > 0) {
            nextPanel = new ConvertingProgressPanel(dicomDirs, analyzePairs);
        } else {
            nextPanel = new LoadDemoPanel();
        }
        return nextPanel;
    }

    @Override
    public WizardPanel getPreviousPanel() {
        return new UserPanel();
    }
}

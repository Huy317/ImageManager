/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frame;

import imagemanager.Image2;
import imagemanager.Manager;
import imagemanager.TagManager;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author GIA HUY
 */
public class MainFrame2 extends javax.swing.JFrame {

    private Manager manager = Manager.getInstance();
    private TagManager tagManager = TagManager.getInstance();
    private JScrollPane imagePreviewScroll, propertiesScroll;
    private JPanel imagePreview, properties;
    private Image2 selectedImage2;
    private ImageButton selectedButton;
    //private Image selectedImage;
    /**
     * Creates new form MainFrame2
     */
    public MainFrame2() {
        initComponents();
        setSize(1280, 720);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchCategory = new javax.swing.JComboBox<>();
        searchText = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        imagePanel = new javax.swing.JPanel();
        propertiesPanel = new javax.swing.JPanel();
        editTagButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        saveMenuButton = new javax.swing.JMenuItem();
        exitMenuButton = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        importFolderMenuButton = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Tag" }));
        jPanel1.add(searchCategory);

        searchText.setColumns(10);
        searchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextActionPerformed(evt);
            }
        });
        jPanel1.add(searchText);

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        mainPanel.setLayout(new java.awt.BorderLayout());

        imagePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Image Preview"));
        imagePanel.setLayout(new java.awt.BorderLayout());
        mainPanel.add(imagePanel, java.awt.BorderLayout.CENTER);

        propertiesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Properties"));
        propertiesPanel.setPreferredSize(new java.awt.Dimension(130, 304));

        editTagButton.setText("Edit Tags");
        editTagButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTagButtonActionPerformed(evt);
            }
        });
        propertiesPanel.add(editTagButton);

        mainPanel.add(propertiesPanel, java.awt.BorderLayout.LINE_END);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        saveMenuButton.setText("Save");
        saveMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuButtonActionPerformed(evt);
            }
        });
        jMenu1.add(saveMenuButton);

        exitMenuButton.setText("Exit");
        exitMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuButtonActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenuButton);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Import");

        importFolderMenuButton.setText("Import Folder");
        importFolderMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importFolderMenuButtonActionPerformed(evt);
            }
        });
        jMenu2.add(importFolderMenuButton);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed

    private void saveMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_saveMenuButtonActionPerformed

    private void exitMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMenuButtonActionPerformed

    private void importFolderMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importFolderMenuButtonActionPerformed
        // TODO add your handling code here:
        //jScrollPane3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        //jScrollPane3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        JFileChooser fileChooser = new JFileChooser(new File(System.getProperty("user.home") + System.getProperty("file.separator") + "Pictures"));
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setMultiSelectionEnabled(false);
        int x = fileChooser.showDialog(this, "Open");
        if (x == JFileChooser.APPROVE_OPTION) {

            loadImages(fileChooser.getSelectedFile().toString());
            //setVisible(true);

        }
    }//GEN-LAST:event_importFolderMenuButtonActionPerformed

    private void editTagButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTagButtonActionPerformed
        // TODO add your handling code here:
        if (selectedImage2 != null) {
            EditTagDialog edit = new EditTagDialog(this, true, selectedImage2);

        } else {
            JOptionPane.showMessageDialog(null, "Please select an image first", "Warning", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_editTagButtonActionPerformed

    private void loadImages(String folderPath) {
        imagePanel.removeAll();

        File[] allFiles = manager.scanOneFolder(folderPath);
        imagePreview = new JPanel();
        imagePreview.setLayout(new GridLayout(0, 4));
        for (File file : allFiles) {
            try {
                ImageButton imgButton = new ImageButton(file.getAbsolutePath(), "");
                ImageIcon imgIcon = new ImageIcon(file.getAbsolutePath());
                imgButton.setText("");
                Image image = imgIcon.getImage();
                Dimension imgSize = new Dimension(imgIcon.getIconWidth(), imgIcon.getIconHeight());
                Dimension boundary = new Dimension((int) 1136 / 5, (int) 1136 / 5);
                Dimension scaled = getScaledDimension(imgSize, boundary);
                Image newimg = image.getScaledInstance(scaled.width, scaled.height, java.awt.Image.SCALE_SMOOTH);
                imgIcon = new ImageIcon(newimg);
                imgButton.setIcon(imgIcon);
                imgButton.addActionListener((e) -> {
                    //System.out.println(imgButton.getPath());
                    if (selectedButton != null){
                        selectedButton.setBackground(Color.WHITE);
                        selectedButton.setOpaque(false);
                    }
                    selectedButton = imgButton;
                    imgButton.setBackground(Color.LIGHT_GRAY);
                    imgButton.setOpaque(true);
                    
                    selectedImage2 = manager.getImage2(imgButton.getPath());
                });
                imagePreview.add(imgButton);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        imagePreviewScroll = new JScrollPane(imagePreview);
        imagePreviewScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        imagePreviewScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        imagePanel.add(imagePreviewScroll, BorderLayout.CENTER);

        //hacky fix but it works, don't question
        this.setSize(1281, 721);
        this.setSize(1280, 720);
        if (allFiles.length <= 4){
            pack();
        }
    }

    public void cleanUp() {
        imagePanel.removeAll();

    }

    private Dimension getScaledDimension(Dimension imgSize, Dimension boundary) {

        int original_width = imgSize.width;
        int original_height = imgSize.height;
        int bound_width = boundary.width;
        int bound_height = boundary.height;
        int new_width = original_width;
        int new_height = original_height;

        // first check if we need to scale width
        if (original_width > bound_width) {
            //scale width to fit
            new_width = bound_width;
            //scale height to maintain aspect ratio
            new_height = (new_width * original_height) / original_width;
        }

        // then check if we need to scale even with the new height
        if (new_height > bound_height) {
            //scale height to fit instead
            new_height = bound_height;
            //scale width to maintain aspect ratio
            new_width = (new_height * original_width) / original_height;
        }

        return new Dimension(new_width, new_height);
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
            java.util.logging.Logger.getLogger(MainFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editTagButton;
    private javax.swing.JMenuItem exitMenuButton;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JMenuItem importFolderMenuButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel propertiesPanel;
    private javax.swing.JMenuItem saveMenuButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> searchCategory;
    private javax.swing.JTextField searchText;
    // End of variables declaration//GEN-END:variables
}

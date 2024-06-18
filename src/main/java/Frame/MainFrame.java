/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frame;

import imagemanager.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JScrollPane;
import javax.swing.JFrame;
/**
 *
 * @author ADMIN
 */
public class MainFrame extends javax.swing.JFrame {

    private final Manager manager = Manager.getInstance();
    private TagManager tagManager = TagManager.getInstance();
    private ArrayList<ImageButton> imageButtons;
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        setSize(1280, 720);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBar = new javax.swing.JToolBar();
        searchCategories = new javax.swing.JComboBox<>();
        searchField = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        tagList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        propertiesList = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        displayImage = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        imagePreview = new javax.swing.JPanel();
        MenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        saveData = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        importMenu = new javax.swing.JMenu();
        importFolder = new javax.swing.JMenuItem();
        importImage = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Budget Image Manager");
        setBackground(new java.awt.Color(245, 237, 220));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        toolBar.setRollover(true);

        searchCategories.setFont(new java.awt.Font("SFU Futura", 0, 12)); // NOI18N
        searchCategories.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Tag" }));
        toolBar.add(searchCategories);

        searchField.setColumns(10);
        searchField.setFont(new java.awt.Font("SFU Futura", 0, 14)); // NOI18N
        toolBar.add(searchField);

        search.setFont(new java.awt.Font("SFU Futura", 0, 12)); // NOI18N
        search.setText("Search");
        search.setFocusable(false);
        search.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        search.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        toolBar.add(search);

        getContentPane().add(toolBar, java.awt.BorderLayout.PAGE_START);

        mainPanel.setLayout(new java.awt.BorderLayout());

        tagList.setLayout(new java.awt.CardLayout());

        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Image List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SFU Futura", 0, 12))); // NOI18N
        jList1.setFont(new java.awt.Font("SFU Futura", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(jList1);
        jList1.getAccessibleContext().setAccessibleName("");

        tagList.add(jScrollPane1, "card2");

        mainPanel.add(tagList, java.awt.BorderLayout.LINE_START);
        tagList.getAccessibleContext().setAccessibleName("");

        propertiesList.setLayout(new java.awt.CardLayout());

        jList2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Properties", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SFU Futura", 0, 12))); // NOI18N
        jList2.setFont(new java.awt.Font("SFU Futura", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(jList2);

        propertiesList.add(jScrollPane2, "card2");

        mainPanel.add(propertiesList, java.awt.BorderLayout.LINE_END);

        displayImage.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Image Preview", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SFU Futura", 0, 12))); // NOI18N
        displayImage.setMinimumSize(new java.awt.Dimension(264, 151));
        displayImage.setLayout(new java.awt.GridLayout(1, 1));

        jScrollPane3.setPreferredSize(new java.awt.Dimension(258, 130));

        imagePreview.setMaximumSize(new java.awt.Dimension(1000, 32767));
        imagePreview.setLayout(null);
        jScrollPane3.setViewportView(imagePreview);

        displayImage.add(jScrollPane3);

        mainPanel.add(displayImage, java.awt.BorderLayout.CENTER);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        fileMenu.setText("File");
        fileMenu.setFont(new java.awt.Font("SFU Futura", 1, 12)); // NOI18N

        saveData.setFont(new java.awt.Font("SFU Futura", 0, 12)); // NOI18N
        saveData.setText("Save Data");
        saveData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveDataActionPerformed(evt);
            }
        });
        fileMenu.add(saveData);

        exit.setFont(new java.awt.Font("SFU Futura", 0, 12)); // NOI18N
        exit.setText("Exit");
        fileMenu.add(exit);

        MenuBar.add(fileMenu);

        importMenu.setText("Import");
        importMenu.setFont(new java.awt.Font("SFU Futura", 1, 12)); // NOI18N

        importFolder.setFont(new java.awt.Font("SFU Futura", 0, 12)); // NOI18N
        importFolder.setText("Import Folder");
        importFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importFolderActionPerformed(evt);
            }
        });
        importMenu.add(importFolder);

        importImage.setFont(new java.awt.Font("SFU Futura", 0, 12)); // NOI18N
        importImage.setText("Import Image");
        importImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importImageActionPerformed(evt);
            }
        });
        importMenu.add(importImage);

        MenuBar.add(importMenu);

        setJMenuBar(MenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void importFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importFolderActionPerformed
        // TODO add your handling code here:
//        BufferedImage[] allImages;
        jScrollPane3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        JFileChooser fileChooser = new JFileChooser(new File(System.getProperty("user.home") + System.getProperty("file.separator") + "Pictures"));
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setMultiSelectionEnabled(false);
        int x = fileChooser.showDialog(this, "Open");
        if (x == JFileChooser.APPROVE_OPTION) {
            imagePreview.setLayout(new GridLayout(0, 4));
            loadImages(fileChooser.getSelectedFile().toString());
            //imagePreview.setPreferredSize(imagePreview.getPreferredSize());

            setVisible(true);

        }


    }//GEN-LAST:event_importFolderActionPerformed

    private void saveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDataActionPerformed
        // TODO add your handling code here:
        tagManager.writeTo("tag.data");
    }//GEN-LAST:event_saveDataActionPerformed

    private void importImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importImageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_importImageActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void loadImages(String folderPath) {
        File[] allFiles = manager.scanOneFolder(folderPath);
        for (File file : allFiles) {
            try {
                ImageButton imgButton = new ImageButton(folderPath, "");
                ImageIcon imgIcon = new ImageIcon(file.getAbsolutePath());
                imgButton.setText("");
                Image image = imgIcon.getImage();
                Dimension imgSize = new Dimension(imgIcon.getIconWidth(), imgIcon.getIconHeight());
                Dimension boundary = new Dimension(145, 145); 
                Dimension scaled = getScaledDimension(imgSize, boundary);
                Image newimg = image.getScaledInstance(scaled.width, scaled.height, java.awt.Image.SCALE_SMOOTH);
                imgIcon = new ImageIcon(newimg);
                imgButton.setIcon(imgIcon);
                imgButton.setBackground(Color.WHITE);
                imgButton.addActionListener((e) -> {
                    System.out.println(imgButton.getSize());
                    
                });
                imagePreview.add(imgButton);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }


    private void onImageButtonClick() {

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    /*old load img function
                File path = new File(fileChooser.getSelectedFile().toString());
            fileChooser.setAcceptAllFileFilterUsed(false);
            //File allFiles[] = path.listFiles();
            File allFiles[] = manager.scanAll(path.toString());
            allImages = new BufferedImage[allFiles.length];
            JButton button[] = new JButton[allFiles.length];
            //int minRows = (int) Math.round(Math.ceil(allFiles.length / 5));
            for (int i = 0; i < allFiles.length; i++) {
                try {
                    allImages[i] = ImageIO.read(allFiles[i]);
                    button[i] = new JButton();
                    ImageIcon icon = new ImageIcon(allImages[i]);
                    Image image = icon.getImage();
                    Dimension imgSize = new Dimension(icon.getIconWidth(), icon.getIconHeight());
                    Dimension boundary = new Dimension(144, 144);
                    Dimension scaled = getScaledDimension(imgSize, boundary);
                    Image newimg = image.getScaledInstance(scaled.width, scaled.height, java.awt.Image.SCALE_SMOOTH);
                    ImageIcon iconNew = new ImageIcon(newimg);
                    button[i].setBackground(Color.WHITE);
                    button[i].setPreferredSize(new Dimension(100, 100));
                    button[i].setIcon(iconNew);
                    imagePreview.add(button[i]);

                } catch (Exception e) {

                }
            }
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JPanel displayImage;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JPanel imagePreview;
    private javax.swing.JMenuItem importFolder;
    private javax.swing.JMenuItem importImage;
    private javax.swing.JMenu importMenu;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel propertiesList;
    private javax.swing.JMenuItem saveData;
    private javax.swing.JButton search;
    private javax.swing.JComboBox<String> searchCategories;
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel tagList;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}

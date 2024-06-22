/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frame;

import imagemanager.Image2;
import imagemanager.Manager;
import imagemanager.Tag;
import imagemanager.TagManager;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

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
    private ArrayList<ImageButton> buttonList = new ArrayList<>();
    private JPanel hideImage = new JPanel();

    //private Image selectedImage;
    /**
     * Creates new form MainFrame2
     */
    public MainFrame2() {
        initComponents();
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setTitle("Image Manager");
        ImageIcon icon = new ImageIcon("images\\logo.jpg");
        Image img = icon.getImage();
        setIconImage(img);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editTagButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        TrackerLabel = new javax.swing.JLabel();
        searchCategory = new javax.swing.JComboBox<>();
        searchText = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        imagePanel = new javax.swing.JPanel();
        propertiesPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tagsArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        saveMenuButton = new javax.swing.JMenuItem();
        exitMenuButton = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        importFolderMenuButton = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        editTag = new javax.swing.JMenuItem();

        editTagButton.setText("Edit Tags");
        editTagButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTagButtonActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TrackerLabel.setText("0 Images");
        jPanel1.add(TrackerLabel);

        searchCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tag", "Name" }));
        jPanel1.add(searchCategory);

        searchText.setColumns(25);
        searchText.setToolTipText("You can enter multiple tags by using space, leave blank to show all");
        searchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextActionPerformed(evt);
            }
        });
        searchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextKeyReleased(evt);
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
        propertiesPanel.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Tags:");
        propertiesPanel.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tagsArea.setEditable(false);
        tagsArea.setBackground(new java.awt.Color(255, 255, 255));
        tagsArea.setColumns(10);
        tagsArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tagsArea.setRows(8);
        tagsArea.setOpaque(false);
        jScrollPane1.setViewportView(tagsArea);

        propertiesPanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

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

        jMenu3.setText("Tag Menu");

        editTag.setText("Edit Tag");
        editTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTagActionPerformed(evt);
            }
        });
        jMenu3.add(editTag);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed
        // ACtivate when user press enter
        if (!buttonList.isEmpty()) {
            if (!searchText.getText().isEmpty()) {
                if (searchCategory.getSelectedItem().equals("Tag")) {
                    String[] tags = searchText.getText().split("\\s+");
                    showImagesWithTags(tags);
                } else if (searchCategory.getSelectedItem().equals("Name")) {
                    String name = searchText.getText();
                    showImageWithName(name);
                }
            } else {
                displayAllImages();
            }
        }
    }//GEN-LAST:event_searchTextActionPerformed

    private void hideAllImages() {
        for (ImageButton imgButton : buttonList) {
            imagePreview.remove(imgButton);
        }
        imagePreview.repaint();
        imagePreview.revalidate();
    }

    private void displayAllImages() {
        hideAllImages();
        for (ImageButton imgButton : buttonList) {
            imagePreview.add(imgButton);
        }
        imagePreview.repaint();
        imagePreview.revalidate();
    }
    private boolean hasTags(Image2 image2, String[] tags) {
        for (String tag : tags) {
            if (!image2.hasTag(tagManager.getTag(tag))){
                return false;
            }
        }
        return true;
    }
    private void showImagesWithTags(String[] tags) {
        hideAllImages();
        for (ImageButton imgButton : buttonList) {
            Image2 image2 = manager.getImage2(imgButton.getPath());
            if (hasTags(image2, tags)) {
                imagePreview.add(imgButton);
            }
        }
        imagePreview.repaint();
        imagePreview.revalidate();
    }

    private void showImageWithName(String name) {
        hideAllImages();
        for (ImageButton imgButton : buttonList) {
            Image2 image2 = manager.getImage2(imgButton.getPath());
            if (image2.getNameWithoutExtension().equals(name)) {
                imagePreview.add(imgButton);
            }
        }
        imagePreview.repaint();
        imagePreview.revalidate();
    }

    private void showImagesMathchesName(String name) {
        hideAllImages();
        for (ImageButton imgButton : buttonList) {
            Image2 image2 = manager.getImage2(imgButton.getPath());
            if (image2.getNameWithoutExtension().contains(name)) {
                imagePreview.add(imgButton);
            }
        }
        imagePreview.repaint();
        imagePreview.revalidate();
    }
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        if (!buttonList.isEmpty()) {
            if (!searchText.getText().isEmpty()) {
                if (searchCategory.getSelectedItem().equals("Tag")) {
                    String[] tags = searchText.getText().split("\\s+");
                    showImagesWithTags(tags);
                } else if (searchCategory.getSelectedItem().equals("Name")) {
                    String name = searchText.getText();
                    showImageWithName(name);
                }
            } else {
                displayAllImages();
            }
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void saveMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuButtonActionPerformed
        // TODO add your handling code here:
        tagManager.writeTo(TagManager.DEFAULT_SAVING_PATH);
        manager.writeTo(Manager.DEFAULT_SAVING_PATH);
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
        }
    }//GEN-LAST:event_importFolderMenuButtonActionPerformed

    private void editTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTagActionPerformed
        // TODO add your handling code here:
        TagManagerMenu tagManagerMenu = new TagManagerMenu(this, true, tagManager);
        tagManagerMenu.setLocationRelativeTo(this);
        tagManagerMenu.setVisible(true);

    }//GEN-LAST:event_editTagActionPerformed

    private void searchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextKeyReleased
        if (searchCategory.getSelectedItem().equals("Name")) {
            String name = searchText.getText();
            if (!name.isEmpty()) {
                showImagesMathchesName(name);
            } else {
                displayAllImages();
            }
        }
    }//GEN-LAST:event_searchTextKeyReleased

    private void editTagButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTagButtonActionPerformed
        if (selectedImage2 != null) {
            //EditTagDialog edit = new EditTagDialog(this, true, selectedImage2);
        } else {
            JOptionPane.showMessageDialog(null, "Please select an image first", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_editTagButtonActionPerformed

    private void updateTrack(int num) {
        TrackerLabel.setText(num + " Images");
    }

    private void displayTagsInArea() {
        tagsArea.setText("");
        StringBuilder sb = new StringBuilder();
        if (selectedImage2 != null) {
            Tag[] tags = selectedImage2.getTagsArray();
            for (Tag tag : tags) {
                sb.append(tag.getName()).append("\n");
            }
            
//            sb.append("==========\n");
//            Path path = Paths.get(selectedImage2.getPath());
//            try{
//                BasicFileAttributes attributes = Files.readAttributes(path,BasicFileAttributes.class);
//                sb.append("Creation time: ").append(attributes.creationTime());
//            }catch(IOException e){
//                System.out.println("BasicAttributesError:"+e.getMessage());
//            }
            
            
            
            tagsArea.setText(sb.toString());
        }
    }

    public void deselectImageButton() {
        if (selectedButton != null) {
            selectedButton.setBackground(Color.WHITE);
            selectedButton.setOpaque(false);
        }
    }

    private void loadImages(String folderPath) {
        imagePanel.removeAll();
        buttonList.clear();
        deselectImageButton();
        selectedButton = null;
        selectedImage2 = null;

        JPopupMenu popMenu = new JPopupMenu();
        JMenuItem option1 = new JMenuItem("Add tag");
        option1.setActionCommand("addTag");
        option1.addActionListener((e) -> {
//            TagPopupDialog popupDialog = new TagPopupDialog(this, rootPaneCheckingEnabled);
//            popupDialog.setLocationRelativeTo(this);
//            popupDialog.setVisible(true);
              TagPopupDialog2 popupDialog2 = new TagPopupDialog2(this, rootPaneCheckingEnabled, selectedImage2);
              popupDialog2.setLocationRelativeTo(this);
              popupDialog2.setVisible(true);
        });
        popMenu.add(option1);

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
                    deselectImageButton();
                    selectedButton = imgButton;
                    imgButton.setBackground(Color.LIGHT_GRAY);
                    imgButton.setOpaque(true);
                    selectedImage2 = manager.getImage2(imgButton.getPath());
                    displayTagsInArea();
                });
                imgButton.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        if (SwingUtilities.isRightMouseButton(e)) {
                            popMenu.show(imgButton, e.getX(), e.getY());
                        }
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                    }

                });
                imagePreview.add(imgButton);
                buttonList.add(imgButton);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        imagePreviewScroll = new JScrollPane(imagePreview);
        imagePreviewScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        imagePreviewScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        imagePanel.add(imagePreviewScroll, BorderLayout.CENTER);

        // hacky fix is still better
        this.setSize(1280, 720);
        if (allFiles.length <= 4) {
            pack();
        }
        updateTrack(allFiles.length);
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
    private javax.swing.JLabel TrackerLabel;
    private javax.swing.JMenuItem editTag;
    private javax.swing.JButton editTagButton;
    private javax.swing.JMenuItem exitMenuButton;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JMenuItem importFolderMenuButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel propertiesPanel;
    private javax.swing.JMenuItem saveMenuButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> searchCategory;
    private javax.swing.JTextField searchText;
    private javax.swing.JTextArea tagsArea;
    // End of variables declaration//GEN-END:variables
}

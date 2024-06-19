/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Frame;

import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.ListModel;

/**
 *
 * @author ADMIN
 */
public class TagPopupDialog extends javax.swing.JDialog {

    /**
     * Creates new form TagPopupDialog
     */
    public TagPopupDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        confirmButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tagList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        confirmButton.setText("Confirm");
        getContentPane().add(confirmButton, java.awt.BorderLayout.PAGE_END);

        jScrollPane2.setViewportView(tagList);
        tagList.setCellRenderer(new CheckboxListCellRenderer());

        getContentPane().add(jScrollPane2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TagPopupDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TagPopupDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TagPopupDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TagPopupDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TagPopupDialog dialog = new TagPopupDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
public class CheckboxListCellRenderer extends JCheckBox implements ListCellRenderer {

    public Component getListCellRendererComponent(JList list, Object value, int index, 
        boolean isSelected, boolean cellHasFocus) {
        setComponentOrientation(list.getComponentOrientation());
        setFont(list.getFont());
        setBackground(list.getBackground());
        setForeground(list.getForeground());
        setSelected(isSelected);
        setEnabled(list.isEnabled());
        setText(value == null ? "" : value.toString());  
        return this;
    }
}
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> tagList;
    // End of variables declaration//GEN-END:variables
}

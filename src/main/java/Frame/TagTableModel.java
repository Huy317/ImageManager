/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Frame;

import imagemanager.Tag;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class TagTableModel extends DefaultTableModel{
    DefaultTableModel model = new DefaultTableModel(new Object[] { "Key", "Value" }, 0);
    ArrayList<Tag> tagList;

    public TagTableModel(ArrayList<Tag> tagMap) {
        this.tagList = tagList;
    }
    
    public void addToModel(){
        for (Tag tag : tagList) {
            model.addRow(new Object[] {tag.getCount(), tag.getName()});
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Frame;

import imagemanager.Tag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class TagTableModel extends AbstractTableModel{
    private final String[] colName = {"Usage" , "Name"};
    private HashMap<String, Tag> tagMap;
    private List<Tag> tagList;

    public TagTableModel(HashMap<String, Tag> tagMap) {
        this.tagMap = tagMap;
    }
    
    @Override
    public int getRowCount() {
        return tagMap.size();
    }

    @Override
    public int getColumnCount() {
        return colName.length;
    }
    
    @Override
    public String getColumnName(int col){
        return colName[col];
    }
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        tagList = new ArrayList<>(tagMap.values());
        Tag tag = tagList.get(rowIndex);
        switch (columnIndex) {
            case 0 -> {
                return tag.getCount();
            }
            case 1 -> {
                return tag.getName();
            }
            default -> {
                return null;
            }
        }
    }
    
    public void removeRow(int rowIndex){
        if (tagList.remove(tagList.get(rowIndex))){
            fireTableRowsDeleted(rowIndex,rowIndex);
            tagMap.remove(tagList.get(rowIndex).getName());
        }
    }
    
   
}

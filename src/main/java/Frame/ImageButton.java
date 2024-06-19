/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Frame;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.JButton;

/**
 *
 * @author GIA HUY
 */
public class ImageButton extends JButton {
    private String path;
    public ImageButton(Icon icon) {
        super(icon);
    }


    public ImageButton(String path, String text) {
        super(text);
        this.path = path;
        setBackground(Color.WHITE);
        setBorderPainted(false);
        setOpaque(false);
    }

    
    
    public String getPath(){
        return this.path;
    }
}

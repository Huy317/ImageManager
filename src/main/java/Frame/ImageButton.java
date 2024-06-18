/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Frame;

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

    public ImageButton(String path, Icon icon) {
        super(icon);
        this.path = path;
    }
    public String getPath(){
        return this.path;
    }
}

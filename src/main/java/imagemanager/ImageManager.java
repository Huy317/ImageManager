/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package imagemanager;

import Frame.*;
import imagemanager.*;

/**
 *
 * @author ADMIN
 */
public class ImageManager {

    public static void main(String[] args) {
        Manager manager = Manager.getInstance();
        TagManager tagManager = TagManager.getInstance();
        
        MainFrame2 frame = new MainFrame2();
        frame.setVisible(true);

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package imagemanager;

import Frame.MainFrame;
import imagemanager.*;
/**
 *
 * @author ADMIN
 */
public class ImageManager {

    public static void main(String[] args) {
        Manager manager = Manager.getInstance();
        TagManager tagManager = TagManager.getInstance();

        MainFrame frame = new MainFrame();
        frame.setVisible(true);
    }
}

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
        for (int i = 1;i<=20;i++){
            Tag newTag = new Tag("test"+i);
            tagManager.add(newTag);
        }
//        MainFrame_testing frame = new MainFrame_testing();
        
        MainFrame2 frame = new MainFrame2();
        frame.setVisible(true);

        

    }
}

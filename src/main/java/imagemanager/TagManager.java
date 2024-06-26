/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imagemanager;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

/*
   this class is to keep count of all the tags
   it will create and load files that contains all tags created
 */
public class TagManager {

    public static String DEFAULT_SAVING_PATH = "tag.data";
    private final HashMap<String, Tag> map = new HashMap<>();
    private static TagManager instance;

    public TagManager() {
        this.readFrom("tag.data");
    }

    // Using singleton pattern so there's only one instance of this class exists
    public static synchronized TagManager getInstance() {
        if (instance == null) {
            instance = new TagManager();
        }
        return instance;
    }

    public boolean add(Tag tag) {
        return map.putIfAbsent(tag.getName(), tag) == null;
    }

    public void remove(Tag tag) {
        map.remove(tag.getName());
    }

    public Tag getTag(String name) {
        return map.get(name);
    }

    public HashMap<String, Tag> getMap() {
        return map;
    }
    
    

    public ArrayList<Tag> getTagList() {
        return new ArrayList<>(map.values());
    }

    public int getSize() {
        return map.size();
    }

    public void writeTo(String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Tag tag : map.values()) {
                oos.writeObject(tag);
            }
            oos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void readFrom(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Tag tag = null;
            while ((tag = (Tag) ois.readObject()) != null) {
                this.add(tag);
            }
            ois.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

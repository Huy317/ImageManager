/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imagemanager;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
//TODO: implement add tags to images
//TODO: implement search functions

public class Manager {

    private static Manager instance;
    private final HashMap<String, Image2> map = new HashMap<>();

    public Manager() {
    }

    public static synchronized Manager getInstance() {
        if (instance == null) {
            instance = new Manager();
        }
        return instance;
    }

    public boolean add(Image2 im) {
        if (im == null) {
            return false;
        }
        if (map.get(im.getPath()) == null) {
            map.put(im.getPath(), im);
            return true;
        }
        return false;
    }
    
    private boolean add(String path) {
        Image2 im = new Image2(path);
        return this.add(im);
    }
    
    public Image2 getImage2(String path){
        return map.get(path);
    }
//    public boolean addTag(Image image, Tag tag) {
//        if (hasImage(image)){
//            image.addTag(tag);
//            return true;
//        }
//        return false; // image doesn't exist
//    }
//    
//        public boolean addTag(Image image, Tag[] tags) {
//        if (hasImage(image)){
//            image.addTag(tags);
//            return true;
//        }
//        return false; // image doesn't exist
//    }
    
    
    public boolean hasImage(Image2 im) {
        if (im == null) {
            return false;
        }
        if (map.get(im.getPath()) == null) {
            map.put(im.getPath(), im);
            return true;
        }
        return false;
    }
    
    public boolean hasImage(String path){
        Image2 im = new Image2(path);
        return this.hasImage(im);
    }
    
    public String[] getImagePath() {
        return map.keySet().toArray(new String[0]);
    }

    /**
     * Scan for ALL images inside a folder/subfolders uses Recrusions
     *
     * @param path the path/url to the folder
     * 
     * @return File[] containing all images in folder
     */
    public File[] scanAll(String path) {
        File folder = new File(path);
        ArrayList<File> filesReturn = new ArrayList<>();
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        scanAll(file.getAbsolutePath()); // Recursively scan subfolders
                    } else {
                        String fileName = file.getName().toLowerCase();
                        if (fileName.endsWith(".jpg") || fileName.endsWith(".jpeg") || fileName.endsWith(".png") || fileName.endsWith(".gif")) {
                            if (this.add(file.getAbsolutePath())) {
                                filesReturn.add(file);
                            }
                        }
                    }
                }
            }
        }
        return filesReturn.toArray(new File[0]);
    }

    /**
     * Scan for images in selected folder ONLY Does not use recursion
     *
     * @param path the path/url to the folder
     * 
     * @return File[] containing all images in folder
     */
    public File[] scanOneFolder(String path) {
        File folder = new File(path);
        ArrayList<File> filesReturn = new ArrayList<>();
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (!file.isDirectory()) {
                        String fileName = file.getName().toLowerCase();
                        if (fileName.endsWith(".jpg") || fileName.endsWith(".jpeg") || fileName.endsWith(".png") || fileName.endsWith(".gif")) {
                            if (this.add(file.getAbsolutePath())) {
                                filesReturn.add(file);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(toString());
        return filesReturn.toArray(new File[0]);
    }

    public int getSize() {
        return map.size();
    }

    public void writeTo(String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Image2 im : map.values()) {
                oos.writeObject(im);
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
            Image2 im = null;
            while ((im = (Image2) ois.readObject()) != null) {
                this.add(im);
            }
            ois.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (String k : map.keySet()){
            sb.append(k).append(" path: ").append(map.get(k).getPath()).append("\n");
        }
        return sb.toString();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imagemanager;

import java.io.Serializable;
import java.util.ArrayList;

/*
 * This class represents an image.
 * It has a path and a list of tags.
 * @author Huy
 */
public class Image2 implements Serializable {

    private String path;
    private final ArrayList<Tag> tags = new ArrayList<>();

    /**
     * @param path url of the image i.e: "D:\\Images\example.jpg"
     */
    public Image2(String path) {
        this.path = path;
    }

    public Image2() {
    }

    /**
     * @return the name of the image i.e: "example.jpg"
     */
    public String getName() {
        return path.substring(path.lastIndexOf("\\") + 1);
    }

    /**
     * @return the name of the image without the extension i.e: "example"
     */
    public String getNameWithoutExtension() {
        return path.substring(path.lastIndexOf("\\") + 1, path.lastIndexOf("."));
    }

    /**
     * @return url of the image i.e: "D:\\Images\example.jpg"
     */
    public String getPath() {
        return path;
    }

    /**
     * @return a List of tags this image has
     */
    public ArrayList<Tag> getTags() {
        return tags;
    }

    /**
     * @return array of tags this image has
     */
    public Tag[] getTagsArray() {
        Tag[] array = new Tag[tags.size()];
        return tags.toArray(array);
    }

    public boolean hasTag(Tag tag) {
        //return tags.contains(tag);
        for (Tag thisTag : tags) {
            if (thisTag.equals(tag)) {
                return true;
            }
        }
        return false;
    }

//    public boolean hasTag(String tag) {
//        Tag tagToCheck = tagManager.getTag(tag);
//        return tags.contains(tagToCheck);
//    }
//
//    public boolean hasTag(String[] tags) {
//        for (String tag : tags) {
//            if (!hasTag(tag)) {
//                return false;
//            }
//        }
//        return true;
//    }
    public boolean addTag(Tag tag) {
        if (hasTag(tag)) {
            return false;
        }
        tags.add(tag);
        tag.incrementCount();
        return true;
    }

    public void addTag(Tag[] tags) {
        if (tags == null) {
            return;
        }
        for (Tag tag : tags) {
            addTag(tag);
        }
    }

    public boolean removeTag(Tag tag) {
//        if (tags.remove(tag)) {
//            tag.decrementCount();
//            return true;
//        }
//        return false;
        if (tag == null){
            return false;
        }
        
        for (Tag thisTag : tags) {
            if (thisTag.equals(tag)) {
                tags.remove(thisTag);
                return true;
            }
        }
        return false;
    }
}

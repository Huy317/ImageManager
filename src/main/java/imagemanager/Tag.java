/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imagemanager;

/**
 *
 * @author GIA HUY
 */
public class Tag {

    private final String name;
    private int count; // number of images that have this tag (unused now cuz lazy, might add a feature for this, idk)

    public Tag(String name) {
        this.name = name;
        this.count = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void incrementCount() {
        this.count++;
    }

    public void decrementCount() {
        this.count--;
    }

    public boolean equals(Tag otherTag) {
        return name.equals(otherTag.getName());
    }

}

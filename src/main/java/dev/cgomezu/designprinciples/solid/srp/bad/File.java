package dev.cgomezu.designprinciples.solid.srp.bad;


/**
 *  Bad class only has one responsibility and one reason to change.
 *  this class has 3 responsibilities:
 * 1. print
 * 2. save
 * 3. load
 * */
public class File {
    
    String name;
    int size;
    String type;

    public File(String name, int size, String type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public void print() {
        System.out.println("File name: " + name);
        System.out.println("File size: " + size);
        System.out.println("File type: " + type);
    }

    public void save() {
        System.out.println("Saving file to disk...");
    }

    public void load() {
        System.out.println("Loading file from disk...");
    }
}

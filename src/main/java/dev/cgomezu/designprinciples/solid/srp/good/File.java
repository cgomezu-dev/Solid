package dev.cgomezu.designprinciples.solid.srp.good;

/**
 * Good example for SRP this class only has the responsibility of holding the file data
 */
public class File {
    String name;
    int size;
    String type;

    public File(String name, int size, String type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

}

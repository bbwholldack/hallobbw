package com.example.hallobbw;

public class Animal {
    private int id;
    private String name;
    private String asciiPic;

    public Animal(int id, String name, String asciiPic) {
        this.id = id;
        this.name = name;
        this.asciiPic = asciiPic;
    }

    public String getAsciiPic() {
        return asciiPic;
    }
}

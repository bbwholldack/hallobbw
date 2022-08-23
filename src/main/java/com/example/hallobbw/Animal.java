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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAsciiPic() {
        return asciiPic;
    }

    public void setAsciiPic(String asciiPic) {
        this.asciiPic = asciiPic;
    }
}

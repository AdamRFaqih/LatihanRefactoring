package org.example;

public class Album {
    private String name;
    private String coverURL;

    public Album(String name, String coverURL) {
        this.name = name;
        this.coverURL = coverURL;
    }

    public String getName() {
        return name;
    }

    public String getCoverURL() {
        return coverURL;
    }

    public void printInfo() {
        if (!name.equals("")) {
            System.out.println("album title: " + name);
        }
    }
}

package org.example;

public class Artist {
    private String name;
    private String alias;
    private String imageURL;

    public Artist(String name, String alias, String imageURL) {
        this.name = name;
        this.alias = alias;
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }
    
    public String getImageURL() {
        return imageURL;
    }

    public void printInfo() {
        if (!name.equals("")) {
            System.out.println("artist name: " + name);
        }
        if (!alias.equals("")) {
            System.out.println("artist also known as: " + alias);
        }
    }
}

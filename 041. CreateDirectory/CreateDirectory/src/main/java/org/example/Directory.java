package org.example;

import java.io.File;

public class Directory {

    private String path;

    public Directory(String path) {
        this.path = path;
    }

    public Directory() {
    }

    public boolean createDirectory(){
        File file = new File(this.path);

        if (file.mkdirs()) {
            System.out.println("Directory is created");
            return true;
        }
        //if directory already exists
        else if (file.isDirectory()) {
            // display that the directory already created
            System.out.println("directory already created");
            return false;

        } else {
            // display that the directory cannot be created
            System.out.println("Directory not created");
            return false;
        }

    }
}

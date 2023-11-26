package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TextFile {
    private java.io.File file;
    private String text;

    //region Getters & Setters
    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TextFile() {
    }

    //endregion

    public void fillInFile() throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter(this.file);
        printWriter.println(this.text);
        printWriter.close();
    }

    public void replaceTextWithText(String oldText, String newText){
        if(!oldText.equals("")){
            this.text = this.text.replace(oldText , newText);
        }
    }

    public void removeText(String textToRemove){
        replaceTextWithText(textToRemove,"");
    }
}

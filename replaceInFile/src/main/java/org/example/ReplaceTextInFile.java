package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReplaceTextInFile {
    public String oldFilePath;
    public String newFilePath;
    public String fileText;
    public String oldWord;
    public String newWord;

    public ReplaceTextInFile(String oldFilePath, String newFilePath, String fileText, String oldWord, String newWord) {
        this.oldFilePath = oldFilePath;
        this.newFilePath = newFilePath;
        this.fileText = fileText;
        this.oldWord = oldWord;
        this.newWord = newWord;
    }

    //creating text file with given text
    public void createFile(String filePath, String fileText) throws FileNotFoundException {
        java.io.File file = new java.io.File(filePath);
        if(file.exists()){
            System.out.println("file exists");
        }

        java.io.PrintWriter output = new java.io.PrintWriter(file);

        output.println(fileText);

        output.close();
    }

    public void searchAndReplaceStringAndSavingTextToNewFile(String oldWord, String newWord, String filePath, String targetFilePath) {
        Boolean replaced = false;
        try {
            java.io.File fileOld = new java.io.File(filePath);                      //create old file
            java.io.File fileNew = new java.io.File(targetFilePath);                //crete new file
            Scanner scanner = new Scanner(fileOld);                                 //old file open for reading with scanner
            java.io.PrintWriter printWriter = new java.io.PrintWriter(fileNew);     //new file open for writing with printWriter

            while (scanner.hasNext()) {                                             //for all lines in the old file
                String s1 = scanner.nextLine();                                         //each line saved in string
                String s2 = s1.replace(oldWord, newWord);                               //and replacing is being done in this line
                printWriter.println(s2);                                                //new line is saved into the new file
                if(!s1.equals(s2)){
                    replaced = true;
                }
            }

            printWriter.close();                                                    //new file is now closed for writing
            if(replaced){
                System.out.println("Replacing done");
            }else {
                System.out.println("Nothing to replace");
            }

        }   catch(FileNotFoundException fnf){
            System.out.println(fnf.getMessage());
        }
    }

}

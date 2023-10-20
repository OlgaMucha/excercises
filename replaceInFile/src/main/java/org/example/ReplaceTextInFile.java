package org.example;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReplaceTextInFile {
    public String oldFilePath;
    public String fileText;
    public String oldText;
    public String newText;


    public ReplaceTextInFile(String oldFilePath, String fileText, String oldText, String newText) {
        this.oldFilePath = oldFilePath;
        this.fileText = fileText;
        this.oldText = oldText;
        this.newText = newText;
    }

    public String getOldFilePath() {
        return oldFilePath;
    }

    public String getFileText() {
        return fileText;
    }

    public String getOldText() {
        return oldText;
    }

    public String getNewText() {
        return newText;
    }

    //creating text file with given text
    private static void createFile(String filePath, String fileText) throws FileNotFoundException {
        java.io.File file = new java.io.File(filePath);
        if(file.exists()){
            System.out.println("file exists");
        }

        java.io.PrintWriter output = new java.io.PrintWriter(file);

        output.println(fileText);

        output.close();
    }

    public boolean searchAndReplaceStringAndSavingTextToNewFile(String oldWord, String newWord, String filePath, String fileText) throws FileNotFoundException {
        createFile(filePath, fileText);
        boolean replaced = false;
        try {
            java.io.File fileOld = new java.io.File(filePath);                      //create old file
            String newFilePath = buildNewFilePath(filePath, oldWord, newWord);
            java.io.File fileNew = new java.io.File(newFilePath);                //crete new file
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

        return replaced;
    }

    private String buildNewFilePath(String oldFilePath, String oldWord, String newWord) {
        String fileWithoutExtension = oldFilePath.replace(".txt","");
        return fileWithoutExtension.concat("Replaced"+ firstLetterOfStringToUpperCase(oldWord)+"With"+firstLetterOfStringToUpperCase(newWord));
    }

    private String firstLetterOfStringToUpperCase(String string){
        return string.substring(0, 1).toUpperCase()+string.substring(1).toLowerCase();
    }

}

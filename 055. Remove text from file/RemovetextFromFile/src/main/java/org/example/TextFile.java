package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFile {
    private java.io.File file = new java.io.File("newFile.txt");
    //fill in file
    public void fillInFile() throws FileNotFoundException {

        PrintWriter printWriter = new PrintWriter(this.file);
        printWriter.println("De derde herfststorm van dit jaar is een feit. In IJmuiden werd vrijdag tussen 16.00 en 17.00 uur windkracht 9 gemeten, waarmee officieel sprake is van een storm, meldt Weeronline. Het is in totaal de vijfde storm van dit jaar.\n" +
                "\n" +
                "Deze herfst stormde het eerder op 2 november en 19 september. Het is volgens Weeronline voor het eerst sinds 2017 dat het drie keer in de herfst stormt.");
        printWriter.close();
    }

    public void removeFromFileText(String text) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        }



    public TextFile() {
    }
}

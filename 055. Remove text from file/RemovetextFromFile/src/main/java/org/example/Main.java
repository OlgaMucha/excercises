package org.example;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        TextFile textFile = new TextFile();

        String text = """
                De derde herfststorm van dit jaar is een feit.\s
                 In IJmuiden werd vrijdag tussen 16.00 en 17.00 uur windkracht 9 gemeten,\s
                 waarmee officieel sprake is van een storm, meldt Weeronline. Het is in totaal de vijfde storm van dit jaar.
                Deze herfst stormde het eerder op 2 november en 19 september.\s
                 Het is volgens Weeronline voor het eerst sinds 2017 dat het drie keer in de herfst stormt.""";

        java.io.File file = new java.io.File("newFile.txt");

        textFile.setText(text);
        textFile.setFile(file);
        //replace text
        //textFile.replaceTextWithText("IJmuiden","Amsterdam");
        //textFile.fillInFile();

        //remove text
        textFile.removeText("online");
        textFile.fillInFile();
    }


}
package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

class TextFileTest {

    @org.junit.jupiter.api.Test
    void replaceTextWithText() {
    }

    @org.junit.jupiter.api.Test
    void removeText() {
    }

    String text = """
                Six moments from Patrick Kielty’s first Late Late Toy Show we’re still talking about
            From Sheamie sharing the family secrets to Sophie's heartwarming dash across Dublin to be a VIP guest,
            here are the stand-out moments from the Toy Show\s
            """;

    java.io.File file = new java.io.File("newFileTest.txt");

    @Test
    public void test_replaceTextWithText_replace_Late_Early_replacesCorrectly(){
        TextFile textFile = new TextFile();
        textFile.setText(text);
        textFile.setFile(file);
        String oldText = "Late";
        String newText = "Early";

        textFile.replaceTextWithText(oldText, newText);
        String actualText = textFile.getText();
        String expectedText = """
                Six moments from Patrick Kielty’s first Early Early Toy Show we’re still talking about
            From Sheamie sharing the family secrets to Sophie's heartwarming dash across Dublin to be a VIP guest,
            here are the stand-out moments from the Toy Show\s
            """;

        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    public void test_replaceTextWithText_replace_book_paper_returnsThisSameIfTextToRemoveNotFound(){
        TextFile textFile = new TextFile();
        textFile.setText(text);
        textFile.setFile(file);
        String oldText = "book";
        String newText = "paper";

        textFile.replaceTextWithText(oldText, newText);
        String actualText = textFile.getText();
        String expectedText = """
                Six moments from Patrick Kielty’s first Late Late Toy Show we’re still talking about
            From Sheamie sharing the family secrets to Sophie's heartwarming dash across Dublin to be a VIP guest,
            here are the stand-out moments from the Toy Show\s
            """;

        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    public void test_replaceTextWithText_replace_patrick_John_IsCaseSensitive(){
        TextFile textFile = new TextFile();
        textFile.setText(text);
        textFile.setFile(file);
        String oldText = "patrick";
        String newText = "John";

        textFile.replaceTextWithText(oldText, newText);
        String actualText = textFile.getText();
        String expectedText = """
                Six moments from Patrick Kielty’s first Late Late Toy Show we’re still talking about
            From Sheamie sharing the family secrets to Sophie's heartwarming dash across Dublin to be a VIP guest,
            here are the stand-out moments from the Toy Show\s
            """;

        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    public void test_replaceTextWithText_replace_nothing_with_John_returnsThisSameText(){
        TextFile textFile = new TextFile();
        textFile.setText(text);
        textFile.setFile(file);
        String oldText = "";
        String newText = "John";

        textFile.replaceTextWithText(oldText, newText);
        String actualText = textFile.getText();
        String expectedText = """
                Six moments from Patrick Kielty’s first Late Late Toy Show we’re still talking about
            From Sheamie sharing the family secrets to Sophie's heartwarming dash across Dublin to be a VIP guest,
            here are the stand-out moments from the Toy Show\s
            """;

        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    public void test_replaceTextWithText_replace_space_with_s_returnsThisSameText(){
        TextFile textFile = new TextFile();
        textFile.setText(text);
        textFile.setFile(file);
        String oldText = " ";
        String newText = "X";

        textFile.replaceTextWithText(oldText, newText);
        String actualText = textFile.getText();
        String expectedText = """
            XXXXSixXmomentsXfromXPatrickXKielty’sXfirstXLateXLateXToyXShowXwe’reXstillXtalkingXabout
            FromXSheamieXsharingXtheXfamilyXsecretsXtoXSophie'sXheartwarmingXdashXacrossXDublinXtoXbeXaXVIPXguest,
            hereXareXtheXstand-outXmomentsXfromXtheXToyXShowX
            """;

        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    public void test_replaceTextWithText_replace_Patrick_with_Patrick_returnsThisSameText(){
        TextFile textFile = new TextFile();
        textFile.setText(text);
        textFile.setFile(file);
        String oldText = "Patrick";
        String newText = "Patrick";

        textFile.replaceTextWithText(oldText, newText);
        String actualText = textFile.getText();
        String expectedText = """
                Six moments from Patrick Kielty’s first Late Late Toy Show we’re still talking about
            From Sheamie sharing the family secrets to Sophie's heartwarming dash across Dublin to be a VIP guest,
            here are the stand-out moments from the Toy Show\s
            """;

        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    public void test_setTest_setsTextOk(){
        String text1 = "Stol z powylanymanymi nogami";
        TextFile textFile = new TextFile();
        textFile.setText(text1);
        String expectedText = "Stol z powylanymanymi nogami";
        String actualText = textFile.getText();
        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    public void test_setFile_setsFileOk(){
        java.io.File actualFile = new File("text1.txt");
        TextFile textFile = new TextFile();
        textFile.setFile(actualFile);

        String actualPath = "text1.txt";
        String expectedPath = actualFile.getPath();
        java.io.File expectedFile = textFile.getFile();

        Assertions.assertAll (
                ()-> {
                    Assertions.assertEquals(expectedPath, actualPath);
                    Assertions.assertEquals(expectedFile, actualFile);
                }
        ) ;
    }
}
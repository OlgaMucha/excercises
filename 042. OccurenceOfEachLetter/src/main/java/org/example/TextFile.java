package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TextFile {

    private String path;

    public TextFile(String path)
    {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public HashMap<String, Integer> getOccurrenceOfCharactersInFile(String path) throws FileNotFoundException {
        ArrayList<String> arrayList = readCharactersFromFileToArrayList(path);
        ArrayList<String> arrayListSortedToLowerCase = sortAndLowerCaseArrayList(arrayList);
        HashMap<String, Integer> mapCharacterOccurrence = countNumberOccurrencesOfCharacterInArrayList(arrayListSortedToLowerCase);
        printOutput(mapCharacterOccurrence);
        return mapCharacterOccurrence;

    }



    private static void printOutput(HashMap<String, Integer> map){
        map.forEach((a,b) -> System.out.println("Number of " + a.toUpperCase() + "s is " + b));
    }


    private static ArrayList<String> sortAndLowerCaseArrayList(ArrayList<String> arrayListCharacters) {
        //all letters to lower case
        arrayListCharacters.replaceAll(String::toLowerCase);

        //sort array list ascending
        arrayListCharacters.sort(null);
        return arrayListCharacters;
    }

    private static ArrayList<String> readCharactersFromFileToArrayList(String path) throws FileNotFoundException {
        ArrayList<String> arrayList = new ArrayList<>();
        java.io.File file = new File(path);
        Scanner fileReader = new Scanner(file);





        while (fileReader.hasNext()) {
            //||fileReader.nextLine()==null"
            String[] arrayLetters = fileReader.nextLine().split("");
            List<String> listLetters = Arrays.asList(arrayLetters);

            arrayList.addAll(listLetters);

            //remove non-letters frm array list
            removeNonCharactersFromArrayList(arrayList, arrayLetters);

            if(!fileReader.hasNext()){
                break;
            }
            fileReader.nextLine();
        }
        fileReader.close();
        return arrayList;
    }

    private static HashMap<String, Integer> countNumberOccurrencesOfCharacterInArrayList(ArrayList<String> arrayList) {
        int k = 1;
        HashMap<String,Integer> set = new HashMap<>();
        for (int i = 0; i < arrayList.size(); i++) {
            k = 1;
            if(i == arrayList.size() - 1){
                set.putIfAbsent(arrayList.get(arrayList.size() - 1), k);
                break;
            }
            while (Objects.equals(arrayList.get(i), arrayList.get(i + 1))) {
                k = k + 1;
                if(i == arrayList.size() - 2){
                    break;
                }
                i = i + 1;
            }
            set.putIfAbsent(arrayList.get(i), k);
        }

        return set;
    }

    private static void removeNonCharactersFromArrayList(ArrayList<String> arrayList, String[] arrayLetters) {

        for(String letter: arrayLetters){
            if(letter.matches("[^a-zA-Z]")){
                arrayList.remove(letter);
            }
        }
    }
}

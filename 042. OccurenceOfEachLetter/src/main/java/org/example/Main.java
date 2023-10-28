package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> arrayList = new ArrayList<>();

        String path = getFilePathFromUser();

        java.io.File file = new File(path);
        Scanner fileReader = new Scanner(file);


        ArrayList<String> arrayListCharacters = readCharactersFromFileToArrayList(fileReader, arrayList);

        ArrayList<String> arrayListCharactersSortedLowerCase = sortAndLowerCaseArrayList(arrayListCharacters);

        HashMap<String, Integer> map = countNumberOccurrencesOfCharacterInArrayList(arrayListCharactersSortedLowerCase);

        printOutput(map);
    }

    private static String getFilePathFromUser() {
        System.out.println("Enter a file path");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        scanner.close();
        return path;
    }

    private static ArrayList<String> sortAndLowerCaseArrayList(ArrayList<String> arrayListCharacters) {
        //all letters to lower case
        arrayListCharacters.replaceAll(String::toLowerCase);

        //sort array list ascending
        arrayListCharacters.sort(null);
        return arrayListCharacters;
    }

    private static ArrayList<String> readCharactersFromFileToArrayList(Scanner fileReader, ArrayList<String> arrayList) {
        while (fileReader.hasNext()) {

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
    public static void printOutput(HashMap<String, Integer> map){
        map.forEach((a,b) -> System.out.println("Number of " + a.toUpperCase() + "s is " + b));

    }



    private static void removeNonCharactersFromArrayList(ArrayList<String> arrayList, String[] arrayLetters) {

        for(String letter: arrayLetters){
            if(letter.matches("[^a-zA-Z]")){
                arrayList.remove(letter);
            }
        }
    }
}





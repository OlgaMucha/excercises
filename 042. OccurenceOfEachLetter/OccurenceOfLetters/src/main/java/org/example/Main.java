package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Enter a file path");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        scanner.close();

        java.io.File file = new File("desc.txt");
        Scanner fileReader = new Scanner(file);
        ArrayList<String> arrayList = new ArrayList<>();

        while (fileReader.hasNext()) {
            String[] arrayLetters = fileReader.nextLine().split("");
            List<String> listLetters = Arrays.asList(arrayLetters);
            arrayList.addAll(listLetters);
            if(!fileReader.hasNext()){
                break;
            }
            fileReader.nextLine();
        }
        fileReader.close();
        System.out.println(arrayList.toString());

        //all letters to lower case
        arrayList.replaceAll(String::toLowerCase);
        System.out.println(arrayList.toString());

        //sort array list ascending
        arrayList.sort(null);
        System.out.println(arrayList.toString());
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
        set.forEach((a,b) -> System.out.println("Number of " + a.toUpperCase() + "s is " + b));
    }
        }





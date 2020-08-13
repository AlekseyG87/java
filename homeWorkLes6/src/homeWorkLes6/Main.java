package homeWorkLes6;

import java.io.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws IOException {

    //createFile();
    //concatination();
        searchWord("Irkutsk");
    }
    private static void createFile () {

        try{
            PrintStream ps1 = new PrintStream(new FileOutputStream("file1.txt."));
            ps1.println("Irkutsk is the largest city and administrative center of Irkutsk Oblast, Russia. ");
            ps1.flush();
            ps1.close();
            PrintStream ps2 = new PrintStream(new FileOutputStream("file2.txt."));
            ps2.println("Irkutsk is the twenty fifth largest city in Russia by population, the fifth largest in the Siberian Federal District, and one of the largest cities in Siberia.");
            ps2.flush();
            ps2.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void concatination () throws FileNotFoundException {
        Scanner scanner1 = new Scanner(new FileInputStream("file1.txt"));
        while (scanner1.hasNext()) {
            try {
                PrintStream ps3 = new PrintStream(new FileOutputStream("file3.txt"));
                ps3.println(scanner1);
                ps3.flush();
                ps3.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        Scanner scanner2 = new Scanner(new FileInputStream("file2.txt"));
        while (scanner1.hasNext()) {
            try {
                PrintStream ps3 = new PrintStream(new FileOutputStream("file3.txt", true));
                ps3.println(scanner2);
                ps3.flush();
                ps3.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private static void searchWord (String word) throws IOException {
        FileInputStream fis  = new FileInputStream("file1.txt");
        String [] b = new String [fis.available()];
        for (int i = 0; i < b.length; i++) {
            if (b[i].equalsIgnoreCase(word))
                System.out.println("The word is here");
            else
                System.out.println("No word");
        }
        //return new String(Files.readAllBytes(Paths.get("file1.txt"))).contains(word);



    }

    private static void 


}

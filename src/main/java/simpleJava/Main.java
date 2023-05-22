package simpleJava;

import simpleJava.Printer.Color;
import simpleJava.Printer.Printer;

import java.io.File;
import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Zver\\Desktop\\test.txt");
        System.out.println("Введите текст для записи в файл");
        String text = SCANNER.nextLine();
        SimpleFiles.writeTextToFile(text,f,false);
        System.out.println("Чтение файла...");
        Printer.pln("Найден текст:" + SimpleFiles.getTextFromFile(f), Color.CYAN);
    }
}
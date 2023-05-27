package simpleJava.Printer;
import simpleJava.simpleFor.ForLoop;

import java.util.List;
import java.util.Map;

public class Printer {
    private static final Printer P = new Printer();
    private static final ForLoop FOR = new ForLoop();
    private static final String RESET = "\u001B[0m";
    private static final String BLACK = "\u001B[30m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String PURPLE = "\u001B[35m";
    private static final String CYAN = "\u001B[36m";
    private static final String WHITE = "\u001B[37m";
    public  <T> void pln(T text) {
        System.out.println(text);
    }
    public <T> void pln(T text, Color color) {
        switch (color) {
            case RED -> System.out.println(RED + text + RESET);
            case BLUE -> System.out.println(BLUE + text + RESET);
            case CYAN -> System.out.println(CYAN + text + RESET);
            case BLACK -> System.out.println(BLACK + text + RESET);
            case GREEN -> System.out.println(GREEN + text + RESET);
            case RESET -> System.out.println(RESET + text + RESET);
            case WHITE -> System.out.println(WHITE + text + RESET);
            case PURPLE -> System.out.println(PURPLE + text + RESET);
            case YELLOW -> System.out.println(YELLOW + text + RESET);
        }
    }
    public static <T> void p(T text) {
        System.out.print(text);
    }
    public static <T> void p(T text, Color color) {
        switch (color) {
            case RED -> System.out.print(RED + text + RESET);
            case BLUE -> System.out.print(BLUE + text + RESET);
            case CYAN -> System.out.print(CYAN + text + RESET);
            case BLACK -> System.out.print(BLACK + text + RESET);
            case GREEN -> System.out.print(GREEN + text + RESET);
            case RESET -> System.out.print(RESET + text + RESET);
            case WHITE -> System.out.print(WHITE + text + RESET);
            case PURPLE -> System.out.print(PURPLE + text + RESET);
            case YELLOW -> System.out.print(YELLOW + text + RESET);
        }
    }
    public <T, Y> void printMap(Map<T, Y> map) {
        for (Map.Entry<T,Y> entry : map.entrySet()) {
            pln(CYAN + entry.getKey() + RESET + " -> " + entry.getValue());
        }
    }
    public <T> void printList(List<T> list) {
        list.forEach(System.out::println);
    }

    public <T> void printArray(T[] array) {
        FOR.run(0, array.length, i -> {
            pln(array[i]);
        });
    }
    public static void printArray(int[] array) {
        FOR.run(0, array.length, i -> P.pln(array[i]));
    }
    public static void printArray(byte[] array) {
        FOR.run(0, array.length, i -> {
            P.pln(array[i]);
        });
    }
    public static void printArray(short[] array) {
        FOR.run(0, array.length, i -> {
            P.pln(array[i]);
        });
    }
    public static void printArray(char[] array) {
        FOR.run(0, array.length, i -> {
            P.pln(array[i]);
        });
    }
    public <T> void printList(List<T> list, Color color) {
        list.forEach(element -> P.pln(element, color));
    }
}
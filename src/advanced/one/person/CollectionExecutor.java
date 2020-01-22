package advanced.one.person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class CollectionExecutor {

    public static void main(String[] args) {
        String[] imena = new String[3];
        imena[0] = "Adnan";
        imena[1] = "Admir";
        imena[2] = "Ivana";
        //imena[3] = "Aldin";
        ArrayList<String> names = new ArrayList<>();
        names.add("Adnan");
        names.add("Admir");
        names.add("Almir");
        names.add("Almir");
        names.add("Zana");
        names.add("Zana");
        names.add("Zana");
        names.add("Ivana");
        names.add("Aldin");
        names.add("Amela");
        names.add("Alema");
        printCollection(names);
        System.out.println("");
        System.out.println("IDE LINKED LISTA");
        //LINKED list
        LinkedList<String> names1 = new LinkedList<>();
        names1.add("Adnan");
        names1.add("Admir");
        names1.add("Almir");
        names1.add("Almir");
        names1.add("Zana");
        names1.add("Zana");
        names1.add("Zana");
        names1.add("Ivana");
        names1.add("Aldin");
        names1.add("Amela");
        names1.add("Alema");
        printCollection(names1);
        //HASH SET
        System.out.println("");
        System.out.println("IDE HASH SET");
        HashSet<String> names2 = new HashSet<>();
        names2.add("Adnan");
        names2.add("Admir");
        names2.add("Almir");
        names2.add("Almir");
        names2.add("Zana");
        names2.add("Zana");
        names2.add("Zana");
        names2.add("Ivana");
        names2.add("Aldin");
        names2.add("Amela");
        names2.add("Alema");
        printCollection(names2);
        //LINKED HASH SET
        System.out.println("");
        System.out.println("LINKED HASH SET");
        LinkedHashSet<String> names3 = new LinkedHashSet<>();
        names3.add("Adnan");
        names3.add("Admir");
        names3.add("Almir");
        names3.add("Almir");
        names3.add("Zana");
        names3.add("Zana");
        names3.add("Zana");
        names3.add("Ivana");
        names3.add("Aldin");
        names3.add("Amela");
        names3.add("Alema");
        printCollection(names3);
    }

    static void printCollection(Collection<String> names) {
        for (String name : names) {
            System.out.println("Name = " + name);
        }
    }
    /*
    //DRY - DOn't repeat yourself
    static void printArrayList(ArrayList<String> names) {
        for (String name : names) {
            System.out.println("Name = " + name);
        }
    }

    static void printLinkedList(LinkedList<String> names) {
        for (String name : names) {
            System.out.println("Name = " + name);
        }
    }

    static void printHashSet(HashSet<String> names) {
        for (String name : names) {
            System.out.println("Name = " + name);
        }
    }

    static void printLinkedHashSet(LinkedHashSet<String> names) {
        for (String name : names) {
            System.out.println("Name = " + name);
        }
    }*/
}

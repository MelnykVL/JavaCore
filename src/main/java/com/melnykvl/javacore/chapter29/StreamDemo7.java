package main.java.com.melnykvl.javacore.chapter29;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class NamePhoneEmail1 {
    String name;
    String phonenum;
    String email;

    NamePhoneEmail1(String n, String p, String e) {
        name = n;
        phonenum = p;
        email = e;
    }
}

class NamePhone1 {
    String name;
    String phonenum;

    NamePhone1(String n, String p) {
        name = n;
        phonenum = p;
    }
}

public class StreamDemo7 {
    public static void main(String[] args) {

        ArrayList<NamePhoneEmail1> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail1("Ларри", "555-5555", "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail1("Джеймс", "555-4444", "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail1("Мэри", "555-333", "Mary@HerbSchildt.com"));

        Stream<NamePhone1> nameAndPhone = myList.stream().map(a -> new NamePhone1(a.name, a.phonenum));

        List<NamePhone1> npList = nameAndPhone.collect(Collectors.toList());

        System.out.println("Имена и номера телефонов в списке типа List: ");
        for (NamePhone1 e : npList)
            System.out.println(e.name + ": " + e.phonenum);

        nameAndPhone = myList.stream().map(a -> new NamePhone1(a.name, a.phonenum));

        Set<NamePhone1> npSet = nameAndPhone.collect(Collectors.toSet());

        System.out.println("\nИмена и номера телефонов в множестве типа Set: ");
        for (NamePhone1 e : npSet)
            System.out.println(e.name + ": " + e.phonenum);

        LinkedList<NamePhone1> linkedList = nameAndPhone.collect(
                                            LinkedList::new,
                                            (list, element) -> list.add(element),
                                            (listA, listB) -> listA.addAll(listB));



    }
}

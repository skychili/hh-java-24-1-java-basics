package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

/*
        int = Ganzzahlen;     1  2   3
        String = "Hier ist ein String."
        boolean = true or false
        long = 945872354225412322L;
        short = 32000;
        byte = -128 bis 127;
        float = 2,5451221F;
        double = 3,45875154512;
        char = 'a', 'b'


        Hier im bootcamp nutzen wir häufig diese Datentypen:
        String
        int
        boolean
*/


        int ageMarcel = 10;
        int ageSara = 5;

        // sout + tab
        System.out.println(ageMarcel + ageSara);
        System.out.println(ageMarcel - ageSara);
        System.out.println(ageMarcel / ageSara);
        System.out.println(ageMarcel * ageSara);

        /*/
        =       entspricht
        += 3    entspricht    x + 3
        -= 3    entspricht    x - 3

        != not equal
        >  greater than
        <  less than
        >= greater than or equal to
        <= less than or equal to


        Logical operators
        && Logical and
        || Logical or
        !  Logical not
*/


        String name = "Marcell";
        String name2 = "Aaron";

        System.out.println(name.toLowerCase());
        System.out.println(name.contains("z"));
        System.out.println(name.charAt(0));
        System.out.println(name + " " + name2);
    }
}
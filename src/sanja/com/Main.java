package sanja.com;

import sanja.com.klatch.krone.zeitung.Abonnent;
import sanja.com.klatch.krone.zeitung.Artikel;
import sanja.com.klatch.krone.zeitung.Medienverlag;
import sanja.com.klatch.krone.zeitung.PrintAbonnent;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Medienverlag klatsch= new Medienverlag();

        Artikel artikel1 =new Artikel("TITEL 1", "Baby Hund rettet Kind...");

        Artikel artikel2 =new Artikel("TITEL 2", "Campus 02 rettert eine Vogel...");


        System.out.println(" " + artikel1 +"\n" + artikel2);

//        System.out.println(artikel1);
//        System.out.println(artikel2);
 Abonnent  a = new PrintAbonnent("Peter");




    }
}

package sanja.com.klatch.krone.zeitung;

//sollte  interface implmentieren

import java.util.ArrayList;
import java.util.List;

public class Medienverlag {
    private List<Abonnent> abonneneten= new ArrayList<Abonnent>();

    public void veroffentliche(Artikel artikel1) {

        for( Abonnent a : abonneneten){
            a.erhalte(artikel1);
        }
    }

    public void addSubscriber (Abonnent  a ){
        abonneneten.add(a);
        System.out.println("Mideienverlag: Subscriber " +
                a.getName()+ "hat sich anmeldet");
    }
    public void removeSubscriber (Abonnent  a ){
        abonneneten.remove(a);
    }
}

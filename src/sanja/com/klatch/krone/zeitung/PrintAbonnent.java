package sanja.com.klatch.krone.zeitung;

public class PrintAbonnent implements  Abonnent{
    //wenn mediaenverlag einen neuen artikelln herausbringt
    private String name;

    public PrintAbonnent(String name) {
        this.name = name;
    }

    @Override
    public void erhalte(Artikel artikel) {
        System.out.println("PrintAbonnent " +
                  name + "hat eine neuen Zeiten erhelten, mit dem Artikel; "+ artikel.getTitle());

    }
}

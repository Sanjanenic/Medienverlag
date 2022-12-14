package sanja.com.klatch.krone.zeitung;

public class PrintAbonnent implements  Abonnent{
    //wenn mediaenverlag einen neuen artikelln herausbringt
    private String name;
    private Medienverlag medienverlag;

    public PrintAbonnent(String name, Medienverlag medienverlag) {

        this.name = name;
        this.medienverlag=medienverlag;
        medienverlag.addSubscriber(this);
    }

    @Override
    public void erhalte(Artikel artikel) {
        System.out.println("PrintAbonnent " +
                  name + "hat eine neuen Zeiten erhelten, mit dem Artikel; "+ artikel.getTitle());

    }

    @Override
    public String getName() {
        return null;
    }
}

package sanja.com.klatch.krone.zeitung;

public class WebAbonnent implements Abonnent{

    private String name;
    private Medienverlag medienverlag;

    public WebAbonnent(String name, Medienverlag medienverlag) {
        this.name = name;
        this.medienverlag=medienverlag;
        medienverlag.addSubscriber(this);
    }

    @Override
    public void erhalte(Artikel artikel) {
        System.out.println("WebAbonnent " +
                name + "hat eine neue Notifikation, mit dem Artikel; "+ artikel.getTitle());

    }

    @Override
    public String getName() {
        return null;
    }
}

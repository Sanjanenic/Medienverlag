package sanja.com.klatch.krone.zeitung;

public class SMSAbonnent implements Abonnent{
    String name;
    private Medienverlag medienverlag;

    public SMSAbonnent(String name, Medienverlag medienverlag) {
        this.name = name;
        this.medienverlag=medienverlag;
        medienverlag.addSubscriber(this);
    }

    @Override
    public void erhalte(Artikel artikel) {

        System.out.println("SMSAbonnent " +
                name + "hat eine neuen SMS erhelten, mit dem text; "+ artikel.getTitle());

    }

    @Override
    public String getName() {
        return null;
    }
}

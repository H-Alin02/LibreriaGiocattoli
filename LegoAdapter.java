import java.io.Serializable;

public class LegoAdapter implements GiocattoloStatico , Serializable {
    private MattonciniLego mattonciniLego;
    int numeroPezzi;
    String marca;
    String descrizione;
    double prezzo;

    public LegoAdapter(double prezzo, String marca , String descrizione , int numeroPezzi){
        mattonciniLego = new MattonciniLego(prezzo,marca,descrizione,numeroPezzi);
    }
    @Override
    public String toString() {
        return mattonciniLego.toString();
    }

    @Override
    public void gioca() {
        System.out.println("Stai giocando con i mattoncini Lego !");
    }

    @Override
    public void descrizioneStatic() {
        mattonciniLego.descizioneLego();
    }
}

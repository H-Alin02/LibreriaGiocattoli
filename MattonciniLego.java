import java.io.Serializable;

public class MattonciniLego implements LegoStore , Serializable {
    int numeroPezzi;
    String marca;
    String descrizione;
    double prezzo;

    public MattonciniLego(double prezzo , String marca , String descrizione , int numeroPezzi){
        this.prezzo = prezzo;
        this.marca = marca;
        this.descrizione = descrizione;
        this.numeroPezzi = numeroPezzi;
    }

    @Override
    public String toString() {
        return "MattonciniLego{" +
                "numeroPezzi=" + numeroPezzi +
                ", marca='" + marca + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
    @Override
    public String assemblaLego() {
        return "Stai assemblando un giocattolo Lego";
    }

    @Override
    public void descizioneLego() {
        System.out.println("Stai giocando con i mattoncini della Lego");
    }
}

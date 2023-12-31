import java.io.Serializable;

public class MacchininaTelecomandata implements GiocattoloElettrico , Serializable {
    double prezzo;
    String marca;
    String descrizione;

    public MacchininaTelecomandata(double prezzo, String marca, String descrizione){
        this.prezzo = prezzo;
        this.marca = marca;
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "MacchininaTelecomandata{" +
                "prezzo=" + prezzo +
                ", marca='" + marca + '\'' +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }


    @Override
    public void gioca() {
        System.out.println("Stai giocando con una macchinina telecomandata !");
    }

    @Override
    public void utilizzaPile() {

    }
}

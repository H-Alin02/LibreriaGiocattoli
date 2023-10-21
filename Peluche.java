import java.io.Serializable;

public class Peluche implements GiocattoloStatico , Serializable {
    double prezzo;
    double altezza;
    String marca, descrizione;

    public Peluche(double prezzo, String marca, String descrizione, double altezza){
        this.prezzo = prezzo;
        this.marca = marca;
        this.descrizione = descrizione;
        this.altezza = altezza;
    }

    @Override
    public String toString() {
        return "Peluche{" +
                "prezzo=" + prezzo +
                ", altezza=" + altezza +
                ", marca='" + marca + '\'' +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }



    @Override
    public void descrizioneStatic() {
        System.out.println("Stai giocando con un giocattolo statico !!");
    }
}

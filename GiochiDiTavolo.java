import java.io.Serializable;

public class GiochiDiTavolo implements GiocattoloStatico , Serializable {
    double prezzo;
    String marca, descrizione, etaConsigliata;
    int numeroGiocatori;

    public GiochiDiTavolo(double prezzo, String marca, String descrizione, String etaConsigliata, int numeroGiocatori){
        this.prezzo = prezzo;
        this.marca = marca;
        this.descrizione = descrizione;
        this.etaConsigliata = etaConsigliata;
        this.numeroGiocatori = numeroGiocatori;
    }

    @Override
    public String toString() {
        return "GiochiDiTavolo{" +
                "prezzo=" + prezzo +
                ", marca='" + marca + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", etaConsigliata='" + etaConsigliata + '\'' +
                ", numeroGiocatori=" + numeroGiocatori +
                '}';
    }


    @Override
    public void gioca() {
        System.out.println("Stai giocando con un gioco da tavolo !");
    }

    @Override
    public void descrizioneStatic() {
        System.out.println("Stai giocando con un giocattolo statico !!");
    }
}

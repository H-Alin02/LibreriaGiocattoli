import java.io.Serializable;

public class PupazzoSnodabile implements GiocattoloMeccanico , Serializable {
    double prezzo;
    String marca;
    String descrizione;

    public PupazzoSnodabile(double prezzo, String marca, String descrizione){
        this.prezzo = prezzo;
        this.marca = marca;
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "PupazzoSnodabile{" +
                "prezzo=" + prezzo +
                ", marca='" + marca + '\'' +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }


    @Override
    public void gioca() {
        System.out.println("Stai giocando con un pupazzo snodabile !");
    }

    @Override
    public void descrizioneMeccanico() {

    }
}

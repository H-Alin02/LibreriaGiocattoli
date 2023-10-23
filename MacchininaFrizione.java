import java.io.Serializable;

public class MacchininaFrizione implements GiocattoloMeccanico , Serializable {
    double prezzo;
    String marca;
    String descrizione;

    public MacchininaFrizione(double prezzo, String marca, String descrizione){
        this.prezzo = prezzo;
        this.marca = marca;
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "MacchininaFrizione{" +
                "prezzo=" + prezzo +
                ", marca='" + marca + '\'' +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }


    @Override
    public void gioca() {
        System.out.println("Stai giocando con una Macchinina a frizione !");
    }

    @Override
    public void descrizioneMeccanico() {

    }
}

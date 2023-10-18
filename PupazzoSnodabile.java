public class PupazzoSnodabile implements GiocattoloMeccanico{
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
    public String gioca() {
        return null;
    }

    @Override
    public void descrizioneMeccanico() {

    }
}

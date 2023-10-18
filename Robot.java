public class Robot implements GiocattoloElettrico{
    double prezzo;
    String marca;
    String descrizione;

    public Robot(double prezzo, String marca, String descrizione){
        this.prezzo = prezzo;
        this.marca = marca;
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "Robot{" +
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
    public void utilizzaPile() {

    }
}

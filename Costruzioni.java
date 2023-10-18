public class Costruzioni implements GiocattoloStatico{
    int numeroPezzi;
    String marca, descrizione;
    double prezzo;

    public Costruzioni(double prezzo, String marca, String descrizione, int numeroPezzi){
        this.prezzo = prezzo;
        this.marca = marca;
        this.descrizione = descrizione;
        this.numeroPezzi = numeroPezzi;
    }

    @Override
    public String toString() {
        return "Costruzioni{" +
                "numeroPezzi=" + numeroPezzi +
                ", marca='" + marca + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }

    @Override
    public String gioca() {
        return null;
    }

    @Override
    public void descrizioneStatic() {

    }
}

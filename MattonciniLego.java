import java.sql.SQLOutput;

public class MattonciniLego implements LegoStore{
    @Override
    public String assemblaLego() {
        return "Stai assemblando un giocattolo Lego";
    }

    @Override
    public void descizioneLego() {
        System.out.println("Stai giocando con i mattoncini della Lego");
    }
}

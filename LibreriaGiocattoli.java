import java.util.ArrayList;
import java.util.Scanner;
public class LibreriaGiocattoli {
    static ArrayList<GiocattoloMeccanico> ListaGiocattoliMeccanici = new ArrayList<>();
    static ArrayList<GiocattoloStatico> ListaGiocattoliStatici = new ArrayList<>();
    static ArrayList<GiocattoloElettrico> ListaGiocattoliElettrici = new ArrayList<>();
    static GiocattoliFactory factory = new GiocattoliFactoryImp();
    static Scanner in = new Scanner(System.in);
    static int choice = 0;

    public static void main(String[] args) {
        System.out.println("""
                Benvenuto nella libreria virtuale dei tuoi giocattoli!!
                Che operazione desideri effettuare ?""");

        while (choice != -1) {
            System.out.print("""
                ------------------------------------------------------------
                [1] Aggiungi un giocattolo Meccanico                        |
                [2] Aggiungi un giocattolo Statico                          |
                [3] Aggiungi un giocattolo Elettronico                      |
                [4] Visualizza la lista di tutti i giocattoli disponibili   |
                [-1] ESCI                                                   |
                (?) ---> """);
            choice = Integer.parseInt(in.nextLine().strip());
            System.out.println("------------------------------------------------------------");
            switch (choice) {
                case 1:
                    System.out.println("""
                            Scegli che giocattolo Meccanico vuoi inserire :
                            [1] Aggiungi una Macchina a Frizione
                            [2] Aggiungi un PupazzoSnodabile""");
                    choice = Integer.parseInt(in.nextLine());
                    if (choice == 1) ListaGiocattoliMeccanici.add(factory.creaGiocattoloMeccanico(1));
                    if (choice == 2) ListaGiocattoliMeccanici.add(factory.creaGiocattoloMeccanico(2));
                    //TODO else fai rifare la scelta dei giocattoli meccanici da inserire
                    break;
                case 2:
                    System.out.println("""
                            Scegli che giocattolo Meccanico vuoi inserire :
                            [1] Aggiungi delle costruzioni
                            [2] Aggiungi un Peluche
                            [3] Aggiungi un Gioco da Tavolo""");
                    choice = Integer.parseInt(in.nextLine());
                    if (choice == 1) ListaGiocattoliStatici.add(factory.creaGiocattoloStatico(1));
                    if (choice == 2) ListaGiocattoliStatici.add(factory.creaGiocattoloStatico(2));
                    if (choice == 3) ListaGiocattoliStatici.add(factory.creaGiocattoloStatico(3));
                    //TODO else fai rifare la scelta dei giocattoli Statici da inserire
                    break;

                case 3:
                    System.out.println("""
                            Scegli che giocattolo Meccanico vuoi inserire :
                            [1] Aggiungi una Macchinia Telecomandata
                            [2] Aggiungi un Robot""");
                    choice = Integer.parseInt(in.nextLine());
                    if (choice == 1) ListaGiocattoliElettrici.add(factory.creaGiocattoloElettrico(1));
                    if (choice == 2) ListaGiocattoliElettrici.add(factory.creaGiocattoloElettrico(2));
                    //TODO else fai rifare la scelta dei giocattoli Elettrici da inserire
                    break;
                case 4:
                    System.out.println("\nI TUOI GIOCATTOLI MECCANICI : ");
                    for(GiocattoloMeccanico g : ListaGiocattoliMeccanici ) {
                        System.out.println(g.toString());
                    }
                    System.out.println("\nI TUOI GIOCATTOLI STATICI");
                    for(GiocattoloStatico g : ListaGiocattoliStatici) {
                        System.out.println(g.toString());
                    }
                    System.out.println("\nI TUOI GIOCATTOLI ELETTRICI");
                    for(GiocattoloElettrico g : ListaGiocattoliElettrici) {
                        System.out.println(g.toString());
                    }
                    break;

                default:
                    System.out.println("Hai inserito il numero sbagliato !");
                    break;
            }
        }
    }
}
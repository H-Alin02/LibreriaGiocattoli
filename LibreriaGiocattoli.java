
import java.util.*;
public class LibreriaGiocattoli {
    private static int choice;
    GiocattoliFactory factory = new GiocattoliFactoryImp();
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\n\nBenvenuto nella libreria virtuale dei tuoi giocattoli!!\n" +
                            "Che operazione desideri effettuare ? ");

        System.out.println("[1] Aggiungi un giocattolo Meccanico"+"\n"+
                            "[2] Aggiungi un giocattolo Statico"+"\n"+
                            "[3] Aggiungi un giocattolo Elettronico"+"\n"
                             );
        choice = Integer.parseInt(in.nextLine());
        switch (choice){
            case 1 :
                System.out.println("Scegli che giocattolo Meccanico vuoi inserire"+"\n+" +
                                    "[1] Aggiungi una Macchina a Frizione+\n+" +
                                    "[2] Aggiungi un PupazzoSnodabile");
                choice = Integer.parseInt(in.nextLine());
                if(choice == 1) //aggiungi oggetto alla libreria;
                if(choice == 2) //aggiungi oggetto alla libreria;
                //else fai rifare la scelta dei giocattoli meccanici da inserire
                break;

            case 2:
                break;

            case 3:
                break;

        }




    }
}
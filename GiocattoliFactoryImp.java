import java.awt.*;
import java.util.Scanner;

public class GiocattoliFactoryImp implements GiocattoliFactory{
    Scanner in = new Scanner(System.in);
    String marca, descrizione, etaConsigliata;
    double prezzo, altezza;
    int numeroPezzi, numeroGiocatori;

    @Override
    public GiocattoloMeccanico creaGiocattoloMeccanico(int s) {
        if( s == 1){
            System.out.println("Inserisci il prezzo : ");
            prezzo = Double.parseDouble(in.nextLine());
            System.out.println("Inserisci la marca : ");
            marca = in.nextLine();
            System.out.println("Inserisci la descrizione : ");
            descrizione = in.nextLine();


            return new MacchininaFrizione(prezzo,marca,descrizione);
        }else if( s == 2) {
            System.out.println("Inserisci il prezzo : ");
            prezzo = Double.parseDouble(in.nextLine());
            System.out.println("Inserisci la marca : ");
            marca = in.nextLine();
            System.out.println("Inserisci la descrizione : ");
            descrizione = in.nextLine();

            return new PupazzoSnodabile(prezzo,marca,descrizione);
        }else return null;
    }

    @Override
    public GiocattoloStatico creaGiocattoloStatico(int k) {
        if( k == 3) {
        System.out.println("Inserisci il prezzo : ");
        prezzo = Double.parseDouble(in.nextLine());
        System.out.println("Inserisci la marca : ");
        marca = in.nextLine();
        System.out.println("Inserisci la descrizione : ");
        descrizione = in.nextLine();

        return (GiocattoloStatico) new MacchininaTelecomandata(prezzo,marca,descrizione);
        }else if( k == 4) {
        System.out.println("Inserisci il prezzo : ");
        prezzo = Double.parseDouble(in.nextLine());
        System.out.println("Inserisci la marca : ");
        marca = in.nextLine();
        System.out.println("Inserisci la descrizione : ");
        descrizione = in.nextLine();

        return (GiocattoloStatico) new Robot(prezzo,marca,descrizione);
        }else return null;
    }

    @Override
    public GiocattoloElettrico creaGiocattoloElettrico(int p){
        if( p == 4) {
        System.out.println("Inserisci il prezzo : ");
        prezzo = Double.parseDouble(in.nextLine());
        System.out.println("Inserisci la marca : ");
        marca = in.nextLine();
        System.out.println("Inserisci la descrizione : ");
        descrizione = in.nextLine();
        System.out.println("Inserisci il numero di pezzi : ");
        numeroPezzi = Integer.parseInt(in.nextLine());

        return (GiocattoloElettrico) new Costruzioni(prezzo,marca,descrizione,numeroPezzi);
        }else if( p == 5) {
        System.out.println("Inserisci il prezzo : ");
        prezzo = Double.parseDouble(in.nextLine());
        System.out.println("Inserisci la marca : ");
        marca = in.nextLine();
        System.out.println("Inserisci la descrizione : ");
        descrizione = in.nextLine();
        System.out.println("Inserisci l'altezza : ");
        altezza = Double.parseDouble(in.nextLine());

        return (GiocattoloElettrico) new Peluche(prezzo,marca,descrizione,altezza);
        }else if( p == 6) {
        System.out.println("Inserisci il prezzo : ");
        prezzo = Double.parseDouble(in.nextLine());
        System.out.println("Inserisci la marca : ");
        marca = in.nextLine();
        System.out.println("Inserisci la descrizione : ");
        descrizione = in.nextLine();
        System.out.println("l'eta consigliata : ");
        etaConsigliata = in.nextLine();
        System.out.println("Inserisci il numero di giocatori : ");
        numeroGiocatori = Integer.parseInt(in.nextLine());

        return (GiocattoloElettrico) new GiochiDiTavolo(prezzo,marca,descrizione,etaConsigliata,numeroGiocatori);
        }else return null;
    }
}

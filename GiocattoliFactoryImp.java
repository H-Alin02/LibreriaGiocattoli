import java.awt.*;
import java.util.Scanner;

public class GiocattoliFactoryImp implements GiocattoliFactory{
    Scanner in = new Scanner(System.in);
    String marca, descrizione, etaConsigliata;
    double prezzo, altezza;
    int numeroPezzi, numeroGiocatori;
    @Override
    public Giocattolo creaGiocattolo(String s) {
        if(s == null){
            return null;
        }
        if( s.equalsIgnoreCase("macchinina frizione")){
            System.out.println("Inserisci il prezzo : ");
            prezzo = Double.parseDouble(in.nextLine());
            System.out.println("Inserisci la marca : ");
            marca = in.nextLine();
            System.out.println("Inserisci la descrizione : ");
            descrizione = in.nextLine();


            return new MacchininaFrizione(prezzo,marca,descrizione);
        }else if( s.equalsIgnoreCase("pupazzo snodabile")) {
            System.out.println("Inserisci il prezzo : ");
            prezzo = Double.parseDouble(in.nextLine());
            System.out.println("Inserisci la marca : ");
            marca = in.nextLine();
            System.out.println("Inserisci la descrizione : ");
            descrizione = in.nextLine();

            return new PupazzoSnodabile(prezzo,marca,descrizione);
        } else if( s.equalsIgnoreCase("macchina telecomandata")) {
            System.out.println("Inserisci il prezzo : ");
            prezzo = Double.parseDouble(in.nextLine());
            System.out.println("Inserisci la marca : ");
            marca = in.nextLine();
            System.out.println("Inserisci la descrizione : ");
            descrizione = in.nextLine();

            return new MacchininaTelecomandata(prezzo,marca,descrizione);
        }else if( s.equalsIgnoreCase("robot")) {
            System.out.println("Inserisci il prezzo : ");
            prezzo = Double.parseDouble(in.nextLine());
            System.out.println("Inserisci la marca : ");
            marca = in.nextLine();
            System.out.println("Inserisci la descrizione : ");
            descrizione = in.nextLine();

            return new Robot(prezzo,marca,descrizione);
        }else if( s.equalsIgnoreCase("costruzioni")) {
            System.out.println("Inserisci il prezzo : ");
            prezzo = Double.parseDouble(in.nextLine());
            System.out.println("Inserisci la marca : ");
            marca = in.nextLine();
            System.out.println("Inserisci la descrizione : ");
            descrizione = in.nextLine();
            System.out.println("Inserisci il numero di pezzi : ");
            numeroPezzi = Integer.parseInt(in.nextLine());

            return new Costruzioni(prezzo,marca,descrizione,numeroPezzi);
        }else if( s.equalsIgnoreCase("peluche")) {
            System.out.println("Inserisci il prezzo : ");
            prezzo = Double.parseDouble(in.nextLine());
            System.out.println("Inserisci la marca : ");
            marca = in.nextLine();
            System.out.println("Inserisci la descrizione : ");
            descrizione = in.nextLine();
            System.out.println("Inserisci l'altezza : ");
            altezza = Double.parseDouble(in.nextLine());

            return new Peluche(prezzo,marca,descrizione,altezza);
        }else if( s.equalsIgnoreCase("giochi di tavolo")) {
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

            return new GiochiDiTavolo(prezzo,marca,descrizione,etaConsigliata,numeroGiocatori);
        }
        else return null;
    }
}

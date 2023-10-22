import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class LibreriaGiocattoli extends JFrame {
    //Liste dei Giocattoli
    static ArrayList<GiocattoloMeccanico> ListaGiocattoliMeccanici = new ArrayList<>();
    static ArrayList<GiocattoloStatico> ListaGiocattoliStatici = new ArrayList<>();
    static ArrayList<GiocattoloElettrico> ListaGiocattoliElettrici = new ArrayList<>();

    //Factory che costruisce i vari giocattoli
    static GiocattoliFactory factory = new GiocattoliFactoryImp();

    //Input utente
    static Scanner in = new Scanner(System.in);
    static int choice = 0;

    // File di salvataggio dati
    static String nomeFileMeccanici = "giocattoliMeccanici.dat";
    static String nomeFileStatici = "giocattoliStatici.dat";
    static String nomeFileElettrici = "giocattoliElettrici.dat";

    //Factory dei SetMerenda
    static FactorySetFrozen f = new FactorySetFrozen();
    static FactorySetAvengers a = new FactorySetAvengers();
    static FactorySetNinja n = new FactorySetNinja();
    public static void main(String[] args) {
        getDataMeccanici();
        getDataStatici();
        getDataElettrici();

        System.out.println("""
                Benvenuto nella libreria virtuale dei tuoi giocattoli!!
                Che operazione desideri effettuare ?""");

        while (choice != -1) {
            menu();
            choice = Integer.parseInt(in.nextLine().strip());
            System.out.println("------------------------------------------------------------");
            switch (choice) {
                case 1:
                    GiocattoloMeccanico giocattoloMeccanico;
                    System.out.println("""
                            Scegli che giocattolo Meccanico vuoi inserire :
                            [1] Aggiungi una Macchina a Frizione
                            [2] Aggiungi un PupazzoSnodabile""");
                    choice = Integer.parseInt(in.nextLine());
                    if (choice == 1) {
                        giocattoloMeccanico = factory.creaGiocattoloMeccanico(1);
                        ListaGiocattoliMeccanici.add(giocattoloMeccanico);
                        putDataMeccanici();
                    }
                    if (choice == 2) {
                        giocattoloMeccanico = factory.creaGiocattoloMeccanico(2);
                        ListaGiocattoliMeccanici.add(giocattoloMeccanico);
                        putDataMeccanici();
                    }
                    break;
                case 2:
                    GiocattoloStatico giocattoloStatico ;
                    System.out.println("""
                            Scegli che giocattolo Meccanico vuoi inserire :
                            [1] Aggiungi delle costruzioni
                            [2] Aggiungi un Peluche
                            [3] Aggiungi un Gioco da Tavolo
                            [4] Aggiungi un Giocattolo LEGO""");
                    choice = Integer.parseInt(in.nextLine());
                    if (choice == 1){
                        giocattoloStatico = factory.creaGiocattoloStatico(1);
                        ListaGiocattoliStatici.add(giocattoloStatico);
                        putDataStatici();
                    }
                    if (choice == 2) {
                        giocattoloStatico = factory.creaGiocattoloStatico(2);
                        ListaGiocattoliStatici.add(giocattoloStatico);
                        putDataStatici();
                    }
                    if (choice == 3){
                        giocattoloStatico = factory.creaGiocattoloStatico(3);
                        ListaGiocattoliStatici.add(giocattoloStatico);
                        putDataStatici();
                    }
                    if(choice == 4){
                        giocattoloStatico = factory.creaGiocattoloStatico(4);
                        ListaGiocattoliStatici.add(giocattoloStatico);
                        putDataStatici();
                    }
                    break;
                case 3:
                    GiocattoloElettrico giocattoloElettrico;
                    System.out.println("""
                            Scegli che giocattolo Meccanico vuoi inserire :
                            [1] Aggiungi una Macchinia Telecomandata
                            [2] Aggiungi un Robot""");
                    choice = Integer.parseInt(in.nextLine());
                    if (choice == 1){
                        giocattoloElettrico = factory.creaGiocattoloElettrico(1);
                        ListaGiocattoliElettrici.add(giocattoloElettrico);
                        putDataElettrici();
                    }
                    if (choice == 2){
                        giocattoloElettrico = factory.creaGiocattoloElettrico(2);
                        ListaGiocattoliElettrici.add(giocattoloElettrico);
                        putDataElettrici();
                    }
                    break;
                case 4:
                    System.out.println("\nI TUOI GIOCATTOLI MECCANICI : ");
                    for(GiocattoloMeccanico g : ListaGiocattoliMeccanici ) {
                        System.out.println(ListaGiocattoliMeccanici.indexOf(g) + " - " + g.toString());
                    }
                    System.out.println("\nI TUOI GIOCATTOLI STATICI : ");
                    for(GiocattoloStatico g : ListaGiocattoliStatici) {
                        System.out.println(ListaGiocattoliStatici.indexOf(g) + " - " + g.toString());
                    }
                    System.out.println("\nI TUOI GIOCATTOLI ELETTRICI : ");
                    for(GiocattoloElettrico g : ListaGiocattoliElettrici) {
                        System.out.println(ListaGiocattoliElettrici.indexOf(g) + " - " + g.toString());
                    }
                    break;
                case 5 :
                    System.out.println("\nIndica l'indice del giocattolo Meccanico che vuoi eliminare : ");
                    for(GiocattoloMeccanico g : ListaGiocattoliMeccanici ) {
                        System.out.println(ListaGiocattoliMeccanici.indexOf(g) + " - " + g.toString());
                    }
                    System.out.print("(?)---> ");
                    choice = Integer.parseInt(in.nextLine().strip());
                    ListaGiocattoliMeccanici.remove(choice);
                    putDataMeccanici();
                    break;
                case 6 :
                    System.out.println("\nIndica l'indice del giocattolo Statico che vuoi eliminare : ");
                    for(GiocattoloStatico g : ListaGiocattoliStatici ) {
                        System.out.println(ListaGiocattoliStatici.indexOf(g) + " - " + g.toString());
                    }
                    System.out.print("(?)---> ");
                    choice = Integer.parseInt(in.nextLine().strip());
                    ListaGiocattoliStatici.remove(choice);
                    putDataStatici();
                    break;
                case 7 :
                    System.out.println("\nIndica l'indice del giocattolo Elettrico che vuoi eliminare : ");
                    for(GiocattoloElettrico g : ListaGiocattoliElettrici ) {
                        System.out.println(ListaGiocattoliElettrici.indexOf(g) + " - " + g.toString());
                    }
                    System.out.print("(?)---> ");
                    choice = Integer.parseInt(in.nextLine().strip());
                    ListaGiocattoliElettrici.remove(choice);
                    putDataElettrici();
                    break;
                case 8 :
                    SetMerendaFrozen setF = new SetMerendaFrozen(f.setPosatine(),f.setTovaglietta(),f.setPortaMerenda(), f.setBorraccia());
                    setF.getPortaMerenda().apriPortaMerenda();
                    setF.getTovaglietta().usaTovaglietta();
                    setF.getPosatine().mangia();
                    setF.getBorraccia().bevi();
                    break;
                case 9 :
                    SetMerendaAvengers setA = new SetMerendaAvengers(a.setPosatine(),a.setTovaglietta(),a.setPortaMerenda(), a.setBorraccia());
                    setA.getPortaMerenda().apriPortaMerenda();
                    setA.getTovaglietta().usaTovaglietta();
                    setA.getPosatine().mangia();
                    setA.getBorraccia().bevi();
                    break;
                case 10 :
                    SetMerendaNinja setN = new SetMerendaNinja(n.setPosatine(),n.setTovaglietta(),n.setPortaMerenda(), n.setBorraccia());
                    setN.getPortaMerenda().apriPortaMerenda();
                    setN.getTovaglietta().usaTovaglietta();
                    setN.getPosatine().mangia();
                    setN.getBorraccia().bevi();
                    break;
                case 11 :
                    SwingUtilities.invokeLater(() -> {
                        JFrame frame = new JFrame("Visualizzazione Immagine");
                        JLabel imageLabel = new JLabel();
                        ImageIcon imageIcon = new ImageIcon("volantino.png");
                        imageLabel.setIcon(imageIcon);
                        JScrollPane scrollPane = new JScrollPane(imageLabel);
                        scrollPane.setPreferredSize(new Dimension(800,600));

                        frame.getContentPane().add(scrollPane);
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.pack();
                        frame.setLocationRelativeTo(null);
                        frame.setVisible(true);
                    });
                    break;
                case -1 :
                    break;
                default:
                    System.out.println("Hai inserito il numero sbagliato !");
                    break;
            }
        }

    }

    private static void putDataMeccanici() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(nomeFileMeccanici))){
            objectOutputStream.writeObject(ListaGiocattoliMeccanici);
        }catch (IOException e){ e.printStackTrace();}
    }

    private static void putDataStatici() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(nomeFileStatici))){
            objectOutputStream.writeObject(ListaGiocattoliStatici);
        }catch (IOException e){ e.printStackTrace();}
    }

    private static void putDataElettrici() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(nomeFileElettrici))){
            objectOutputStream.writeObject(ListaGiocattoliElettrici);
        }catch (IOException e){ e.printStackTrace();}
    }

    private static void getDataMeccanici() {
        try {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(nomeFileMeccanici))) {
                ListaGiocattoliMeccanici = (ArrayList<GiocattoloMeccanico>) objectInputStream.readObject();
            } catch (EOFException ignored) {
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void getDataStatici() {
        try {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(nomeFileStatici))) {
                ListaGiocattoliStatici = (ArrayList<GiocattoloStatico>) objectInputStream.readObject();
            } catch (EOFException ignored) {
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void getDataElettrici() {
        try {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(nomeFileElettrici))) {
                ListaGiocattoliElettrici = (ArrayList<GiocattoloElettrico>) objectInputStream.readObject();
            } catch (EOFException ignored) {
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static void menu() {
        System.out.print("""
            ------------------------------------------------------------
            [1]  + Aggiungi un giocattolo Meccanico                      |
            [2]  + Aggiungi un giocattolo Statico                        |
            [3]  + Aggiungi un giocattolo Elettronico                    |
                                                                         |
            [4]  Visualizza la lista di tutti i giocattoli disponibili   |
                                                                         |
            [5]  - Elimina un giocattolo Meccanico                       |
            [6]  - Elimina un giocattolo Statico                         |
            [7]  - Elimina un giocattolo Elettrocino                     |
                                                                         |
            [8] + Utilizza Set Merenda Frozen                            |
            [9] + Utilizza Set Merenda Avengers                          |                         
            [10] + Utilizza Set Merenda Ninja                            |
            [-1] ESCI X                                                  |
            (?) --->""");
    }
}
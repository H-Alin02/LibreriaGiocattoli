public class Main {
    public static void main(String[] args) {

        Peluche Peluche = new Peluche(19.50,"Disney","Peluche di cenerentola",30);
        System.out.println("\n"+Peluche.gioca());
        Peluche.descrizioneStatic();

        Costruzioni costruzioni = new Costruzioni(10,"Bho","costruzioni di tutti i colori",20);
        System.out.println("\n"+costruzioni.gioca());
        costruzioni.descrizioneStatic();

        GiochiDiTavolo giochiDiTavolo = new GiochiDiTavolo(20,"Monopoly","Gioco classico monopoly","10-99",5);
        System.out.println("\n" + giochiDiTavolo.gioca());
        giochiDiTavolo.descrizioneStatic();


    }
}
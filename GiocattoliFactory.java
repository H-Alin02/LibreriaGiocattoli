public interface GiocattoliFactory {
    GiocattoloMeccanico creaGiocattoloMeccanico(int s);
    GiocattoloStatico creaGiocattoloStatico(int k);
    GiocattoloElettrico creaGiocattoloElettrico(int p);
}

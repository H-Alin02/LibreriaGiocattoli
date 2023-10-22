public class SetMerendaAvengers {
    private PosatineAvengers posatine;
    private TovagliettaAvengers tovaglietta;
    private PortaMerendaAvengers portaMerenda;
    private BorracciaAvengers borraccia;

    public SetMerendaAvengers(PosatineAvengers posatine , TovagliettaAvengers tovaglietta , PortaMerendaAvengers portaMerenda , BorracciaAvengers borraccia){
        this.posatine = posatine;
        this.tovaglietta = tovaglietta;
        this.portaMerenda = portaMerenda;
        this.borraccia = borraccia;
    }

    public BorracciaAvengers getBorraccia() {
        return borraccia;
    }

    public PortaMerendaAvengers getPortaMerenda() {
        return portaMerenda;
    }

    public PosatineAvengers getPosatine() {
        return posatine;
    }

    public TovagliettaAvengers getTovaglietta() {
        return tovaglietta;
    }
}

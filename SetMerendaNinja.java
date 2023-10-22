public class SetMerendaNinja {
    private PosatineNinja posatine;
    private TovagliettaNinja tovaglietta;
    private PortaMerendaNinja portaMerenda;
    private BorracciaNinja borraccia;

    public SetMerendaNinja(PosatineNinja posatine , TovagliettaNinja tovaglietta , PortaMerendaNinja portaMerenda , BorracciaNinja borraccia){
        this.posatine = posatine;
        this.tovaglietta = tovaglietta;
        this.portaMerenda = portaMerenda;
        this.borraccia = borraccia;
    }

    public BorracciaNinja getBorraccia() {
        return borraccia;
    }

    public PortaMerendaNinja getPortaMerenda() {
        return portaMerenda;
    }

    public PosatineNinja getPosatine() {
        return posatine;
    }

    public TovagliettaNinja getTovaglietta() {
        return tovaglietta;
    }
}

public class Etat1 implements IEtat {
    @Override
    public void evenement1(Automate a) {
        a.changementEtat(new Etat2());
    }

    @Override
    public void evenement2(Automate a) {

    }
}

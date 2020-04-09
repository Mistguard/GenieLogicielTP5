public class Etat2 implements IEtat {
    @Override
    public void evenement1(Automate a) {

    }

    @Override
    public void evenement2(Automate a) {
        a.changementEtat(new Etat1());
        X x = a.getControlee();
        x.action2();
    }
}

public class Etat1 implements IEtat {
    @Override
    public void evenement1(Automate a) {
        System.out.println("Je passe dans l'état 2");
        X x = a.getControlee();
        x.action1();
        a.changementEtat(new Etat2());
    }

    @Override
    public void evenement2(Automate a) {

    }
}


public class Automate implements IEvenement {

    public IEtat etatCourant;

    public void changementEtat(IEtat etat){
        etatCourant = etat;
    }

    @Override
    public void evenement1() {
        etatCourant.evenement1(this);
    }

    @Override
    public void evenement2() {
        etatCourant.evenement2(this);
    }
}

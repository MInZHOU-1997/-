package charactor;

public class Hero {
    public String name;
    protected float hp;

    public void kill(Mortal m) {
        m.die();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        ADHero ad = new ADHero();
        APHero ap = new APHero();
        ADAHero ada = new ADAHero();
        h.kill(ad);
        h.kill(ap);
        h.kill(ada);

    }
}

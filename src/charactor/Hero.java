package charactor;

public class Hero {
    public String name;
    protected float hp;

    public void kill(Mortal m) {
        m.die();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "盖伦";
        ADHero ad = new ADHero();
        APHero ap = new APHero();
        ADAHero ada = new ADAHero();
        h.kill(ad);
        h.kill(ap);
        h.kill(ada);
        System.out.println(h.toString());
        //直接打印对象就是打印该对象的toString()返回值
        System.out.println(h);

    }
}

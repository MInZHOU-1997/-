package charactor;

public class Hero {
    public String name;
    protected float hp;
    // 非静态内部类，只有一个外部类对象存在的时候，才有意义
    // 战斗成绩只有在一个英雄对象存在的时候才有意义
    class BattleScore {
        int kill;
        int die;
        int assit;

        public void legendary() {
            if (kill >= 8)
                System.out.println(name + "超神！");
            else
                System.out.println(name + "尚未超神！");
        }
    }
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

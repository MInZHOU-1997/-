public class Support extends Hero{
    public void heal(){
        System.out.println("我可以给队友加血");
    }
    public void heal(Hero h){
        System.out.println("我可以给队友"+h.name+"加血");

    }
    public void heal(Hero h, int hp){
        System.out.println("我可以给队友"+h.name+"加"+hp+"的血");
    }
}

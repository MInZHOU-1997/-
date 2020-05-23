package Animal;
public class Spider extends Animal{
    protected Spider(int legs){
        super(8);
    }
    @Override
    public void eat(){
        System.out.println("蜘蛛吃");
    }
}

package Animal;

 public class Cat extends Animal implements Pet{
    private String name;

    Cat(String name){
        super(4);
        this.name = name;

    }
    Cat()
    {
        super(4);

    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public void play(){
        System.out.println("猫在玩");
    }
    @Override
     public void eat(){
        System.out.println("猫吃饭");
    }
}

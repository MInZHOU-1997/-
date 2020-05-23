package Animal;

public class Fish extends Animal implements Pet{
    private String name;
    Fish(){
        super(0);
    }
    @Override
    public void eat(){
        System.out.println("鱼吃东西");
    }
    @Override
    public void walk(int legs){
        System.out.println("鱼不能走且没有腿");
    }
    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public void play(){
        System.out.println("鱼在水力追蝌蚪");
    }

}

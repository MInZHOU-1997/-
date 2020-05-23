package Animal;

public abstract class Animal{
    protected int legs;
    protected Animal(int legs){
        this.legs = legs;
    }
    public abstract void eat();
    public void walk(int legs){
        System.out.println("用"+legs+"腿来走路");
    }
}

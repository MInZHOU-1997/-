import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    float getArmor(){
        return armor;
    }
    void keng(){
        System.out.println("坑队友");
    }
    void addSpeed(int speed){
        moveSpeed = moveSpeed+speed;
    }
    void legendary(){
        System.out.println("超神！");
    }
    float getHp(){
        return hp;
    }
    void recovery(float blood){
        hp = hp+blood;
    }
    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = 616.27f;
        garen.moveSpeed = 350;
        garen.addSpeed(100);
        garen.recovery(200);
        System.out.println(garen.name+"盖伦的回血量是"+garen.hp);

    }
}

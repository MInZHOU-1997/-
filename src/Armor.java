public class Armor extends Item{
    int ac;//护甲等级

    public static void main(String[] args) {
        Armor bujia = new Armor();
        Armor suozi = new Armor();
        bujia.name = "布甲";
        bujia.ac = 15;
        bujia.price = 300;
        suozi.ac = 40;
        suozi.price = 500;
        suozi.name = "锁子甲";


    }
}

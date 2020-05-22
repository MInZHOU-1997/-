package property;

public class Item {
    String name;
    int price;

    public void buy(){
        System.out.println("购买");
    }
    public void effect() {
        System.out.println("物品使用后，可以有效果");
    }
    @Override
    public String toString(){
        return name+price;
    }
    @Override
    public void finalize(){
        System.out.println(name+"正在被回收");
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof Item){
            Item i = (Item)o;
            if(i.price == this.price )
                return true;
        }
        return false;
    }
}

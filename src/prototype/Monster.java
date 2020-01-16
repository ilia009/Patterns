package prototype;


//prototype
public abstract class Monster implements Cloneable {
    private String title;
    private int damage;

    abstract void roar();

    public String getTitle() {
        return title;
    }

    public Monster setTitle(String title) {
        this.title = title;
        return this;
    }

    public int getDamage() {
        return damage;
    }

    public Monster setDamage(int damage) {
        this.damage = damage;
        return this;
    }

    public Object clone(){
        Object obj = null;

        try{
            obj = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return obj;
    }
}

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;
    
    public void heal(Hero h) {
        int basePoint=10;
        int recovPoint=(int)(basePoint*this.getWand().getPower());
        h.setHp(h.getHp()+recovPoint);
        System.out.println(h.getName()+"のHPを"+recovPoint+"回復した");
    }
    
    public int getHp() {return this.hp;}
    public int setHp(int hp) {
        if (hp<0) {
            this.hp=0;
        }
        this.hp=hp;
    }
    
    public int getMp() {return this.mp;}
    public int setMp(int mp) {
        if (mp<0) {
            this.mp=0;
        }
        this.mp=mp;
    }
    
    public String getName() {return this.name;}
    public String setName(name) {this.name=name;}
    public Wand getWand() {return this.wand;}
    public Wand setWand(wand) {this.wand=wand;}
    
}


public class Hero extends Character {
    public void attack(Monster m) {
        System.out.println(this.name+"の攻撃");
        System.out.println("敵に10ポイントのダメージを与えた");
        m.hp-=10;
    }
    
    private void die() {
        System.out.println(this.name+"は死んでしまった");
        System.out.println("GAME OVERです");
    }
}
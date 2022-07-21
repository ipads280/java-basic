public class Fool extends Character implements Human {
    // character からhpやnameなどのフィールドを継承
    // character から継承した抽象メソッドattack()を実装
    
    public void attack(Matango m) {
        System.out.println(this.name+"は戦わず遊んでいる")
    }
}
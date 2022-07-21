public class Main {
    public static void main(String[] args) {
        Monster[] monsters=new Monter[3];
        monsters[0]=new Slime();
        monsters[1]=new Goblin();
        mosnters[2]=new DeathBat();
        for (Mosnter m :monsters) {
            m.run();
        }
    } 
}
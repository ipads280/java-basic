public class Wand {
    private String name;
    private double power;
    
    public void setName(String name) {
        if (name==null) {
            throw new IllegalArgumentException("名前がnullである。処理を中断。");
        }
        if (name.length()<3) {
            throw new IllegalArgumentException("名前が短すぎます。三文字以上にしてください");
        }
        this.name=name;
    }
    
    public void getName() {
        return this.name;
    }
    
    public void setPower(double power) {
        this.power=power;
    }
    public void getPower() {
        return this.power;
    }
}
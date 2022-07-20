public class Computer extends TangibleAsset {
    String makerNane;
    
    public Computer (String name,int price,String color,String makerName) {
        this.name=name;
        this.price=price;
        this.color=color;
        this.makerName=makerName;
    }
    
    public String getMakerName() {return this.makerName;
}
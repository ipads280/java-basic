public class Book extends TangibleAsset {
    String isbn;
    
    public book(String name,int price,String color,String isbn) {
        this.name=name;
        this.price=price;
        this.color=color;
        this.isbn=isbn;
    }
    
    public String getIsbn() {return this.isbn;}
}
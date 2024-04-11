public class Retailitem {
    private String description;
    private int quantityInStock;
    private double price;

    public Retailitem(String description, int quantityInStock, float price){
        this.description = description;
        this.quantityInStock = quantityInStock;
        this.price = price;
    }
    public void output (){
        System.out.print(description + " ");
        System.out.print(quantityInStock + " ");
        System.out.print(price + " ");
    }
}

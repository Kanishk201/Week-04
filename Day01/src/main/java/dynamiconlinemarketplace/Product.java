package dynamiconlinemarketplace;

public class Product<T extends ProductCategory> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getCategoryName() {
        return category.getName();
    }

    public void setPrice(double price){
        this.price = price;
    }


    public double getPrice(){
        return price;
    }


    @Override
    public String toString() {
        return name + " (" + category.getName() + ") - $" + price;
    }
}

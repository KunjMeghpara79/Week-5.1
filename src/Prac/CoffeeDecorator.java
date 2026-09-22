package Prac;

public abstract class CoffeeDecorator implements Coffee{
    protected Coffee decoratedCoffee;
    public CoffeeDecorator(Coffee coffee){
        this.decoratedCoffee = coffee;
    }
    public String getDescription(){
        return this.decoratedCoffee.getDescription();
    }
    public int getPrice(){
        return this.decoratedCoffee.getPrice();
    }
}

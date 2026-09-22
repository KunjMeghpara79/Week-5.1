package Prac;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee decoratedCoffee){
        super(decoratedCoffee);
    }

    @Override
    public String getDescription(){
        return decoratedCoffee.getDescription() + "Milk";
    }

    @Override
    public int getPrice(){
        return decoratedCoffee.getPrice() + 5;
    }
}

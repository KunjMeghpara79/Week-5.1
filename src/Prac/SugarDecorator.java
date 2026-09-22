package Prac;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription(){
        return decoratedCoffee.getDescription() + "Sugar";
    }

    @Override
    public int getPrice(){
        return decoratedCoffee.getPrice() + 5;
    }
}

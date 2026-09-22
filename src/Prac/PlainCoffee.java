package Prac;

public class PlainCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Plain coffee ";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}

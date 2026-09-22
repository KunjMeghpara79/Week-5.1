package Prac;

public class ClientCode {
    public static void main(String[] args) {
        Coffee coffee = new MilkDecorator(new SugarDecorator(new PlainCoffee()));
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getPrice());
    }
}

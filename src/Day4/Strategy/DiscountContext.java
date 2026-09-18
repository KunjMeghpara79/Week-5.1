package Day4.Strategy;

import Day4.Order;

public class DiscountContext {
    private DiscountStrategy discountStrategy;

    public DiscountContext(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }

    public double applyDiscount(Order order){
        return this.discountStrategy.calculateDiscont(order);
    }

    public void changeDiscountStrategy(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }

}

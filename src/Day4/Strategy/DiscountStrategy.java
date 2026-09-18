package Day4.Strategy;

import Day4.Order;

public interface DiscountStrategy {
    double calculateDiscont(Order order);
}

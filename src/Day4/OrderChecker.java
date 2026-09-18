package Day4;

import Day2.Order;

public interface OrderChecker {
    void setNextChecker(OrderChecker orderChecker);
    void handleCheck(Order order);
}

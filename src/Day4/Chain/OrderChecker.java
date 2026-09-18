package Day4.Chain;

import Day4.Order;

public interface OrderChecker {
    void handleCheck(Order order);
    void setNextChecker(OrderChecker orderChecker);
}

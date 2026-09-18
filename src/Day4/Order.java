package Day4;

import Day4.Observer.OrderListener;
import Day4.Strategy.CustomerType;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String item;
    private String deliveryNotes;
    private CustomerType customerType;
    private double amount;

    public Order(String item, String deliveryNotes, CustomerType customerType,
                 double amount, String deliveryAddress, String discountCode) {
        this.item = item;
        this.deliveryNotes = deliveryNotes;
        this.customerType = customerType;
        this.amount = amount;
        this.deliveryAddress = deliveryAddress;
        this.discountCode = discountCode;
    }
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getItem() {
        return item;
    }

    public String getDeliveryNotes() {
        return deliveryNotes;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    private String deliveryAddress;
    private String discountCode;

    public CustomerType getCustomerType() {
        return customerType;
    }

    public double getAmount() {
        return amount;
    }

    private List<OrderListener> listeners = new ArrayList<>();

    public void addListener(OrderListener listener) {
        listeners.add(listener);
    }

    public void removeListener(OrderListener listener) {
        listeners.remove(listener);
    }

    public void notifyListeners(Order order) {
        for (OrderListener listener : listeners) {
            listener.update(order);
        }
    }
}

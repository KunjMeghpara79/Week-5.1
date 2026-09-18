package Day3;

public class ShippingServiceImpl implements ShippingService {
    @Override
    public void ship(String orderId) {
        if(orderId == null) throw new RuntimeException("Order id can not be null");
        System.out.println("Shipping order: " + orderId);
    }
}

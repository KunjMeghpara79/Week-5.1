package Day3;

public class ShippingServiceImpl implements ShippingService {
    @Override
    public void ship(String orderId) {
        System.out.println("Shipping order: " + orderId);
    }
}

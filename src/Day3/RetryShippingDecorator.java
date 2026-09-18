package Day3;

import Day3.ShippingDecorator;

public class RetryShippingDecorator extends ShippingDecorator {

    public RetryShippingDecorator(ShippingService shippingService) {
        super(shippingService);
    }

    @Override
    public void ship(String orderId) {

        for (int i = 1; i <= 3; i++) {
            try {
                shippingService.ship(orderId);
                return;
            } catch (Exception e) {
                System.out.println("Attempt " + i + " failed");
            }
        }

        System.out.println("Shipping failed after 3 attempts");
    }
}
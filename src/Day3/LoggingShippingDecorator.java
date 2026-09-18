package Day3;

import Day3.ShippingDecorator;

import java.util.logging.Logger;

public class LoggingShippingDecorator extends ShippingDecorator {

    public LoggingShippingDecorator(ShippingService shippingService) {
        super(shippingService);
    }

    @Override
    public void ship(String orderId) {
        System.out.println("Logging: Shipping order " + orderId);

        shippingService.ship(orderId);

        System.out.println("Logging: Shipping completed");
    }
}
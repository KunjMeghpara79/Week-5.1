package Day3;

public class Day3 {
    public static void main(String[] args) {
        ThirdPartyShipping thirdPartyShipping = new ThirdPartyShipping();
        ShippingService shippingService = new ShippingAdapter(thirdPartyShipping);
        shippingService.ship("12345");
        ShippingService shippingService1 = new ShippingServiceImpl();
        shippingService1.ship("123468");


        //
        ShippingService shippingService2 = new RetryShippingDecorator(new ShippingServiceImpl());
        shippingService2.ship(null);

        ShippingService shippingService3 = new LoggingShippingDecorator(new ShippingServiceImpl());
        shippingService3.ship("123");
    }
}

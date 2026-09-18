package Day3;

public abstract class ShippingDecorator implements ShippingService {

    protected ShippingService shippingService;

    public ShippingDecorator(ShippingService shippingService) {
        this.shippingService = shippingService;
    }
}
package Day2;

import javax.print.attribute.standard.OrientationRequested;

public class Order {
    //Required
    private String item;

    public String getItem() {
        return item;
    }

    private String shippingAddress;

    //Optional
    private boolean giftWarp;

    public String getDiscountCode() {
        return discountCode;
    }

    private String discountCode;

    public String getDeliveryNotes() {
        return deliveryNotes;
    }

    private String deliveryNotes;
    private PriorityFlag priorityFlag;

    public void printOrder(){
        System.out.println("Item             : " + this.item);
        System.out.println("Shipping Address : " + this.shippingAddress);
       // if(this.giftWarp){
            System.out.println("Gift wrap        : " + true);
       // }
       // if(this.discountCode != null){
            System.out.println("Discount Code    : " + this.discountCode);
       // }
        //if(this.deliveryNotes != null){
            System.out.println("Delivery Notes   : " + this.deliveryNotes);
       // }
        //if(this.priorityFlag != null){
            System.out.println("Prioriy          : "+ this.priorityFlag);
       // }
    }
    private Order(OrderBuilder builder){
        this.item = builder.item;
        this.shippingAddress = builder.shippingAddress;
        this.giftWarp = builder.giftWarp;
        this.discountCode = builder.discountCode;
        this.deliveryNotes = builder.deliveryNotes;
        this.priorityFlag = builder.priorityFlag;
    }
    public static class OrderBuilder{
        //Required
        private String item;
        private String shippingAddress;

        //Optional
        private boolean giftWarp;
        private String discountCode;
        private String deliveryNotes;
        private PriorityFlag priorityFlag;

        public OrderBuilder(String item,String shippingAddress){
            this.item = item;
            this.shippingAddress = shippingAddress;
        }
        public OrderBuilder withGiftWrap(boolean giftWarp){
            this.giftWarp = giftWarp;
            return this;
        }
        public OrderBuilder withDiscountCode(String discountCode){
            this.discountCode = discountCode;
            return this;
        }
        public OrderBuilder withDeliveryNotes(String deliveryNotes){
            this.deliveryNotes = deliveryNotes;
            return this;
        }
        public OrderBuilder withPriorityFlag(PriorityFlag priorityFlag) {
            this.priorityFlag = priorityFlag;
            return this;
        }
        public Order build(){
            if(this.item == null || this.shippingAddress == null){
                System.out.println("item name or shipping address can not be null");
                return null;
            }
            return new Order(this);
        }

    }
}

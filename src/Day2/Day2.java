package Day2;

public class Day2 {
    public static void main(String[] args) {
        Order order = new Order.OrderBuilder("afdf","adf")
                .withGiftWrap(true)
                .withDiscountCode("FLAT10")
                //.withDeliveryNotes("aign")
                .withPriorityFlag(PriorityFlag.URGENT)
                .build();
              order.printOrder();
    }
}

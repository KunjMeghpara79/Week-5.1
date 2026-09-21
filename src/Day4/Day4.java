package Day4;

import Day4.Chain.*;
import Day4.Observer.AnalyticsListener;
import Day4.Observer.AuditListener;
import Day4.Observer.EmailListener;
import Day4.Strategy.*;

public class Day4 {

        public static void main(String[] args) {

            // CREATE ORDER

            Order order = new Order(
                    "Laptop",
                    "Normal delivery",
                    CustomerType.VIP,
                    50000,
                    "Ahmedabad india",
                    "VIP30",
                    OrderStatus.UNPLACED
            );


            // 1. CHAIN OF RESPONSIBILITY

            Stock stock = new Stock();
            stock.getOrderList().add("Laptop");

            OrderChecker stockChecker = new OrderStockChecker(stock);
            OrderChecker fraudChecker = new OrderFraudChecker();
            OrderChecker addressChecker = new OrderAddressChecker();

            stockChecker.setNextChecker(fraudChecker);
            fraudChecker.setNextChecker(addressChecker);

            System.out.println("----- ORDER CHECK -----");

            stockChecker.handleCheck(order);


            // 2. STRATEGY

            DiscountStrategy strategy;

            switch (order.getCustomerType()) {

                case REGULAR:
                    strategy = new RegularDiscountStrategy();
                    break;

                case MEMBER:
                    strategy = new MemberDiscountStrategy();
                    break;

                case VIP:
                    strategy = new VipDiscountStrategy();
                    break;

                default:
                    throw new IllegalArgumentException("Invalid customer type");
            }

            DiscountContext context = new DiscountContext(strategy);

            double finalAmount = context.applyDiscount(order);

            System.out.println("Original amount: " + order.getAmount());
            System.out.println("Final amount: " + finalAmount);


            // 3. OBSERVER

            order.addListener(new EmailListener());
            order.addListener(new AnalyticsListener());
            order.addListener(new AuditListener());

            System.out.println("----- ORDER PLACED -----");
            order.placeOrder();
        }
}

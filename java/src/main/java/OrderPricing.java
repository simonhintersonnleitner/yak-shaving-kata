public class OrderPricing {

    public static double calculatePrice(OrderType orderType, double basePrice) {
        return switch (orderType) {
            case STANDARD -> basePrice;
            case PREMIUM -> basePrice * 1.2;
            case WHOLESALE -> basePrice * 0.7;
        };
    }

    public static String getOrderLabel(OrderType orderType) {
        return switch (orderType) {
            case STANDARD -> "Standard Order";
            case PREMIUM -> "Premium Order";
            case WHOLESALE -> "Wholesale Order";
        };
    }

    public static int getOrderPriority(OrderType orderType) {
        return switch (orderType) {
            case STANDARD -> 1;
            case PREMIUM -> 3;
            case WHOLESALE -> 2;
        };
    }

}

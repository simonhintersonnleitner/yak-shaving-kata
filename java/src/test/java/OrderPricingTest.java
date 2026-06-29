import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderPricingTest {

    @Nested
    class CalculatePrice {
        @Test
        void shouldReturnBasePriceForStandard() {
            double price = OrderPricing.calculatePrice(OrderType.STANDARD, 100.0);
            assertEquals(100.0, price);
        }

        @Test
        void shouldApply20PercentPremiumForPremium() {
            double price = OrderPricing.calculatePrice(OrderType.PREMIUM, 100.0);
            assertEquals(120.0, price);
        }

        @Test
        void shouldApply30PercentDiscountForWholesale() {
            double price = OrderPricing.calculatePrice(OrderType.WHOLESALE, 200.0);
            assertEquals(140.0, price);
        }

        @Test
        void shouldApply30PercentDiscountForSmallWholesale() {
            double price = OrderPricing.calculatePrice(OrderType.WHOLESALE, 40.0);
            assertEquals(28.0, price);
        }
    }

    @Nested
    class GetOrderLabel {
        @Test
        void shouldReturnStandardLabelForStandard() {
            String label = OrderPricing.getOrderLabel(OrderType.STANDARD);
            assertEquals("Standard Order", label);
        }

        @Test
        void shouldReturnPremiumLabelForPremium() {
            String label = OrderPricing.getOrderLabel(OrderType.PREMIUM);
            assertEquals("Premium Order", label);
        }

        @Test
        void shouldReturnWholesaleLabelForWholesale() {
            String label = OrderPricing.getOrderLabel(OrderType.WHOLESALE);
            assertEquals("Wholesale Order", label);
        }
    }

    @Nested
    class GetOrderPriority {
        @Test
        void shouldReturnPriority1ForStandard() {
            int priority = OrderPricing.getOrderPriority(OrderType.STANDARD);
            assertEquals(1, priority);
        }

        @Test
        void shouldReturnPriority2ForWholesale() {
            int priority = OrderPricing.getOrderPriority(OrderType.WHOLESALE);
            assertEquals(2, priority);
        }

        @Test
        void shouldReturnPriority3ForPremium() {
            int priority = OrderPricing.getOrderPriority(OrderType.PREMIUM);
            assertEquals(3, priority);
        }
    }

}

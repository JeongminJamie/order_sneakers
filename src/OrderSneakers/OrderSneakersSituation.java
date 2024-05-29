package OrderSneakers;

public class OrderSneakersSituation {

    public static void main(String[] args) {

        boolean isCustomerLikeDelivery = false; // 고객의 배송 주문 선호 여부

        long nikeSneakersPrice = 50_000;
        String nikeSneakersFeature = "안정감"; // 안정감 | 편안함 | 가벼움 등 신발 특징
        boolean havingNikeSneakersInStore = true; // 매장 Nike sneakers 재고 여부

        int daysForDeliver = 3;
        int costForDeliver = 15_000;

        Customer customer = new Customer(isCustomerLikeDelivery);
        Staff staff = new Staff(nikeSneakersPrice, nikeSneakersFeature, havingNikeSneakersInStore);
        DeliveryManager deliveryManager = new DeliveryManager(isCustomerLikeDelivery, daysForDeliver, costForDeliver);

        long sneakersPrice = staff.getNikeSneakersPrice();
        boolean isNikeSneakersInStore = staff.isNikeSneakersInStore();

        customer.askSneakersPrice(sneakersPrice);
        staff.tellSneakersPrice();

        staff.checkNikeSneakersInStore();
        customer.checkAbleToBuyInStore(nikeSneakersPrice, isNikeSneakersInStore);
    }
}

package OrderSneakers;

public class Staff {
    private long salesAmount = 100_000;
    private long nikeSneakersPrice =  50_000;
    private String getNikeSneakersFeature;
    private boolean hasNikeSneakersInStore;

    public Staff(long nikeSneakersPrice, String getNikeSneakersFeature, boolean hasNikeSneakersInStore) {
        this.nikeSneakersPrice = nikeSneakersPrice;
        this.getNikeSneakersFeature = getNikeSneakersFeature;
        this.hasNikeSneakersInStore = hasNikeSneakersInStore;
    }

    public void tellSneakersPrice() {
        System.out.println("저희 나이키 신발 가격은 " + this.nikeSneakersPrice + "입니다");
    }

    public void checkNikeSneakersInStore () {
        if (hasNikeSneakersInStore) {
            System.out.println("저희 매장에 재고가 있습니다!");
        } else {
            System.out.println("현재 매장에 나이키 신발 재고는 없습니다:(");
        }
    }

    public void checkCustomerLikeDelivery (boolean likeDeliveryOrder) {
            if (likeDeliveryOrder) {
                System.out.println("그럼 배송 주문으로 나이키 운동화 결제해드릴게요!");
            } else {
                System.out.println("그럼 매장으로 입고 됐을 때, 문자로 알림 드려도 괜찮을까요?");
            }
    }

    public void tellTotalAmountForSneakers(boolean likeDeliveryOrder, long costForDelivery) {
        if (likeDeliveryOrder) {
            System.out.println("운동화 " + nikeSneakersPrice +"원 " + "배송비 " + costForDelivery + "원 해서 총 " + (nikeSneakersPrice + costForDelivery) + "입니다");
        }
    }

    public void getMoneyFromCustomerForDelivery(long nikeSneakersPrice, long costForDelivery) {
        salesAmount += nikeSneakersPrice + costForDelivery;
        System.out.println("결제 되셨습니다!");
    }

    public long getNikeSneakersPrice() {
        return this.nikeSneakersPrice;
    }

    public boolean isNikeSneakersInStore () {
        return this.hasNikeSneakersInStore;
    }
}

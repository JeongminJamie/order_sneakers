package OrderSneakers;

public class Customer {
    private long cash = 100_000;
    private boolean likeDeliveryOrder;

    public Customer(boolean likeDeliveryOrder) {
        this.likeDeliveryOrder = likeDeliveryOrder;
    }

    public void askSneakersPrice (long nikeSneakersPrice) {
        if (cash < nikeSneakersPrice) {
            System.out.println("아 너무 비싸네요 다음에 오겠습니다!");
        } else {
            System.out.println("아 그럼 이거 재고 있나요?");
        }
    }

    public void checkAbleToBuyInStore (long nikeSneakersPrice, boolean hasNikeSneakersInStore) {
        if (cash > nikeSneakersPrice) {
            if (hasNikeSneakersInStore) {
                System.out.println("그럼 이걸로 하나 주세요");
            } else {
                System.out.println("아.. 그럼 배송으로 받아야 하나요?");
            }
        }
    }

    public void checkCashEnoughForDelivery(long nikeSneakersPrice, long costForDelivery) {
            if(cash < (nikeSneakersPrice + costForDelivery)) {
                System.out.println("그럼 배송으로 주문하겠습니다");
            } else {
                System.out.println("배송말고 주문할 수 있는 방법은 없을까요?");
            }
        }


    public void payforSneakersWithDelivery(long nikeSneakersPrice, long costForDelivery) {
        if(cash > (nikeSneakersPrice+costForDelivery) && likeDeliveryOrder) {
            cash -= (nikeSneakersPrice + costForDelivery);
        }
    }

}

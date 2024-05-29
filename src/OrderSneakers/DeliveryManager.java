package OrderSneakers;

public class DeliveryManager {
    private long salesAmount = 100_000;
    private int daysForDeliver;
    private long costForDeliver;

    public DeliveryManager(boolean isPacked, int daysForDeliver, long costForDeliver) {
        this.daysForDeliver = daysForDeliver;
        this.costForDeliver = costForDeliver;
    }
}

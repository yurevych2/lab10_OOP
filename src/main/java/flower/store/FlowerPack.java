package flower.store;
import lombok.Getter;

@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity_set) {
        this.flower = new Flower(flower);
        this.quantity = quantity_set;
    }

    public double getPrice() {
        return quantity * flower.getPrice();
    }

    public void setQuantity(int quantity_sm) {
        if (quantity_sm < 1) {
            this.quantity = 1;
        } else {
            this.quantity = quantity_sm;
        }
    }
}

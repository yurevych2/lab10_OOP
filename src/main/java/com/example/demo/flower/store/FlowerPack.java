package flower.store;
import lombok.Getter;

@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantitySet) {
        this.flower = new Flower(flower);
        this.quantity = quantitySet;
    }

    public double getPrice() {
        return quantity * flower.getPrice();
    }

    public void setQuantity(int quantitySm) {
        if (quantitySm < 1) {
            this.quantity = 1;
        } else {
            this.quantity = quantitySm;
        }
    }
}

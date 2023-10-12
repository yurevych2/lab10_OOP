package flower.store;

import lombok.Getter;

@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity) { //private?
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    public double getPrice() {
        return quantity * flower.getPrice();
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity < 1? 1 : quantity;
    }
}

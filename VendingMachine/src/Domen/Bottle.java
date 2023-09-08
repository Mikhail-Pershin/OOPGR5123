package Domen;

public class Bottle extends Product {
    private float bottleVolune;

    public Bottle(String name, int price, float bottleVolune) {
        super(name, price);
        this.bottleVolune = bottleVolune;
    }

    public float getBottleVolune() {
        return bottleVolune;
    }

    public void setBottleVolune(float bottleVolune) {
        this.bottleVolune = bottleVolune;
    }

    @Override
    public String toString() {
        return super.toString() + "; volume = " + this.bottleVolune;
    }
}
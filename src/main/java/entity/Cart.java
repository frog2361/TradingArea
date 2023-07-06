package entity;

import java.util.Objects;

public class Cart {
    private double totalAmount;

    private short numberOfGoods;

    private Product product;

    public Cart(double totalAmount, short numberOfGoods, Product product) {
        this.totalAmount = totalAmount;
        this.numberOfGoods = numberOfGoods;
        this.product = product;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public short getNumberOfGoods() {
        return numberOfGoods;
    }

    public void setNumberOfGoods(short numberOfGoods) {
        this.numberOfGoods = numberOfGoods;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "totalAmount=" + totalAmount +
                ", numberOfGoods=" + numberOfGoods +
                ", product=" + product +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return Objects.equals(product, cart.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product);
    }
}

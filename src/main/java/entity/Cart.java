package entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Objects;

public class Cart {

    private Long id;

    private BigDecimal totalAmount;

    private int numberOfGoods;

    private ArrayList<Product> list;

    public Cart(Long id,BigDecimal totalAmount, int
            numberOfGoods, ArrayList<Product> list){
        this.id = id;
        this.totalAmount = totalAmount;
        this.numberOfGoods = numberOfGoods;
        this.list = list;
    }

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getNumberOfGoods() {
        return numberOfGoods;
    }

    public void setNumberOfGoods(short numberOfGoods) {
        this.numberOfGoods = numberOfGoods;
    }

    public ArrayList<Product> getList() {return list;}

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", totalAmount=" + totalAmount +
                ", numberOfGoods=" + numberOfGoods +
                ", list=" + list +
                '}';
    }

    public void setList(ArrayList<Product> list) {this.list = list;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return Objects.equals(id, cart.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

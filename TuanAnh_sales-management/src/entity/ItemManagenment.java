package entity;

import entity.Item;

public class ItemManagenment {
    private Item item;
    private int quantity;

    public ItemManagenment(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ItemManagenment{" +
                "item=" + item +
                ", quantity=" + quantity +
                '}';
    }
}

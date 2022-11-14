package entity;

import java.util.Arrays;

public class SalerManagement {
    private Saler saler;
    private ItemManagenment[] itemManagenments;
    private int count_item;

    public SalerManagement(Saler saler, ItemManagenment[] itemManagenments) {
        this.saler = saler;
        this.itemManagenments = itemManagenments;
    }

    public Saler getSaler() {
        return saler;
    }

    public void setSaler(Saler saler) {
        this.saler = saler;
    }

    public ItemManagenment[] getItemManagenments() {
        return itemManagenments;
    }

    public void setItemManagenments(ItemManagenment[] itemManagenments) {
        this.itemManagenments = itemManagenments;
    }

    public int getCount_item() {
        return count_item;
    }

    public void setCount_item(int count_item) {
        this.count_item = count_item;
    }

    @Override
    public String toString() {
        return "SalerManagement{" +
                "saler=" + saler +
                ", itemManagenments=" + Arrays.toString(itemManagenments) +
                '}';
    }
}

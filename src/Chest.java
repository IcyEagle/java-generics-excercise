import java.util.Collection;

public class Chest {
    private Collection<Items.Item> items;

    public Chest(Collection<Items.Item> items) {
        this.items = items;
    }

    public void open() {
        System.out.println("Chest has the next items:");
        Utils.showItems(items);
    }
}

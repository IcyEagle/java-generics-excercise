import java.util.Collection;

public class Character {
    private Collection<Items.Ore> bricks;
    private Collection<Items.Food> snacks;

    public Character(Collection<Items.Ore> bricks, Collection<Items.Food> snacks) {
        this.bricks = bricks;
        this.snacks = snacks;
    }

    public void showInventory() {
        System.out.println("I have:");

        System.out.println("Bricks:");
        Utils.showItems(bricks);

        System.out.println("Snacks:");
        Utils.showItems(snacks);
    }
}

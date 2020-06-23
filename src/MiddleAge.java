import com.sun.tools.javac.util.List;

import java.util.Collection;

public class MiddleAge {

    public static void main(String[] args) {
        Character hero = generateCharacter();
        Chest treasure = generateChest();

        hero.showInventory();
        treasure.open();
    }

    private static Chest generateChest() {
        Collection<Items.Item> items = generateItems(List.of(
                Factories.bronzeFactory,
                Factories.silverFactory,
                Factories.goldFactory,
                Factories.appleFactory,
                Factories.bananaFactory,
                Factories.starFactory
        ));

        return new Chest(items);
    }

    private static Character generateCharacter() {
        Collection<Items.Ore> bricks = generateItems(List.of(
                Factories.bronzeFactory,
                Factories.silverFactory,
                Factories.goldFactory
        ));

        Collection<Items.Food> snacks = generateItems(List.of(
                Factories.appleFactory,
                Factories.bananaFactory
        ));

        return new Character(bricks, snacks);
    }

    // TODO generateItems(factories)
}
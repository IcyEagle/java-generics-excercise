public class Factories {
    interface Factory<T> {
        T produce();
    }

    public static BronzeFactory bronzeFactory = new BronzeFactory();
    public static SilverFactory silverFactory = new SilverFactory();
    public static GoldFactory goldFactory = new GoldFactory();
    public static AppleFactory appleFactory = new AppleFactory();
    public static BananaFactory bananaFactory = new BananaFactory();
    public static StarFactory starFactory = new StarFactory();

    static class BronzeFactory implements Factory<Items.Bronze> {

        @Override
        public Items.Bronze produce() {
            return new Items.Bronze();
        }
    }

    static class SilverFactory implements Factory<Items.Silver> {

        @Override
        public Items.Silver produce() {
            return new Items.Silver();
        }
    }

    static class GoldFactory implements Factory<Items.Gold> {

        @Override
        public Items.Gold produce() {
            return new Items.Gold();
        }
    }

    static class AppleFactory implements Factory<Items.Apple> {

        @Override
        public Items.Apple produce() {
            return new Items.Apple();
        }
    }

    static class BananaFactory implements Factory<Items.Banana> {

        @Override
        public Items.Banana produce() {
            return new Items.Banana();
        }
    }

    static class StarFactory implements Factory<Items.Star> {

        @Override
        public Items.Star produce() {
            return new Items.Star();
        }
    }
}

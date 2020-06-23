public class Items {
    interface Item {
        String getName();
    }

    abstract static class Ore implements Item {}
    static class Bronze extends Ore {
        @Override
        public String getName() {
            return "Bronze";
        }
    }
    static class Silver extends Ore {
        @Override
        public String getName() {
            return "Silver";
        }
    }
    static class Gold extends Ore {
        @Override
        public String getName() {
            return "Gold";
        }
    }

    abstract static class Food implements Item {}
    static class Apple extends Food {
        @Override
        public String getName() {
            return "Apple";
        }
    }
    static class Banana extends Food {
        @Override
        public String getName() {
            return "Banana";
        }
    }

    static class Star implements Item {
        @Override
        public String getName() {
            return "*";
        }
    }
}

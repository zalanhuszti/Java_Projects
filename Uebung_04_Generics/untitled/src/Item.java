abstract class Item implements Comparable<Item> {
    final String name;
    final double price;

    protected Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Item other) {
        int priceCompare = Double.compare(this.price, other.price);
        return priceCompare != 0 ? priceCompare : this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + ": " + price;
    }
}

class Food extends Item {
    final double weight;

    public Food(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + weight + "kg)";
    }
}

class Drink extends Item {
    final double volume;

    public Drink(String name, double price, double volume) {
        super(name, price);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + volume + "L)";
    }
}


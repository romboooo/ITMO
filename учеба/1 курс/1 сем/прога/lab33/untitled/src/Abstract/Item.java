package Abstract;

public abstract class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return getName();
    }
}
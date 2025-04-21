package org.example;
/** Simple POJO representing a Dish. */
public class Dish {
    public final String description;

    public Dish(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}

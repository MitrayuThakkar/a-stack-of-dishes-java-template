package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void pushAndSizeWork() {
        App.DishStack stack = new App.DishStack(3);
        assertEquals(0, stack.size());

        stack.push(new Dish("one"));
        stack.push(new Dish("two"));
        stack.push(new Dish("three"));

        assertEquals(3, stack.size(), "Stack should hold three dishes");
    }

    @Test
    void pushOnFullStackDoesNotChangeSize() {
        App.DishStack stack = new App.DishStack(1);
        stack.push(new Dish("only dish"));
        assertEquals(1, stack.size());

        // Attempt to push when full
        stack.push(new Dish("extra"));
        assertEquals(1, stack.size(), "Size should remain 1 when stack is full");
    }

    @Test
    void popAndPeekWork() {
        App.DishStack stack = new App.DishStack();
        Dish red  = new Dish("red");
        Dish blue = new Dish("blue");

        stack.push(red);
        stack.push(blue);

        // Peek should be blue, size unchanged
        assertEquals(blue, stack.peek());
        assertEquals(2, stack.size());

        // Pop should return blue, then red
        assertEquals(blue, stack.pop());
        assertEquals(red, stack.pop());
        assertEquals(0, stack.size());
    }

    @Test
    void popOnEmptyReturnsNull() {
        App.DishStack stack = new App.DishStack();
        assertNull(stack.pop(), "Popping empty stack should return null");
    }
}

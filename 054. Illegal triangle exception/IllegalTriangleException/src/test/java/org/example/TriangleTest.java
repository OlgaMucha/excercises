package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    public void test_triangle_sides_1_2_8() {
        Assertions.assertThrows(IllegalTriangleException.class, ()->{
            new Triangle(1,2,8);
        });
    }

    @Test
    public void test_triangle_sides_5_1_1() {
        Assertions.assertThrows(IllegalTriangleException.class, ()->{
            new Triangle(5,1,1);
        });
    }

    @Test
    public void test_triangle_sides_1_10_1() {
        Assertions.assertThrows(IllegalTriangleException.class, ()->{
            new Triangle(1,10,1);
        });
    }

}
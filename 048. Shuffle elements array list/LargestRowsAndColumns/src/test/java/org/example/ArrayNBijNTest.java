package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayNBijNTest {

    @Test
    void test_calculateTotalPerLine_Array2by2_0_0_0_0() {
        //Arrange
        ArrayNBijN cut = new ArrayNBijN();
        int[][] array = {
                {0,0},{0,0}
        };

        //Act
        ArrayList<Integer> arrayExpected = new ArrayList<>(List.of(0,0,0,0));
        ArrayList<Integer> arrayActual = cut.calculateTotalPerLine(array);
        //Assert
        Assertions.assertEquals(arrayExpected, arrayActual);
    }
    @Test
    void test_calculateTotalPerLine_Array1by1_1() {
        //Arrange
        ArrayNBijN cut = new ArrayNBijN();
        int[][] array = {
                {1}
        };

        //Act
        ArrayList<Integer> arrayExpected = new ArrayList<>(List.of(1,1));
        ArrayList<Integer> arrayActual = cut.calculateTotalPerLine(array);
        //Assert
        Assertions.assertEquals(arrayExpected, arrayActual);
    }

    @Test
    void test_calculateTotalPerLine_Array2by2_1_0_0_1() {
        //Arrange
        ArrayNBijN cut = new ArrayNBijN();
        int[][] array = {
                {1,0},{0,1}
        };

        //Act
        ArrayList<Integer> arrayExpected = new ArrayList<>(List.of(1,1,1,1));
        ArrayList<Integer> arrayActual = cut.calculateTotalPerLine(array);
        //Assert
        Assertions.assertEquals(arrayExpected, arrayActual);
    }

    @Test
    void test_calculateTotalPerLine_Array2by2_1_1_0_0() {
        //Arrange
        ArrayNBijN cut = new ArrayNBijN();
        int[][] array = {
                {1,1},{0,0}
        };

        //Act
        ArrayList<Integer> arrayExpected = new ArrayList<>(List.of(2,0,1,1));
        ArrayList<Integer> arrayActual = cut.calculateTotalPerLine(array);
        //Assert
        Assertions.assertEquals(arrayExpected, arrayActual);
    }

    @Test
    void test_calculateTotalPerLine_Array2by2_1_1_1_0() {
        //Arrange
        ArrayNBijN cut = new ArrayNBijN();
        int[][] array = {
                {1,1},{1,0}
        };

        //Act
        ArrayList<Integer> arrayExpected = new ArrayList<>(List.of(2,1,2,1));
        ArrayList<Integer> arrayActual = cut.calculateTotalPerLine(array);
        //Assert
        Assertions.assertEquals(arrayExpected, arrayActual);
    }

    @Test
    void test_calculateTotalPerLineArray0by0() {
        //Arrange
        ArrayNBijN cut = new ArrayNBijN();
        int[][] array = {
        };

        //Act
        ArrayList<Integer> arrayExpected = new ArrayList<>(List.of());
        ArrayList<Integer> arrayActual = cut.calculateTotalPerLine(array);
        //Assert
        Assertions.assertEquals(arrayExpected, arrayActual);
    }

    @Test
    void test_calculateTotalPerLineArray3by3_1_1_1_0_0_0_1_0_0() {
        //Arrange
        ArrayNBijN cut = new ArrayNBijN();
        int[][] array = {
                {1,1,1},{0,0,0},{1,0,0}
        };

        //Act
        ArrayList<Integer> arrayExpected = new ArrayList<>(Arrays.asList(3,0,1,2,1,1));
        ArrayList<Integer> arrayActual = cut.calculateTotalPerLine(array);
        //Assert
        Assertions.assertEquals(arrayExpected, arrayActual);
    }

    @Test
    void test_calculateTotalPerLineArray3by3_0_0_0_0_0_0_0_0_0() {
        //Arrange
        ArrayNBijN cut = new ArrayNBijN();
        int[][] array = {
                {0,0,0},{0,0,0},{0,0,0}
        };

        //Act
        ArrayList<Integer> arrayExpected = new ArrayList<>(Arrays.asList(0,0,0,0,0,0));
        ArrayList<Integer> arrayActual = cut.calculateTotalPerLine(array);
        //Assert
        Assertions.assertEquals(arrayExpected, arrayActual);
    }
}
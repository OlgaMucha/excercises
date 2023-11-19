package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
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

    @Test //all elements of randomly generated array are 0 or 1
    void test_fillInArray_array3by3(){
        //Arrange
        ArrayNBijN cut = new ArrayNBijN();
        //Act
        int[][] arrayActual = cut.fillInArray(3);
        //Assert
        for (int i = 0; i < arrayActual.length; i++) {
            for (int j = 0; j < arrayActual.length; j++) {
                Assertions.assertTrue((arrayActual[i][j] == 0 || arrayActual[i][j] == 1)&&arrayActual.length == 3);
            }
        }
    }

    @Test //all elements of randomly generated array are 0 or 1
    void test_fillInArray_array1by1(){
        //Arrange
        ArrayNBijN cut = new ArrayNBijN();
        //Act
        int[][] arrayActual = cut.fillInArray(1);
        //Assert
        Assertions.assertTrue((arrayActual[0][0] == 0 || arrayActual[0][0] == 1)&&arrayActual.length == 1);
    }

    @Test //all elements of randomly generated array are 0 or 1
    void test_fillInArray_array2by2(){
        //Arrange
        ArrayNBijN cut = new ArrayNBijN();
        //Act
        int[][] arrayActual = cut.fillInArray(2);
        //Assert
        for (int i = 0; i < arrayActual.length; i++) {
            for (int j = 0; j < arrayActual.length; j++) {
                Assertions.assertTrue((arrayActual[i][j] == 0 || arrayActual[i][j] == 1)&&arrayActual.length == 2);
            }
        };
    }
}
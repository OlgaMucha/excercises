package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        }
    }

    @Test //max in rows of this array is 0 and is reached in every row
    void test_maxInLine_array3by3_0_0_0_0_0_0_0_0_0(){
        //Arrange
        ArrayNBijN cut = new ArrayNBijN();
        //Act
        String choice = "ROW";
        int[][] array = {
                {0,0,0},{0,0,0},{0,0,0}
        };
        ArrayList<Integer> arrayListActual = cut.maxInLine(array,choice);
        ArrayList<Integer> arrayListExpected = new ArrayList<>(List.of(0,1,2));

        Assertions.assertEquals(arrayListExpected,arrayListActual);
    }

    @Test //max in rows of this array is 2 and is reached in row 0
    void test_maxInLine_array2by2_1_1_1_0rows(){
        //Arrange
        ArrayNBijN cut = new ArrayNBijN();
        //Act
        String choice = "ROW";
        int[][] array = {
                {1,1},{1,0}
        };
        ArrayList<Integer> arrayListActual = cut.maxInLine(array,choice);
        ArrayList<Integer> arrayListExpected = new ArrayList<>(List.of(0));

        Assertions.assertEquals(arrayListExpected,arrayListActual);
    }

    @Test //max in cols of this array is 2 and is reached in col 0
    void test_maxInLine_array2by2_1_1_1_0cols(){
        //Arrange
        ArrayNBijN cut = new ArrayNBijN();
        //Act
        String choice = "COL";
        int[][] array = {
                {1,1},{1,0}
        };
        ArrayList<Integer> arrayListActual = cut.maxInLine(array,choice);
        ArrayList<Integer> arrayListExpected = new ArrayList<>(List.of(0));

        Assertions.assertEquals(arrayListExpected,arrayListActual);
    }

    @Test //max in cols of this array is 1 and is reached in col 0
    void test_maxInLine_array1by1_1cols(){
        //Arrange
        ArrayNBijN cut = new ArrayNBijN();
        //Act
        String choice = "COL";
        int[][] array = {
                {1}
        };
        ArrayList<Integer> arrayListActual = cut.maxInLine(array,choice);
        ArrayList<Integer> arrayListExpected = new ArrayList<>(List.of(0));

        Assertions.assertEquals(arrayListExpected,arrayListActual);
    }

    @Test //max in rows of this array is 0 and is reached in row 0
    void test_maxInLine_array1by1_1rows(){
        //Arrange
        ArrayNBijN cut = new ArrayNBijN();
        //Act
        String choice = "ROW";
        int[][] array = {
                {1}
        };
        ArrayList<Integer> arrayListActual = cut.maxInLine(array,choice);
        ArrayList<Integer> arrayListExpected = new ArrayList<>(List.of(0));

        Assertions.assertEquals(arrayListExpected,arrayListActual);
    }

    @Test //max in rows of this array is 4 and is reached in rows 0 and 2
    void test_maxInLine_array4by4_1_1_1_1_1_1_0_0_1_1_1_1_1_0_0_0rows(){
        //Arrange
        ArrayNBijN cut = new ArrayNBijN();
        //Act
        String choice = "ROW";
        int[][] array = {
                {1,1,1,1},
                {1,1,0,0},
                {1,1,1,1},
                {1,0,0,0}
        };
        ArrayList<Integer> arrayListActual = cut.maxInLine(array,choice);
        ArrayList<Integer> arrayListExpected = new ArrayList<>(List.of(0,2));

        Assertions.assertEquals(arrayListExpected,arrayListActual);
    }

    @Test //max in rows of this array doesn't exist and is not reached in any row
    void test_maxInLine_array0by0rows(){
        //Arrange
        ArrayNBijN cut = new ArrayNBijN();
        //Act
        String choice = "ROW";
        int[][] array = {
        };
        ArrayList<Integer> arrayListActual = cut.maxInLine(array,choice);
        ArrayList<Integer> arrayListExpected = new ArrayList<>(List.of());

        Assertions.assertEquals(arrayListExpected,arrayListActual);
    }

    @Test
    void test_outputArray_array1by1_1(){
        //Arrange
        ArrayNBijN cut = new ArrayNBijN();
        //Act
        int[][] array = {
                {1}
        };
        String actualOutput = cut.outputArray(array);
        String expectedOutput = "1 \n";

        Assertions.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    void test_outputArray_array2by2_1_1_1_0(){
        //Arrange
        ArrayNBijN cut = new ArrayNBijN();
        //Act
        int[][] array = {
                {1,1},
                {1,0}
        };
        String actualOutput = cut.outputArray(array);
        String expectedOutput = "1 1 \n1 0 \n";

        Assertions.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    void test_outputArray_array3by3_1_1_1_0_0_0_1_1_1(){
        //Arrange
        ArrayNBijN cut = new ArrayNBijN();
        //Act
        int[][] array = {
                {1,1,1},
                {0,0,0},
                {1,1,1}
        };
        String actualOutput = cut.outputArray(array);
        String expectedOutput = "1 1 1 \n0 0 0 \n1 1 1 \n";

        Assertions.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    void test_outputArray_array3by3_1_1_1_1_0_0_0_0_1_1_1_1_0_0_0_0(){
        //Arrange
        ArrayNBijN cut = new ArrayNBijN();
        //Act
        int[][] array = {
                {1,1,1,1},
                {0,0,0,0},
                {1,1,1,1},
                {0,0,0,0}
        };
        String actualOutput = cut.outputArray(array);
        String expectedOutput = "1 1 1 1 \n0 0 0 0 \n1 1 1 1 \n0 0 0 0 \n";

        Assertions.assertEquals(expectedOutput,actualOutput);
    }
}
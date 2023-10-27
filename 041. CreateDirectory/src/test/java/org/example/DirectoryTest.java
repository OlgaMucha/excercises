package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DirectoryTest {

    @Test
    void test_createDirectory_returnsTrueIfCreated() {
        String path = "D://" + System.currentTimeMillis();
        Directory directory = new Directory(path);
        System.out.println(path);
        Assertions.assertTrue(directory.createDirectory());
    }
}
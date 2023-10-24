package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    @Test
    void test_equals() {
        Member member1 = new Member("Olga", "Oost", Role.Assistant, 200000);
        Member member2 = new Member("Olga", "Oost", Role.Assistant, 200000);

        Assertions.assertEquals(member1, member1);
    }

    @Test
    void test_constructor_ZeroSalaryThrowsIllegalArgumentException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Member("Olga","Oost",Role.Assistant,0);
        });
    }

    @Test
    void test_constructor_negativeSalaryThrowsIllegalArgumentException(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Member("Olga","Oost",Role.Assistant,-1000);
        });
    }
}
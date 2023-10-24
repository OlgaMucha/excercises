package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

class RoleTest {

    @Test
    void test_enumMethod_returnsValueBetween1And3() {
        Role theRole = Role.enumMethod();
        Role[] expectedRandomRolesRoles = {Role.associate,Role.assistant, Role.full};
        List<Role> expectedRandomRolesRolesList = Arrays.asList(expectedRandomRolesRoles);
        Assertions.assertTrue(expectedRandomRolesRolesList.contains((theRole)));
    }
}
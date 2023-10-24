package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.concurrent.CompletableFuture.anyOf;

class RoleTest {

    @Test
    void test_enumMethod_returnsValueBetween1And3() {
        Role theRole = Role.enumMethod();
        Role[] expectedRandomRolesRoles = {Role.Associate,Role.Assistant, Role.Full};
        List<Role> expectedRandomRolesRolesList = Arrays.asList(expectedRandomRolesRoles);
        Assertions.assertTrue(expectedRandomRolesRolesList.contains((theRole)));

    }
}
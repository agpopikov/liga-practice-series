package org.liga.practice.third;

import org.junit.Assert;
import org.junit.Test;
import org.liga.practice.third.controller.UserController;
import org.liga.practice.third.service.UserService;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Optional;

public class SimpleTests {

    @Test
    public void name() {
        final UserService mock = Mockito.mock(UserService.class);
        Mockito.when(mock.getAllUsers()).thenReturn(new ArrayList<>());
        final UserController sut = new UserController(mock);
        Assert.assertEquals(0, sut.all().size());
    }

    @Test
    public void name1() {
        final UserService mock = Mockito.mock(UserService.class);
        Mockito.when(mock.getById(Mockito.eq(1L))).thenReturn(Optional.empty());
        Assert.assertTrue(mock.getById(1L).isPresent());
        Assert.assertFalse(mock.getById(2L).isPresent());
    }
}

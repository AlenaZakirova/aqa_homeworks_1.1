package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testDoesNotGoBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 600;

        int actual = service.remain(amount);
        int expected = 400;

        assertEquals(actual, expected);
    }

    @Test
    public void testDoesBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void test1DoesBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }
}
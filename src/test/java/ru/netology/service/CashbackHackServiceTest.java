package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @Test
    public void calculateCashback() {
        int amount = 900;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

}
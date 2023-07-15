package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        assertEquals(0,service.remain(amount));

    }
    @org.testng.annotations.Test
    public void testRemainCashBack() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        assertEquals(100,service.remain(amount));

    }
}
package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void testRemain(){
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(1000),0);
    }

    @Test
    public void testRemainCashBack(){
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(900),100);
    }

    @Test
    public void testAmount0(){
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(0),1000);
    }

    @Test
    public void testlimitvaluesmin(){
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(999),1);
    }

    @Test
    public void testlimitvaluesmax(){
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(1001),0);
    }

}
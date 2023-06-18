package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackService1Test {
    @Test
    public void testRemainLessThan1000() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(900), 100);
    }

    @Test
    public void testRemainMoreThan1000() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(1100), 900);
    }

    @Test
    public void testRemain1000() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(1000), 0);
    }
}


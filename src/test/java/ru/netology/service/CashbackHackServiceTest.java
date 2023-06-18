package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainLessThan1000() {
        CashbackHackService service= new CashbackHackService();
        assertEquals(service.remain(900),100);
    }

    @Test
    public void testRemainMoreThan1000() {
        CashbackHackService service= new CashbackHackService();
        assertEquals(service.remain(1100),900);
    }

    @Test
    public void testRemain1000() {
        CashbackHackService service= new CashbackHackService();
        assertEquals(service.remain(1000),0);
    }
}
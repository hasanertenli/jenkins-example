package com.example.jenkinsexample;

import com.example.jenkinsexample.HesapMakinesi;
import org.junit.Assert;
import org.junit.Test;

public class HesapMakinesiTest {
    @Test
    public void testTopla()
    {
        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        int sayi1 = 5;
        int sayi2 = 19;

        int toplam = hesapMakinesi.topla(sayi1,sayi2);

        Assert.assertEquals(23, toplam);
    }
}

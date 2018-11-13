package test;

import main.NumeralRomano;
import org.junit.Assert;
import org.junit.Test;

public class TesteRomanos {

    @Test
    public void testaNumeral(){
        NumeralRomano numeralRomano = new NumeralRomano();

        Assert.assertEquals(1000, numeralRomano.getAno("M"));
    }
}

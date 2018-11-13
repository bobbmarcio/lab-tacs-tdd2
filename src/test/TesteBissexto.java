package test;

import main.Bissexto;
import org.junit.Assert;
import org.junit.Test;

public class TesteBissexto {

    @Test
    public void testeBissexto() {
        Bissexto bissexto = new Bissexto();

        Assert.assertEquals(true, bissexto.isBissexto(2016));
    }
}

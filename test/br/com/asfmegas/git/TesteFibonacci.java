package br.com.asfmegas.git;

import junit.framework.Assert;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class TesteFibonacci {
    
    @Test
    public void testFibonacci(){
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(0, fibonacci.calcularFibonacci(0));
    }
}

package br.com.asfmegas.git;

import junit.framework.Assert;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class TesteFibonacci {
    
    @Test
    public void testFibonacci(){
        Fibonacci fibonacci = new Fibonacci();
        int[][] casosTeste = {{0,0},{1,1},{2,1},{6,8}}; 
        for(int i = 0; i < casosTeste.length; i++)
            assertEquals(casosTeste[i][1], fibonacci.calcularFibonacci(casosTeste[i][0]));
    }
}

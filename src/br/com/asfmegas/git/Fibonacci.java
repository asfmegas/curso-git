
package br.com.asfmegas.git;

public class Fibonacci {
    
    public int calcularFibonacci(int num){
        if(num == 0) return 0;
        if(num <= 2) return 1;
        return calcularFibonacci(num-1)+calcularFibonacci(num-2);
    }
}

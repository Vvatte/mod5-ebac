package br.com.vvatte;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void verificaNumero_HappyPath(){
        long elemento = Fibonacci.encontrarElemento(5);
        long elemento2 = Fibonacci.encontrarElemento(2);
        long elemento3 = Fibonacci.encontrarElemento(7);

        assertEquals(8, elemento);
        assertEquals(2, elemento2);
        assertEquals(21, elemento3);
    }

    @Test
    public void vericaPrimeiroElemento(){
        long elemento = Fibonacci.encontrarElemento(0);

        assertEquals(1, elemento);
    }

    @Test
    public void vericaSegundoElemento(){
        long elemento = Fibonacci.encontrarElemento(1);

        assertEquals(1, elemento);
    }



}
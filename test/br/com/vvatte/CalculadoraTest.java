package br.com.vvatte;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void SomaTest(){
        int elemento = Calculadora.soma(2,5);

        assertEquals(7, elemento);
    }

    @Test
    public void SubtracaoTest(){
        int elemento = Calculadora.subtracao(2, 5);

        assertEquals(-3,elemento);
    }

    @Test
    public void Multiplicacao_HappyPath(){
        int elemento = Calculadora.multiplicacao( 2, 5);

        assertEquals(10, elemento);
    }

    @Test
    public void Multiplicacao_ElementEhZero(){
        int elemento = Calculadora.multiplicacao( 0, 5);
        int elemento2 = Calculadora.multiplicacao( 2, 0);


        assertEquals(0, elemento);
        assertEquals(0, elemento2);
    }

    @Test
    public void Multiplicacao_ElementEhUm(){
        int elemento = Calculadora.multiplicacao( 2, 1);
        int elemento2 = Calculadora.multiplicacao( 1, 5);


        assertEquals(2, elemento);
        assertEquals(5, elemento2);
    }

    @Test
    public void Divisao_HappyPath(){
        int elemento = Calculadora.divisao( 100, 10);
        int elemento2 = Calculadora.divisao( 100, 8);

        assertEquals(10, elemento);
        assertEquals(12, elemento2);
    }

    @Test
    public void Divisao_DivisorEhZero(){
        int elemento = Calculadora.divisao( 100, 0);

        assertEquals(100, elemento);
    }

}
package br.com.vvatte;

public class Calculadora {

    /**
     * calcula a soma da variavel a + variavel b
     * @param a = 5
     * @param b = 5
     * @return = 10
     */
    public static int soma(int a, int b) {
        return a + b;
    }


    /**
     * Calcula a subtação de dois elementos a - b = retorno
     * @param a = 5
     * @param b = 3
     * @return 2
     */
    public static int subtracao(int a, int b) {
        return a - b;
    }


    /**
     * Verifica se a ou b é igual a 0, se for retorna 0;
     * Verifica se a == 1 e retorna b;
     * Verifica se b ==1 e retorna a;
     * Calcula a multiplicação entre os elementos a * b = retorno;
     * @param a = 5;
     * @param b = 5;
     * @return 25;
     */
    public static int multiplicacao(int a, int b) {
        if(a == 0){
            return 0;
        }

        if (b == 0){
            return 0;
        }

        if (a == 1){
            return b;
        }

        if (b == 1){
            return a;
        }

        return a * b;
    }

    /**
     * Verifica se b é maior que 0 e calcula a / b = retorno;
     * ou retorna o elemento a;
     * @param a = 25;
     * @param b = 5;
     * @return 5;
     */
    public static int divisao(int a, int b) {
        if (b > 0){
            return a / b;
        }
        return a;
    }
}

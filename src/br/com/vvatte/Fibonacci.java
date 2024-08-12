package br.com.vvatte;

public class Fibonacci {

    public static long encontrarElemento(int n){
        if (n <= 1){
            return 1;
        }

        return encontrarElemento(n -1) + encontrarElemento( n -2 );
    }

}

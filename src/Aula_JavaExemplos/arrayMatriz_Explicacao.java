package Aula_JavaExemplos;

import java.util.Scanner;

public class arrayMatriz_Explicacao {

    public static void main(String[] args) {

        //Explicação de Array Matriz

        Scanner leia = new Scanner(System.in);

        int[][] valor = new int[3][3];
        int linha, coluna,somaValor = 0;

        for(linha=0;linha<3;linha++)    {
            for(coluna = 0;coluna<3;coluna++)    {
                System.out.println("\nEntre com o valor:");
                valor[linha][coluna] = leia.nextInt();
                somaValor += valor[linha][coluna];
            }
        }

        System.out.println("\nSomatório dos valores da matriz foi de: "+somaValor);
    }
}
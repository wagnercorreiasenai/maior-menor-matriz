package javaapplication1;

import java.util.Random;

public class MaiorMenorMatriz {

    public static void main(String[] args) {
       
        int[][] m = new int[10][10];
        Random aleatorio = new Random();
        
        //Preenche a matriz
        for (int linha = 0; linha < m.length; linha++) {
            for (int coluna = 0; coluna < m[linha].length; coluna++) {
                m[linha][coluna] = aleatorio.nextInt(10);
                System.out.print(m[linha][coluna]+"\t");
            }
            System.out.println("");
        }
        
        
        //Procura o menor valor e maior valor da linha 5
        int maiorLinha5 = 0;
        int menorLinha5 = 0;
        String posMaiorL5 = "";
        String posMenorL5 = "";
        
        for (int coluna = 0; coluna < m[5].length; coluna++) {
            if(maiorLinha5 < m[5][coluna] | coluna == 0) {
                maiorLinha5 = m[5][coluna];
                posMaiorL5 = "[5]["+coluna+"]";
            }
            
            if (menorLinha5 > m[5][coluna] | coluna == 0) {
                menorLinha5 = m[5][coluna];
                posMenorL5 = "[5]["+coluna+"]";
            }
        }
        
        System.out.println("Maior valor da linha 5: "+posMaiorL5+" "+maiorLinha5);
        System.out.println("Menor valor da linha 5: "+posMenorL5+" "+menorLinha5);
        
        
        //Procura o menor valor e o maior valor da coluna 7
        int maiorColuna7 = 0;
        int menorColuna7 = 0;
        String posMaiorC7 = "";
        String posMenorC7 = "";
        
        for (int linha = 0; linha < m.length; linha++) {
            if (maiorColuna7 < m[linha][7] | linha == 0) {
                maiorColuna7 = m[linha][7];
                posMaiorC7 = "["+linha+"][7]";
            }
            
            if (menorColuna7 > m[linha][7] | linha == 0) {
                menorColuna7 = m[linha][7];
                posMenorC7 = "["+linha+"][7]";
            }
        }
        
        System.out.println("\nO maior valor da coluna 7 é: "+posMaiorC7+" "+maiorColuna7);
        System.out.println("O menor valor da coluna 7 é: "+posMenorC7+" "+menorColuna7);
        
    }
    
}

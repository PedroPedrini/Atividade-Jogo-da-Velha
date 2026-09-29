/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.jogodovelha;

import java.util.Scanner;
/**
 *
 * @author fef
 */
public class jogodavelha {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Jogo da Velha");

        String jogo[][] = new String[3][3];
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                jogo[l][c] = "[ ]";
            }
        }

        System.out.println("\nO Jogo inicial:");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(jogo[l][c] + " ");
            }
            System.out.println("");
        }

        int lx, cx;
        int lo, co;
        boolean erro;

        System.out.println("Jogador que joga de X!");

        System.out.println("Digite a coordenada linha do X (entre 0 e 2): ");
        lx = ler.nextInt();

        System.out.println("\nAgora digite a coordenada coluna do X (entre 0 e 2): ");
        cx = ler.nextInt();

        erro = true;
        while (erro == true) {
            if (lx >= 0 && lx <= 2 && cx >= 0 && cx <= 2 && jogo[lx][cx] == "[ ]") {
                erro = false;
            } else {
                System.out.println("\nErro. Posicao invalida. Tente novamente: ");
                System.out.println("\nJogador que joga de X!");
                System.out.println("Digite a coordenada linha do X (entre 0 e 2): ");
                lx = ler.nextInt();
                System.out.println("\nAgora digite a coordenada coluna do X (entre 0 e 2): ");
                cx = ler.nextInt();
            }
        }

        jogo[lx][cx] = "[X]";

        System.out.println("\nO Jogo atual:");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(jogo[l][c] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Jogador que joga de O!");

            System.out.println("Digite a coordenada linha do O (entre 0 e 2): ");
            lo = ler.nextInt();

            System.out.println("\nAgora digite a coordenada coluna do O (entre 0 e 2): ");
            co = ler.nextInt();

            erro = true;
            while (erro == true) {
                if (lo >= 0 && lo <= 2 && co >= 0 && co <= 2 && jogo[lo][co] == "[ ]") {
                    erro = false;
                } else {
                    System.out.println("\nErro. Posicao invalida. Tente novamente: ");
                    System.out.println("\nJogador que joga de O!");
                    System.out.println("Digite a coordenada linha do O (entre 0 e 2): ");
                    lo = ler.nextInt();
                    System.out.println("\nAgora digite a coordenada coluna do O (entre 0 e 2): ");
                    co = ler.nextInt();
                }
            }

            jogo[lo][co] = "[O]";

            System.out.println("\nO Jogo atual:");
            for (int l = 0; l < 3; l++) {
                for (int c = 0; c < 3; c++) {
                    System.out.print(jogo[l][c] + " ");
                }
                System.out.println("");
            }

            boolean ganhou = false;
            String vencedor = "";

            for (int l = 0; l < 3; l++) {
                if (jogo[l][0] != "[ ]" && jogo[l][0] == jogo[l][1] && jogo[l][1] == jogo[l][2]) {
                    ganhou = true;
                    vencedor = jogo[l][0];
                }
            }

            for (int c = 0; c < 3; c++) {
                if (jogo[0][c] != "[ ]" && jogo[0][c] == jogo[1][c] && jogo[1][c] == jogo[2][c]) {
                    ganhou = true;
                    vencedor = jogo[0][c];
                }
            }

            if (jogo[0][0] != "[ ]" && jogo[0][0] == jogo[1][1] && jogo[1][1] == jogo[2][2]) {
                ganhou = true;
                vencedor = jogo[0][0];
            }

            if (jogo[0][2] != "[ ]" && jogo[0][2] == jogo[1][1] && jogo[1][1] == jogo[2][0]) {
                ganhou = true;
                vencedor = jogo[0][2];
            }

            if (ganhou == true) {
                System.out.println("Fim de jogo! O vencedor foi: " + vencedor);
                break;
            }

            System.out.println("Jogador que joga de X!");

            System.out.println("Digite a coordenada linha do X (entre 0 e 2): ");
            lx = ler.nextInt();

            System.out.println("\nAgora digite a coordenada coluna do X (entre 0 e 2): ");
            cx = ler.nextInt();

            erro = true;
            while (erro == true) {
                if (lx >= 0 && lx <= 2 && cx >= 0 && cx <= 2 && jogo[lx][cx] == "[ ]") {
                    erro = false;
                } else {
                    System.out.println("\nErro. Posicao invalida. Tente novamente: ");
                    System.out.println("\nJogador que joga de X!");
                    System.out.println("Digite a coordenada linha do X (entre 0 e 2): ");
                    lx = ler.nextInt();
                    System.out.println("\nAgora digite a coordenada coluna do X (entre 0 e 2): ");
                    cx = ler.nextInt();
                }
            }

            jogo[lx][cx] = "[X]";

            System.out.println("\nO Jogo atual:");
            for (int l = 0; l < 3; l++) {
                for (int c = 0; c < 3; c++) {
                    System.out.print(jogo[l][c] + " ");
                }
                System.out.println("");
            }

            ganhou = false;
            vencedor = "";

            for (int l = 0; l < 3; l++) {
                if (jogo[l][0] != "[ ]" && jogo[l][0] == jogo[l][1] && jogo[l][1] == jogo[l][2]) {
                    ganhou = true;
                    vencedor = jogo[l][0];
                }
            }

            for (int c = 0; c < 3; c++) {
                if (jogo[0][c] != "[ ]" && jogo[0][c] == jogo[1][c] && jogo[1][c] == jogo[2][c]) {
                    ganhou = true;
                    vencedor = jogo[0][c];
                }
            }

            if (jogo[0][0] != "[ ]" && jogo[0][0] == jogo[1][1] && jogo[1][1] == jogo[2][2]) {
                ganhou = true;
                vencedor = jogo[0][0];
            }

            if (jogo[0][2] != "[ ]" && jogo[0][2] == jogo[1][1] && jogo[1][1] == jogo[2][0]) {
                ganhou = true;
                vencedor = jogo[0][2];
            }

            if (ganhou == true) {
                System.out.println("Fim de jogo! O vencedor foi: " + vencedor);
                break;
            }
        }
    }
}

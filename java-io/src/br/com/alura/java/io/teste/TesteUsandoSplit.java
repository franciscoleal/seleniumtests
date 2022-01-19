package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;

public class TesteUsandoSplit {
	/*
	 * O método split() recebe como parâmetro 
	 * uma String do tipo regex, que é um conjunto 
	 * de caracteres que define regras de como 
	 * analisar, ou separar, uma String maior.
	 * 
	 */
	public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("contas.csv"));
        while(scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha);

                String[] valores = linha.split(",");
//                Desta classe, utilizaremos o método toString() e 
//                passaremos o array valores como parâmetro
                System.out.println(Arrays.toString(valores));

        }
        scanner.close();
}
	
}

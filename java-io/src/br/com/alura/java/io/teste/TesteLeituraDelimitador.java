package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraDelimitador {
	
	public static void main(String[] args) throws Exception {
//		porque usa bufferedReader gerencia a memoria usada para leitura, é uma classe mais otimizada e trata de forma mais rapida
		
		Scanner leitorTerminal = new Scanner(System.in);
		
		String nomeDoArquivo = leitorTerminal.nextLine();
		String caminhoDoArquivo = "C:\\" + "\\tmp\\saida\\" + nomeDoArquivo + ".csv";
		
//		instancio o a Classe File que aponta para o meu caminho onde quero pegar o arquivo para leitura
		Scanner scanner = new Scanner(new File(caminhoDoArquivo), "UTF-8");
		double total = 0.0;
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
//			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			Double saldo = linhaScanner.nextDouble();
			
			
			
			total += saldo;
			
			
			String valorFormatado = String.format(new Locale("pt","BR"),"%s - %04d-%08d, %20s: %10.2f" , 
													tipoConta, agencia, numero, titular, saldo);
			
			System.out.println(valorFormatado);
			
//			System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d, %20s: %08.2f%n", 
//                    tipoConta, agencia, numero, titular, saldo);
			
			
			linhaScanner.close();
		}
		System.out.format(new Locale("pt", "BR"), "Total do Saldo é: R$%.2f", total);
//		System.out.println("Total do saldo é: " + total);
		scanner.close();		
	}
}

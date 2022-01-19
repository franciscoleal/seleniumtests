package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteLeituraCSV {
	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("contas.csv"));
		
//		boolean tem = scanner.hasNextLine();
//		System.out.println(tem);
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
		}
		
		scanner.close();

	}
}

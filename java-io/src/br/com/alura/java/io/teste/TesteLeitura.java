package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {
	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada com arquivo
		//FileInputStream é um InputStream class abstract
		FileInputStream fis = new FileInputStream("C:\\tmp\\saida\\vgsales.csv");
		//Transformando os bits e bytes em caracteres
		//InputStreamReader é um Reader class abstract
		Reader isr = new InputStreamReader(fis, "UTF-8");
		
		//Guardar todos os caracteres de uma linha
		BufferedReader br = new BufferedReader(isr);
		//leitura de linha por linha
		String linha = br.readLine();
		
		while(linha != null) {
			//imprimir essa linha - fluxo de saida
			System.out.println(linha);
			//leitura de linha 
			linha = br.readLine();
		}
		
		
		
		br.close();
	}
}

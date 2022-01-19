package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class TesteEscritaPrintStreamPrintWriterFile {
	public static void main(String[] args) throws IOException {
//		PrintStream ps = new PrintStream("lorem4.txt");
//		PrintWriter pw = new PrintWriter("lorem5.txt", "UTF-8");
		PrintStream ps = new PrintStream(new File("lorem6.txt"));
		
//		pw.println("las,alasldfsd");
//		pw.println();
//		pw.println();
//		pw.println();
//		
//		pw.close();
		
		ps.println("salvaraaaaaaaaaaa");
		ps.println();
		ps.println();
		ps.println("dsfdsfdfsdf");
		
		ps.close();
			
	}
}

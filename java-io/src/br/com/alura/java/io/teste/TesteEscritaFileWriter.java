package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteEscritaFileWriter {
	public static void main(String[] args) throws IOException {

//		Socket s = new Socket();

//		InputStream fis = s.getInputStream(); // System.in;
//		Reader isr = new InputStreamReader(fis);
//		BufferedReader br = new BufferedReader(isr);

//		OutputStream fos = s.getOutputStream(); // System.out; // new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
//
//		String linha = br.readLine();
//
//		while (linha != null && !linha.isEmpty()) {
//			bw.write(linha);
//			bw.newLine();
//			bw.flush();
//			linha = br.readLine();
//		}
		
		FileWriter fw = new FileWriter("lorem3.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Lorem Ipsum dolor sit amet, consectetur");
		bw.newLine();
		bw.newLine();
		bw.write("Lololololo");
		bw.close();
	}
}

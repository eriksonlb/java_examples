import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Multiplic {

	public static void main(String[] args) throws IOException{
		Scanner ler = new Scanner(System.in);
		int i, n;
		
		System.out.println("Tabuada do: ");
		n = ler.nextInt();
		
		FileWriter salvar = new FileWriter("C:\\Users\\CNS-SUP03\\Documents\\Erikson\\Java\\Study\\teste2.txt");
		PrintWriter escrever = new PrintWriter(salvar);
		
		
		for(i = 1; i < 11; i++)
		{
			escrever.printf(" " + i + "X" + n + " = " + (i * n) + "\r\n");
		}
		salvar.close();
		System.out.println("Feito!!");
		

	}

}

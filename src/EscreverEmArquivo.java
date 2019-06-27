import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EscreverEmArquivo {

	public static void main(String[] args) {
		
		Path caminho = Paths.get("C:/Users/CNS-SUP03/Documents/Erikson/Java/Study/teste.txt");
		String texto = "Testando 123 123 123 123 123 123 123";
		byte[] textoEmByte = texto.getBytes();
		try {
		Files.write(caminho, textoEmByte);
		}catch(Exception erro) {
			
		}
	}

}

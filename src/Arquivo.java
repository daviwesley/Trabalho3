
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.LineNumberReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Arquivo {

	public void leitura(String arquivo, ArvoreBinariaBusca a) throws IOException {
		Charset charset = Charset.forName("US-ASCII");
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(arquivo), charset)) {
			String line = null;

			while ((line = reader.readLine()) != null) {
				String[] c2 = line.split(" ");
				for (int i = 0; i < c2.length; i++) {
					a.insert(Integer.parseInt(c2[i]));
				}
			}
		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		}
	}

}


package java8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithPlay {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader("afile"))) {
			br.readLine();
		}
	}

}


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PosListError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			readFile("test1.txt");
		}
		catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void readFile(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		Scanner in = new Scanner(file);
		
		while (in.hasNextLine()) {
			String line = in.nextLine();
			System.out.println(line);
		}
		
		in.close();
	}
}

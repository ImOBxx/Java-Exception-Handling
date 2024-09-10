import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileException {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            readFile("test1.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner in = new Scanner(file);

        try {
            while (in.hasNextLine()) {
                String line = in.nextLine(); // Fixed variable name
                System.out.println(line);
            }
        } finally {
            in.close(); // Ensuring the scanner is closed properly
        }
    }
}

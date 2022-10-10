import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class RandomNumberGenerator {

    public void createTexts() {
        File file1 = new File("1Mint.txt");
        File file2 = new File("50Mint.txt");
        Random rand = new Random();

        try {
            PrintWriter pw = new PrintWriter(file1);
            for (int i = 0; i < 1_000_000; i++) {
                int r = rand.nextInt(1_000_000);
                pw.println(r);
            }
            pw = new PrintWriter(file2);
            for (int i = 0; i < 50_000_000; i++) {
                int r = rand.nextInt(50_000_000);
                pw.println(r);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

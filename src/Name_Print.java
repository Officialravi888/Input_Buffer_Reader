import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Name_Print {
    public static void main(String[] args) {
        String[]name={"Ravi","John","Jerry"};
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter("File.txt"));

        br.write("Writing to a file.");
        br.write("\nHere is another line.");
        br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

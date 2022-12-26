import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File_Create {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            BufferedWriter writer2 = new BufferedWriter(new FileWriter("input.txt"));
            writer.write("Writing to a file.");
            writer.write("Hay i am ravi kant");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

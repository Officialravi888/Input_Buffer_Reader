import javax.naming.Name;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class NamePrint {
    public static void main(String[] args) {
        try {
            BufferedWriter Writer = new BufferedWriter(new FileWriter("File.txt"));
            Writer.write("Write a file");
            Writer.write("\nHeare is another line");
            String[] Name={"Ravi","John","Jerry"};
            for (String name: Name){
                Writer.write("\n"+name);
            }
            Writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

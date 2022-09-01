
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShorterTryStatement {
    public static void main(String[] args) {
        try ( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String line = reader.readLine();
            System.out.println(line.toLowerCase());
            //reader.close();
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

/*
String src = "c:\\projects\\log.txt";
String dest = "c:\\projects\\copy.txt";

FileInputStream input = null;
FileOutputStream output = null;

try
{
   input = new FileInputStream(src);
   output = new FileOutputStream(dest);

   byte[] buffer = input.readAllBytes();
   output.write(buffer);
}
finally
{
   if (input!=null)
      input.close();
   if (output!=null)
      output.close();
}
 */
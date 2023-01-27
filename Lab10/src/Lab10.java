import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lab10 {
    public static void Readfile(){
        Path file = Paths.get("input.txt");
        Charset charset = Charset.forName("US-ASCII");
        try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
            String line;
            while ((line = reader.readLine()) != null) {
                char[] str = line.toCharArray();
                if ('+' == str[str.length - 1] || str[str.length - 1] == '-' || str[str.length - 1] == '*' || str[str.length - 1] == '/' || str[str.length - 1] == '%')
                    throw new Exception("Some of the last string's input files contain operands that cannot be calculated !!");
                else {
                    Writefile(Calculate(line));
                }

            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String Calculate(String text)throws Exception{
        String[] operator = text.split("[0-9]");
        String[] textnum = text.split("[*/%+-]");
        int num = Integer.parseInt(textnum[0]);

        for (int i=0;i< textnum.length;i++){
            switch (operator[i]){
                case "+":
                    num+=Integer.parseInt(textnum[i]);
                    break;
                case "-":
                    num-=Integer.parseInt(textnum[i]);
                    break;
                case "*":
                    num*=Integer.parseInt(textnum[i]);
                    break;
                case "/":
                    num/=Integer.parseInt(textnum[i]);
                    break;
                case "%":
                    num%=Integer.parseInt(textnum[i]);
            }
        }
        return text+" = "+num;
    }
    //referance by https://www.baeldung.com/java-write-to-file
    public static String Writefile(String text){
        try (FileWriter writer = new FileWriter("output.txt", true);
             BufferedWriter bw = new BufferedWriter(writer);
             PrintWriter output = new PrintWriter(bw)) {
            output.println(text);
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
        return text;
    }

    //referance by https://www.javatpoint.com/how-to-delete-a-file-in-java
    public static void Delete(){
        try {
            File f= new File("output.txt");           //file to be delete
            if(f.delete()){     //returns Boolean value
                System.out.println(f.getName() + " deleted");   //getting and printing the file name
            } else {
                System.out.println("failed");
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Delete();
        Readfile();
    }
}
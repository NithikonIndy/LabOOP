import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class Lab13 {
        public static void Readfile() {
            for(int i=0;i<100000;i++){
                Path file = Paths.get("input.txt");
                List<String> list = new LinkedList<>();
                Charset charset = Charset.forName("US-Ascii");
                try (BufferedReader reader = Files.newBufferedReader(file,charset)){
                    String line = null;
                    while((line = reader.readLine()) != null){
                        list.add(Calculate(line));
                    }
                    Writefile(list);
                    Delete();
                }catch(IOException x){
                    System.err.format("IOException: %s%n",x);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    public static String Calculate(String input) throws SyntaxError {
        for(char s:input.toCharArray()){
            if((int)s >= 58 && (int) s <= 126 || (int) s == 46){
                throw new SyntaxError();
            }
        }

        ExprParser obj = new ExprParser(input);
        StringBuilder text = new StringBuilder();
        obj.getExr().prettyPrint(text);
        String str = text.toString();

        ExprParser obj2 = new ExprParser(input);
        int str2 = obj2.Evaluate();


        String result = str + " = " + str2;
        return result;
    }
    public static void Writefile(List<String> text){
        for(int i=0;i<100000;i++){
            try (FileWriter writer = new FileWriter("output.txt", true);
                 BufferedWriter bw = new BufferedWriter(writer);
                 PrintWriter output = new PrintWriter(bw)) {
                 output.println(text);

            } catch (IOException x) {
                System.err.format("IOException: %s%n", x);
            }
        }
        //Delete();
    }
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
            //Delete();
            Readfile();
        }
    }

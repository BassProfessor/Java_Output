import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class changing {

    public static void main(String[] args) throws Exception {       
        charOutStream();
}
    public static void charOutStream() throws Exception{
            File file = new File("D:" + File.separator + "demo" + File.separator + "test.txt");
            if(!file.getParentFile().exists()){
                file.getParentFile().mkdirs();
            }
            
            Writer out = new FileWriter(file);
            out.write("qweqwe");
            out.close();
            
        }


}

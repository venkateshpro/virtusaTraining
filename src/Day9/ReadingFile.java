package Day9;

import java.io.*;


public class ReadingFile {
	
	public static void main(String[] args) throws IOException 
    {
 
        File file = new File("C:\\Users\\Naga Venkatesh\\OneDrive\\Desktop\\hello.txt");
 
        
        BufferedReader br = new BufferedReader(new FileReader(file));
 
        String data;
        while ((data = br.readLine()) != null)
 
            System.out.println(data);
    }

}

package javaIO;
import java.io.*;
public class InputTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int c;
		
		try {
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\seonh\\git\\pattern\\study\\src\\javaIO\\test.txt")));
			while((c=in.read())>=0) {
				System.out.print((char)c);
			}
			in.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}

package javaIO;
import java.io.*;

public class LowerCaseInputStream  extends FilterInputStream{   //입력 스트림에 있는 대문자를 전부 소문자로 바꿔 주는 데코레이터
	public LowerCaseInputStream(InputStream in) {
		super(in);
	}
	
	public int read() throws IOException{    //byte 값
		int c = in.read(); 
		return (c==-1 ? c:Character.toLowerCase((char)c));
	}
	
	public int read(byte[] b, int offset, int len) throws IOException {    //byte 배열
		int result = in.read();
		for(int i = offset; i < offset+result; i++) {
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		return result;
	}
}

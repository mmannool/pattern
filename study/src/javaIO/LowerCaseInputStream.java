package javaIO;
import java.io.*;

public class LowerCaseInputStream  extends FilterInputStream{   //�Է� ��Ʈ���� �ִ� �빮�ڸ� ���� �ҹ��ڷ� �ٲ� �ִ� ���ڷ�����
	public LowerCaseInputStream(InputStream in) {
		super(in);
	}
	
	public int read() throws IOException{    //byte ��
		int c = in.read(); 
		return (c==-1 ? c:Character.toLowerCase((char)c));
	}
	
	public int read(byte[] b, int offset, int len) throws IOException {    //byte �迭
		int result = in.read();
		for(int i = offset; i < offset+result; i++) {
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		return result;
	}
}

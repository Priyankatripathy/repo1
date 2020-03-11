import java.io.*;
class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		String s = "test123";
		char buf[] = new char[s.length()];
		s.getChars(0, s.length(), buf, 0);
                
		System.out.println(buf);		
		System.out.println(buf.length);	
		                
		CharArrayReader in = new CharArrayReader(buf);
		BufferedReader f = new BufferedReader(in);
		int c, d = 0;
		
		//f.reset();
		
		
		
		while ((c = f.read()) != -1) {
			System.out.println((char)c);
			d++;
			
		}
		f.mark(5);
		System.out.println("d = " + d);
		
	}
}

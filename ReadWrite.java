package files;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;

class ReadWrite{
	public static void main(String[] args) throws Exception {
		File file = new File("D:/out.txt");
		//using buffered reader
		BufferedReader br = new BufferedReader(new FileReader(file));
		String input;
		while((input = br.readLine()) != null)
			System.out.println(input);
		br.close();
		
		//using file reader
//		FileReader fr = new FileReader(file);
//		int i;
//		while((i = fr.read()) != -1)
//			System.out.print((char)i);
//		fr.close();
		
		File wfile = new File("D:/MyFile.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(wfile));
		input = "To Sherlock Holmes she is always _The_ woman. I have seldom heard him\r\n" + 
				"menTion her under any oTher name. In his eyes she eclipses ond\r\n" + 
				"predominoTes The whole of her sex. IT was noT ThoT he feIT ony emoTion\r\n" + 
				"okin To love for Irene Adler. All emoTions, ond ThoT one porTiculorly,\r\n" ;
		bw.write(input);
		System.out.println("File created Successfully");
		bw.close();				
	}
}
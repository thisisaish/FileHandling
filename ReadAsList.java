package files;

import java.nio.charset.*;
import java.nio.file.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class ReadAsList{
	public static void main(String[] args) {
		List<String> list = readFileInList("D:/MyFile.txt");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
	public static List<String> readFileInList(String file){
		List<String> lines = Collections.emptyList();
		try {
			lines = Files.readAllLines(Paths.get(file),StandardCharsets.UTF_8);
//			Reading file content as String
//			String data = new String(Files.readAllBytes(Paths.get(file)));
		}catch(Exception ex) {
			System.out.print(ex);
		} 
		return lines;
	}
}
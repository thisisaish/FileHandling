package files;

import java.io.*;
import java.util.HashSet;

class RemoveDuplicateLines{
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("D:/MyFolder/texts/output.txt");
			BufferedReader br = new BufferedReader(new FileReader("D:\\MyFolder\\texts\\nanobots.txt"));
			String line;
			HashSet<String> hs = new HashSet<String>();
			while((line = br.readLine())!=null) {
				if(hs.add(line))
					pw.println(line);
			}
			System.out.println("Duplicate lines in the file are removed!");
			hs.clear();
			br.close();
			pw.flush();
			pw.close();
			File f = new File("D:/MyFolder/texts/output.txt");
			File fdest = new File("D:/MyFolder/texts/nanobots.txt");
			fdest.delete();
			f.renameTo(fdest);
		}
		catch(FileNotFoundException fnf) {
			System.out.println(fnf);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
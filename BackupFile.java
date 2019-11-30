package files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class createBackup{
	public static void main(String[] args) throws FileNotFoundException,IOException{
		Path source = Paths.get("D:\\MyFolder\\texts\\out.txt");
		File file = new File("D:\\bfolder");
		
		try {
			if(file.mkdir())
				System.out.println("Directory created successfully");
			else
				System.out.println("Directory cannot be created");
			Path target = Paths.get("D:\\bfolder\\out.bak");
			Files.copy(source, target);
		}catch(IOException ex) {
			System.out.println(ex);
		}
	}
}
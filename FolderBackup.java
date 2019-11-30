package files;

import java.util.Calendar;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

class FolderBackup{
	static String dest = "D:/BackupFolder";
	public static void main(String[] args) {
		File src = new File("D:/MyFolder");
		
		if(src.exists() && src.isDirectory()) {
			File[] files = src.listFiles();
			backupfiles(files);
		}
		System.out.println("Folder backup completed!");
	}
	
	public static void backupfiles(File[] files) {
		for(File f : files) {
			if(f.isFile()) {
				Path src = Paths.get(f.getAbsolutePath());
				try {
					Files.copy(src,Paths.get(dest+"/"+f.getName()));
					BufferedWriter bw = new BufferedWriter(new FileWriter(dest+"/"+f.getName(),true));
					Calendar cal = Calendar.getInstance();
					String timestamp = cal.getTime().toString();
					bw.append(timestamp);
					bw.close();
				}catch(FileNotFoundException fnf) {
					System.out.println(fnf);
				}catch(IOException ioe) {
					System.out.println(ioe);
				}
			}
			else if(f.isDirectory())
				backupfiles(f.listFiles());
		}
	}
}
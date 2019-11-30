package files;

import java.io.File;

class Fileprops{
	public static void main(String[] args) {
		File file = new File("D:/Gallery");
		
		if(file.isDirectory()) {
			File[] farr = file.listFiles();
			File lastModifiedFile = farr[0];
			for(File f : farr) {
				if(lastModifiedFile.lastModified() < f.lastModified())
					lastModifiedFile = f;
			}
			System.out.println(lastModifiedFile.getName());
		}
		
//		System.out.println("Name: "+file.getName());
//		System.out.println("Path: "+file.getPath());
//		System.out.println("Absolute path: "+file.getAbsolutePath());
//		System.out.println("Parent: "+file.getParent());
//		System.out.println("Exists: "+file.exists());
//		
//		if(file.exists()) 
//        { 
//            System.out.println("Is writeable: "+file.canWrite()); 
//            System.out.println("Is readable: "+file.canRead()); 
//            System.out.println("Is a directory: "+file.isDirectory()); 
//            System.out.println("File Size in bytes "+file.length()); 
//        }
	}
}
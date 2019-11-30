package files;

import java.io.File;
//import java.io.BufferedReader;

class ContentsDir{
	public static void main(String[] args) {
		File f = new File("D:/","Gallery");
		System.out.println("Dir: "+f.isDirectory());
		System.out.println("Exists: "+f.exists());
		if(f.exists() && f.isDirectory()) {
			String imageFiles[] = f.list();
			int limit = imageFiles.length;
			
			for(int iter = 0;iter < limit;iter++) {
				File fp = new File("D:/Gallery/"+imageFiles[iter]);
				if(fp.isHidden())
					System.out.println(imageFiles[iter]);
			}
		}
	}
}
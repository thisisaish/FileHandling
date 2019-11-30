package files;

import java.io.File;

class backupfiles{
	public static void main(String[] args) {
		File maindir = new File("D:/MyFolder");
		
		if(maindir.exists() && maindir.isDirectory()) {
			File[] arr = maindir.listFiles();
			recurPrintFiles(arr,0);
		}
	}
	
	static void recurPrintFiles(File[] arr,int level) {
		for(File f : arr) {
			for(int i = 0;i < level;i++) 
				System.out.print("\t");
			if(f.isFile()) {
				System.out.println(f.getName());
			}
			else if(f.isDirectory()) {
				System.out.println("["+f.getName()+"]");
				recurPrintFiles(f.listFiles(),level + 1);
			}
		}
	}
}
package files;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

class DeduplicationEngine{
//	Before dedup size: 43
//	After dedup size: 38
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:/C programs/MyFile.txt"));
//			"HiHellloHowareyoHiHelllou" copy this in sb to check for strings
			StringBuilder sb = new StringBuilder();
			String sentence;
			while((sentence = br.readLine()) != null) {
//				System.out.println(sentence);
				sb.append(sentence);
			}
			br.close();
			System.out.println(createChuncks(sb));
		}catch(FileNotFoundException f) {
			System.out.println(f);
		}catch(IOException i) {
			System.out.println(i);
		}
	}
	
	private static String createChuncks(StringBuilder sb) {
//		int chuncks = 0;
		ArrayList<String> blks = new ArrayList<String>();
		String block;
		StringBuilder dedupStr = new StringBuilder();
		for(int iter = 0;iter < sb.length();iter+=8) {
			if(iter+8 < sb.length())
				block = sb.substring(iter, iter + 8);
			else
				block = sb.substring(iter, sb.length());
			if(blks.contains(block))
				dedupStr.append(blks.indexOf(block));
			else {
				blks.add(block);
				dedupStr.append(block);
			}
		}
		for(int iter = 0;iter < dedupStr.length();iter++) {
			if(dedupStr.charAt(iter)>='0' && dedupStr.charAt(iter)<='9')
				System.out.println(blks.get(dedupStr.charAt(iter)-48));
			else
				System.out.print(dedupStr.charAt(iter));
		}
		return dedupStr.toString();
	}
}
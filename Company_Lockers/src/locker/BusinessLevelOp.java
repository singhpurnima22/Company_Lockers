package locker;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BusinessLevelOp {

	public void createNewFile() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file Name :");
		String str = sc.next();
		File f3 = new File("/Users/purnima/workspace/Company_Lockers/files/" + str);
		if (f3.exists() == true) {
			System.out.println("File Already Exist");

		} else {
			f3.createNewFile();
			System.out.println("file created");

		}

	}

	public void deleteFile() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the file name to delete");
		String str1 = sc1.next();

		File f = new File("/Users/purnima/workspace/Company_Lockers/files/" + str1);
		if (f.exists() == true) {
			f.delete();
			System.out.println("Deleting........");
			System.out.println("File Deleted");
		} else {
			System.out.println("file not found...");
		}

	}

	public void searchFile() {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the file name to search");
		String searchf = sc2.next();
		// File f = new File("/Users/purnima/workspace/Company_Lockers/files/"+searchf);
		File f1 = new File("/Users/purnima/workspace/Company_Lockers/files");

		List<String> flist = Arrays.asList(f1.list());

		if (flist.contains(searchf)) {
			System.out.println(searchf + " File Exist ");
		} else {
			System.out.println("File not found ");
		}
		

	}
	
	
}

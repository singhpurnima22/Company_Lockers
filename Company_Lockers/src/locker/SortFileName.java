package locker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SortFileName {

	// @SuppressWarnings("unchecked")
	public void ascending() {

		File f1 = new File("/Users/purnima/workspace/Company_Lockers/files");
		if (f1.isDirectory() == true) {
			String[] fname = f1.list();
			Arrays.sort(fname);

			for (String str : fname) {
				System.out.println(str);

			}

		} else {

			System.out.println("Empty");
		}

	}

}

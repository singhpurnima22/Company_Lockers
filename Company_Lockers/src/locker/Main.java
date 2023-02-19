package locker;

import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("              Application Name : Lockedme.com   ");
		System.out.println("              Developer Name   : Purnima Singh  \n");

		Scanner sc = new Scanner(System.in);
		int ch = 0;
		SortFileName sf1 = new SortFileName();

		while (ch != 3) {
			System.out.println("1. Retrieving the file names in an ascending order :");
			System.out.println("2. Business-level operations :");
			System.out.println("3. Close the application : \n");
			System.out.println("Choose any one option from above");

			ch = sc.nextInt();

			switch (ch) {
			case 1:
				sf1.ascending();
				System.out.println("\n");
				break;

			case 2:
				int submenu = 0;
				System.out.println("\n");

				while (submenu != 4) {
					System.out.println("1. add a user specified file to the application :");
					System.out.println("2. delete a user specified file from the application :");
					System.out.println("3. search a user specified file from the application :");
					System.out.println("4. Exit and Go Back to Main Menu :");

					submenu = sc.nextInt();

					BusinessLevelOp op = new BusinessLevelOp();
					switch (submenu) {

					case 1:

						op.createNewFile();
						break;
					case 2:
						op.deleteFile();
						break;
					case 3:
						op.searchFile();
						break;
					case 4:
						System.out.println("Moving back to Main menu.....");
						break;
					}

					// break;
				}
				break;

			case 3:
				System.out.println("Thanks for using App.....");

				break;
			}

		}

	}

}

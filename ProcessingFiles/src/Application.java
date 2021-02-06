import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		/**		
		  for(int i=0;i<=3;i++) { 
			  Scanner input = new Scanner(System.in); // in is InputStream 
			  System.out.println("Enter some Text: "); 
			  String enteredText = input.nextLine(); 
			  System.out.println(enteredText); 
		  }
		 
		 **/
		
		/**
		// Read data from the file
		//File file = new File("myFile1.txt"); //To get exception
		File file = new File("myFile.txt");
		Scanner input;
		try {
			input = new Scanner(file);

			while (input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			//e.printStackTrace();
		}
		
		**/
		
		MyFileUtils myUtil = new MyFileUtils();
		try {
			System.out.println(myUtil.subtract10FromLargeNumber(1));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

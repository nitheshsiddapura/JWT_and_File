package filedelete;
import java.io.*;


import filedelete2.FileDelete;

public class Mainclass {


//Java program to delete a file 
 


	public static void main(String[] args) 
	{ 
		
		
		File file = new File("C:\\Users\\Compaq\\Downloads\\a.png"); 
        System.out.println(file.toString());
		if(file.delete())
		{ 
			System.out.println("File deleted successfully"); 
		} 
		else
		{ 
			System.out.println("Failed to delete the file"); 
		} 
	} 
} 

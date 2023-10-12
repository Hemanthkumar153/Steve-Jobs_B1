package ExceptionHandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
  	
	public static void main(String[] args) throws IOException {
		
  	File newfile = new File("C:\\Users\\heman\\eclipse-workspace\\Java_Examples\\src\\FileHandling.txt");
    File newfile2 = new File("C:\\Users\\heman\\eclipse-workspace\\Java_Examples\\src\\FileHandling2.txt");
    
    System.out.println(newfile.createNewFile());
  	System.out.println(newfile.canExecute());
  	System.out.println(newfile.canRead());
  	System.out.println(newfile.canWrite());
  	System.out.println(newfile.exists());
    System.out.println(newfile.getAbsolutePath());
    System.out.println(newfile.getFreeSpace());
    System.out.println(newfile.getName());
    System.out.println(newfile.getPath());
    System.out.println(newfile.getParent());
    System.out.println(newfile.getTotalSpace());
    System.out.println(newfile.isFile());
    System.out.println(newfile.getUsableSpace());
    System.out.println(newfile.compareTo(newfile2));
    System.out.println(newfile.isAbsolute());
  	
    
    FileReader fr = new FileReader(newfile);
    FileWriter wr = new FileWriter(newfile2);
    
    BufferedReader br = new BufferedReader(fr);
    BufferedWriter bw = new BufferedWriter(wr);
    
 
    
   bw.write("Hi I am Hemanth Kumar :::::");
   bw.write("From Visakhapatnam");
   bw.flush();
   
   System.out.println(br.readLine());
   fw.close();
  
   }
  			 
 }
  		

  		
  	

	
	
	
	



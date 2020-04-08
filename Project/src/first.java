
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
public class first {
	
	public static void main(String[] args) throws IOException {
		
		Vehicle car=new Vehicle("abc",456);
		Vehicle bike=new Vehicle("cde",896);

		try(FileOutputStream fos=new FileOutputStream("author\\prakriti\\vehicles.dat")){
			try(ObjectOutputStream o1=new ObjectOutputStream(fos)){
				o1.writeObject(car);
				o1.writeObject(bike);
				
			}
			System.out.println("done");
		}
		catch(IOException e)
		{
			System.out.println("Error Occured");
		}
		
		try(FileInputStream fos=new FileInputStream("author\\prakriti\\vehicles.dat")){
			try(ObjectInputStream o1=new ObjectInputStream(fos)){
				Vehicle v1=(Vehicle)o1.readObject();
				System.out.println("Object is"+v1);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("done");
		}
		catch(IOException e)
		{
			System.out.println("Error Occured");
		}
		
	}
	
//		File file=new File("author\\prakriti");
//		file.mkdirs();
//       file=new File("author\\prakriti\\SomeText");
//      file.createNewFile();
//		System.out.println("Created");
//		
//		try(BufferedWriter bw=new BufferedWriter(new FileWriter(file,true)))
//		{
//			bw.append("prakriti");
//			bw.newLine();
//			bw.append("gupta");
//			bw.newLine();
//			bw.append("jatin");
//			bw.newLine();
//			bw.append("gupta");
//			bw.close();
//		}
//		catch(IOException e)
//		{
//			System.out.println("Error Occured");
//		}
//	try
//	{
//	BufferedReader br=new BufferedReader(new FileReader("author\\prakriti\\SomeText"));
//		 String line;
//		 while((line=br.readLine())!=null)
//		 {
//			 System.out.println(line);
//		 }
//		 br.close();
//	}
//	catch(IOException e)
//	{
//		System.out.println("Error Occured");
//	}
//	}
}

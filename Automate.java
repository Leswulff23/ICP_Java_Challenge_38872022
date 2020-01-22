import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
*@author Leslie Nartey Kodjoe
*Created my own constructor with specified default values
*Below are three instance variables
*There are three return statements in the getter methods
*/
public class Automate{
	private String Itemname;
	private int quantity;
	private double Itemprice;
	
	File file = new File("essentials_stock.txt");
	File file2 = new File("backup_essentials_stock.txt");
	
	/**
	* Constructor
	*/
	public Automate()
		{
			this.Itemname = "No item";
			this.quantity = 0;
			this.Itemprice = 0.0;
		}
			
	// Set method to take input of the name of the item
	public void setItem()
	{
		Scanner InputItem = new Scanner(System.in);
		System.out.println("Enter name item: ");
		Itemname = InputItem.nextLine();
	}
	// Set method to take input of the item's quantity
	public void setQuant()
	{
		Scanner InputQuant = new Scanner(System.in);
		System.out.println("Enter quantity number: ");
		quantity = InputQuant.nextInt();
	}
	
	//Set method to take input of the item's price
	public void setPrice()
	{
		Scanner InputPrice = new Scanner(System.in);
		System.out.println("Enter price of item: ");
		Itemprice = InputPrice.nextDouble();
	}
	
	//Below are getter methods that return values
	public String getItem()
		{return Itemname;}
	public int getQuant()
		{return quantity;}
	public double getPrice()
		{return Itemprice;}	
	
	
	
	// Method to write to File("essentials_stock.txt") and its backup.
	//
	public void CreateFile()
	{
		PrintWriter output = null;
		PrintWriter output2 = output; //links the first text file to its backup
	
		try
		{
			output = new PrintWriter(new FileOutputStream(file, true));
			output2 = new PrintWriter(new FileOutputStream(file2, true));
		}
		
		catch (IOException e)
		{
			System.out.println("There was an error");
		}
		output.println("Item: "+ getItem()+"     Quantity: "+getQuant()+"     Price: "+getPrice());
		output.close(); // Closes the file after writing
		
		output2.println("Item: "+ getItem()+"     Quantity: "+getQuant()+"     Price: "+getPrice());
		output2.close();
	}
	
	// Method to read information from file
	public void DisplayContent()
	{
		try
		{
			System.out.println("Output of essentials_stock.txt: ");
			Scanner readfile = new Scanner(file); // input are obtained from the file
			while(readfile.hasNextLine())
			{System.out.println(readfile.nextLine());}
			System.out.println();
		
			System.out.println("Output of backup_essentials_stock.txt: ");
			Scanner readfile2 = new Scanner(file2);
			while(readfile2.hasNextLine())
			{System.out.println(readfile2.nextLine());}
	
		}
		catch (FileNotFoundException ex){
			System.out.println("The file was not found");
		}
	}
	
	
	
}
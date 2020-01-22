import java.io.FileNotFoundException;
/**
*@author Leslie Nartey Kodjoe
*Test file
*/
public class TestFile{
	
	public static void main(String[] args) throws FileNotFoundException
		{
			Automate Test1 = new Automate(); // Object Creation

			Test1.setItem();
			Test1.setQuant();
			Test1.setPrice();
			Test1.CreateFile();
			Test1.DisplayContent();
		}
	
	
}
package PatterPrintPKG;

public class PatterPrint {

	public static void main(String[] args) {
		
		// Declaring and Initializing 'A' character 
		
		char c='a';
		
		System.out.println();
		System.out.println("The Diamond Pattern Is As Shown Below");
		System.out.println();
		System.out.println("*************************************");
		System.out.println();
		
		for(int i=1; i<4; i++)                    // For Loop to handle the Rows and Columns - 1st Part
		{
			for(int j=1; j<4-i; j++)              // For Loop to handle the Spaces
			{
				System.out.print(" ");
			}	
			
			for(int k=1; k<=i; k++)               // For Loop to Print the Alphabets in the Ascending Order
			{
				System.out.print(c);
			    c++;
			}
			
			--c;
			
			for(int l=1; l<i; l++)               // For Loop to Print the Alphabets in the Descending Order
			{
			  --c;
			  System.out.print(c);
			}
			 
			System.out.println();                // To go to new line
		}
		
		for(int i=1; i<3; i++)                   // For Loop to handle the Rows and Columns - 2nd Part
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}	
			
			for(int k=3; k>i; k--)              // For Loop to Print the Alphabets in the Ascending Order
			{
				System.out.print(c);
			    c++;
			}
			
			--c;
			
			for(int l=2; l>i; l--)              // For Loop to Print the Alphabets in the Descending Order
			{
			  --c;
			  System.out.print(c);
			}
			
			System.out.println();               // To go to new line
		}
         
		System.out.println();
		System.out.println("*************************************");
	}
}

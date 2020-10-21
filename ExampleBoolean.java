public class ExampleBoolean{
	
	public static void main(String[] boxes)
	{
		System.out.println("invoked main method by JVM");
		arrayOfBoolean();
		System.out.println("exiting main method by JVM");
	}
	
	
	
	public static void arrayOfBoolean()
	{
		 System.out.println("invoked arrayOfEmail");
	
		 boolean earthIsFlat=false;
	     
	     boolean[] earthIsFlats={true,false};
		 int sizeOfArray=earthIsFlats.length;
		 System.out.println("Total elements "+sizeOfArray);
		 
		 
		 boolean elementAtIndex1=earthIsFlats[1];
		 
		 System.out.println("Element at index one "+elementAtIndex1);
		 
		 boolean elementAtIndex2=earthIsFlats[2];
		 
		 System.out.println("Element at index two "+elementAtIndex2);
		 
		 boolean elementAtIndex3=earthIsFlats[3];
		 
		 System.out.println("Element at index three "+elementAtIndex3);
	
	}
	
	
	
}
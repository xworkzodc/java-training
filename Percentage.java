public class Percentage{
	
	public static void main(String[] boxes)
	{
		System.out.println("invoked main method by JVM");
		arrayOfPercentage();
		System.out.println("exiting main method by JVM");
	}
	
	
	
	public static void arrayOfPercentage()
	{
		 System.out.println("invoked arrayOfPercentage");
	
		 float sslcPercentage=88.80f;
		 float pucPercentage=83.14f;
		 float degreePercentage=65.3f;
	     
	
		 //array is group of similar types
	     float[] percentages={sslcPercentage,pucPercentage,degreePercentage};
		 int sizeOfArray=percentages.length;
		 System.out.println("Total elements "+sizeOfArray);
		 
		 
		 float elementAtIndex1=percentages[1];
		 
		 System.out.println("Element at index one "+elementAtIndex1);
		 
		 float elementAtIndex3=percentages[3];
		 
		 System.out.println("Element at index three "+elementAtIndex3);
		 
		 float elementAtIndex4=percentages[1];
		 
		 System.out.println("Element at index four "+elementAtIndex4);
	
	}
	
	
	
}
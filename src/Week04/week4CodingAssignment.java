package Week04;

import java.util.Arrays;

public class week4CodingAssignment {

	public static void main(String[] args) {
	    int[]ages = {3, 9, 23, 64, 2, 8, 28, 93};
        System.out.println("1---------");
        System.out.println(ages[ages.length -1] - ages[0]);
      
        ages = Arrays.copyOf(ages, ages.length + 1);
        ages[ages.length - 1] = 17;
        System.out.println("2---------");
        System.out.println(Arrays.toString(ages));
        
        double sum = 0.0;
        for(int i = 0; i < ages.length;) {
        sum =+ ages[i];
        }
        double average = sum / ages.length;
        System.out.println("3------------");
        System.out.println(average); 
        
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	    int numberOfLetters = 0;
	    for(String name : names) {
	    numberOfLetters += name.length();
	    }
	    System.out.println("4-----------"); 
	    System.out.println(numberOfLetters);
	    
	    String namesSpace = "";
        for(int x = 0; x < names.length; x++) {
        namesSpace += names[x] + " ";
        }
        System.out.println("5-----------");
        System.out.println(namesSpace);
        
        
	    int[]age = {3, 9, 23, 64, 2, 8, 28, 93};
	    System.out.println("7----------");
	    System.out.println(age[age.length - 1]);
	    System.out.println("8----------");
	    System.out.println(age[0]);
	    
	    System.out.println(createWord("Hello", 3));
	    
	    System.out.println("Jane" + " " + "Doe");
	    
	    int[] arrays = {40, 10, 3, 25, 60};
	    System.out.println(sumGreaterThan(arrays));
	    double[] array = { 25, 6, 75, 77, 170 };
	    System.out.println(averageOfAll(array));
	   
	    double[] arrayAvg1 = {125, 55, 205, 30};
	    double[] arrayAvg2 = {25, 65, 75, 150};   
	    System.out.println(greaterThenAvg(arrayAvg1, arrayAvg2));
	    
	    double moneyInPocket = 15.0;
 	    boolean isHotOutSide = true;
 	    System.out.println(willBuyDrink(moneyInPocket, isHotOutSide));
	    
 	   int numberOfPeople = 7; 
 	   double costOfPool = 4;
 	   System.out.println("We going to the pool" + numberOfPeople + costOfPool);
 	   
	   }
	    
	  
       public static String createWord( String word, int number) {
       String createWord = "";
       for ( int i = 0; i < number ; i++) {
       createWord += word;
       }
       return createWord; 
       }
       public static String personFullName (String firstName, String lastName) {
	   firstName = "Jane"; 
       lastName = "Doe"; 
       return firstName + lastName;
       }
       public static boolean sumGreaterThan(int[] arrays) {
       int greater = 0;   
       for(int array : arrays) {
       greater += array;   
       if(greater > 100) {
       return true;	
       }else {      
       }
       }
       return false;
       }
	   public static double averageOfAll(double array[]){
	   double sum = 0;
	   for(double arrays : array) {
	   sum += arrays / array.length;
	   }
	   return sum / array.length;
	   }
	   public static boolean greaterThenAvg(double[] arrayAvg1, double[] arrayAvg2) {
	   double avg = 0;
	   for(double averages : arrayAvg1) {
	   avg += averages;
	   }
	   double thenAvg = 0;
	   for(double averages : arrayAvg2) {
	   thenAvg += averages;
	   }
	   if(avg > thenAvg) {
	   return true;
	   }else {
	   return false;
	   }
	   }
	   public static boolean willBuyDrink(double moneyInPocket, boolean isHotOutSide) {
	   if(moneyInPocket > 10.50 && isHotOutSide) {
       return true;
       }else if(moneyInPocket <= 10.50 && !isHotOutSide) {
     		  
       } 
	   return false;
	   
       }
	   public static  boolean goToSwamming(int numberOfPeople, double costOfPool) {
		   costOfPool = 4;
		   numberOfPeople = 7;
		   if(costOfPool < 4 && numberOfPeople < 7) {
			   return goToSwamming(numberOfPeople, costOfPool);
			  
		   }else {
			   if(costOfPool > 4 && numberOfPeople >= 7) {
				  
			   }
			   return false;
			  
		   }
		   
	   }
      
	}



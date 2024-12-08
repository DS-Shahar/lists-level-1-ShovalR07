package newmaterial;

import java.util.*;

public class class123 {
	
	
	public static List<Integer> arrayToList(int[] arr) 
	{
		List<Integer> list = new ArrayList<>();
        for (int i=0; i<arr.length;i++) 
        {
            list.add(arr[i]);
        }
        return list;
	}
	
	 public static void printList(List<Integer> list) 
	 {
	        for (int num : list) 
	        {
	            System.out.println(num);
	        }
	    }
	 
	 
	  public static void printListRecursive(List<Integer> list, int index) {
	        if (index > list.size()) {
	            return;
	        }
	        System.out.println(list.get(index));
	        printListRecursive(list, index + 1);
	    }
	 
	  public static void printListReverseRecursive(List<Integer> list, int index) {
	        if (index < 0) {
	            return;
	        }
	        System.out.println(list.get(index));
	        printListReverseRecursive(list, index - 1);
	    }
	 
	  
	  public static List<Integer> buildListFromInput() {
	        Scanner scanner = new Scanner(System.in);
	        List<Integer> list = new ArrayList<>();
	        while (true) {
	            System.out.print("Enter a positive number (or -1 to stop): ");
	            int num = scanner.nextInt();
	            if (num == -1) 
	            {
	                break;
	            }
	            if (num > 0) 
	            {
	                list.add(num);
	            }
	        }
	        return list;
	    }
	  
	  public static void printEvenNumbers(List<Integer> list) 
	  {
	        for (int num : list)
	        {
	            if (num % 2 == 0) {
	                System.out.println(num);
	            }
	        }
	    }
	  
	  public static boolean isIn (List<Integer> list, int target)
	  {
		  for(int i=0;i<list.size();i++)
		  {
			  if(list.get(i)== target)
			  {
				  return true;
			  }
		  }
		  return false;
	  }
	  
	  public static boolean containsNumber(List<Integer> list, int target) 
	  {
	        return containsNumberTailRecursive(list, target, 0);
	    }
	  
	  public static boolean containsNumberTailRecursive(List<Integer> list, int target, int index) {
	        if (index == list.size()) 
	        {
	            return false;
	        }
	        if (list.get(index) == target) 
	        {
	            return true;
	        }
	        return containsNumberTailRecursive(list, target, index + 1);
	    }
	  
	  
	public static void main(String[] args) {

		int [] arr= {4,8,3,2,9};
		List list =arrayToList(arr);
		/*
	    printList(list);
	    printListReverseRecursive(list, list.size() -1 );
	    List<Integer> userInputList = buildListFromInput();
	    System.out.println("User input list: " + userInputList);
boolean flag = isIn(list,17);
System.out.println(flag);
*/
	}

}

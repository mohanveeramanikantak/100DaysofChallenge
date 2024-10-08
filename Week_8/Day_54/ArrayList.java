//ArrayList Example
import java.util.ArrayList;
class ArrayList
{
    	public static void main(String[] args) 
	{
        	ArrayList<String> list = new ArrayList<>();
        	list.add("Apple");
        	list.add("Banana");
        	list.add("Cherry");
        	for (String fruit : list) 
		{
            		System.out.println(fruit);
        	}

        	list.remove("Banana");
        	System.out.println("After removing Banana: " + list);
    	}
}

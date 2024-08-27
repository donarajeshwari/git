package javacollection;
import java.util.ArrayList;
import java.util.Iterator;


	


public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names_list = new ArrayList<String>();
		names_list.add("alex");
		names_list.add("john");
		names_list.add("joe");
		names_list.add("marry");
		
		System.out.println(names_list.get(0));
		System.out.println("==================================");
		
		for (int i = 0; i < names_list.size(); i++) {
			System.out.println(names_list.get(i));
			
		}
		System.out.println("=================================");
		
		Iterator itrObj = names_list.iterator();
		while (itrObj.hasNext()){
			System.out.println(itrObj.next());
			
		}

	}

}

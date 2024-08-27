package javacollection;

import java.util.Iterator;
import java.util.LinkedList;

public class Sample2 {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("alex");
		l1.add("julie");
		l1.add("john");
		
		Iterator itrObj = l1.iterator();
		while (itrObj.hasNext()){
			System.out.println(itrObj.next());
		}
		
		
		// TODO Auto-generated method stub

	}

}

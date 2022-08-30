package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		
		List<Object> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers; // erro de compilação
		// a lista de Integer não é uma lista de Object, assim não sendo um SuperTipo dele, não conseguindo fazer um upcasting.
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	}

	public static void printList(List<?> list) {
		list.add(3); //não pode add nada pois o compilador não sabe de qual tipo especifico a lista foi instanciada (Se é string ou Integer).
		for (Object obj : list) {
		System.out.println(obj);
		}
	}
}

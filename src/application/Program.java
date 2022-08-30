package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		
		List<Object> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers; // erro de compila��o
		// a lista de Integer n�o � uma lista de Object, assim n�o sendo um supertipo dele, n�o conseguindo fazer um upcasting.
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	}

	public static void printList(List<?> list) {
		list.add(3); //n�o pode add nada pois o compilador n�o sabe de qual tipo especifico a lista foi instanciada (Se � string ou Integer).
		for (Object obj : list) {
		System.out.println(obj);
		}
	}
}
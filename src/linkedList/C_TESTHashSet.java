package linkedList;

//COLLECTION 4\C_TEXT.java
import java.util.HashSet;
import java.util.Iterator;

public class C_TESTHashSet {
	 public static void main(String[] args) {
		 HashSet<String> hs = new HashSet<String>();
		 hs.add("toto");
		 hs.add("tata");
		 hs.add("titi");
		 Iterator<String> it = hs.iterator();
		 while (it.hasNext()) {
		 System.out.println(it.next());
		 }
		 System.out.println("\nParcours avec un tableau d'objet");
		 System.out.println("----------------------------------");
		 Object[] obj = hs.toArray();
		 for (Object o : obj) {
		 System.out.println(o);
		 }
		 }
		}
		/*
		titi
		toto
		tata
		Parcours avec un tableau d'objet
		--------------------------------
		titi
		toto
		tata
		*/


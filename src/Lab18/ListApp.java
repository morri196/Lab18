package Lab18;


public class ListApp {

	public static void main(String[] args) {
		//MyList list = new MyArrayList();
		MyList list = new MyLinkedList();
		list.addAtBeginning("one");
		list.addAtBeginning("two");
		list.addAtBeginning("three");
		list.addAtBeginning("four");
		list.addAtBeginning("six");
		list.addAtBeginning("eight");
		//list.insterAt(1, "five");
		//list.insterAt(8, "negative-one");
		//list.removeAt(1);
		
		System.out.println(list);
		//test(list);
//		list = new MyArrayList();
//		test(list);
	}
	
//	private static void test(MyList list) {
//		list.addAtBeginning("B");
//		list.addAtBeginning("A");
//		list.addAtEnd("C");
//		list.addAtEnd("D");
//		list.removeFromBeginning();
//		list.removeFromEnd();
//		
//		System.out.println(list);
//		System.out.println(list.size());
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//	}

}

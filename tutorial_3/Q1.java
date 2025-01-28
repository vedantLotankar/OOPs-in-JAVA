package tutorial_3;

class LibraryBook {

	String title;
	String author;
	Integer price;

}


public class Q1 {

	void displayDetails(LibraryBook obj){

		System.out.println("Title : " + obj.title);
		System.out.println("Author : " + obj.author);
		System.out.println("Price : " + obj.price);

	}

	public static void main (String []args){

		LibraryBook book1 = new LibraryBook();

		book1.title = "Crime & Punishment";
		book1.author = "Fyodor Dostoevsky";
		book1.price = 230;

		Q1 app = new Q1();
    	app.displayDetails(book1);
			
	}	    
    
}


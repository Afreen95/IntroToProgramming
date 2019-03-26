public class newObjects {
	
	public static void main(String[] args) {
		Book b = new Book();
		b.title ="Calvin and Hobbes";
		b.author ="Bill Watterson";
		b.year = 1990;
		
		System.out.println(b.year);
		
		Person p = new Person("Hannah", "Black", b);
		System.out.println(p.name);
		System.out.println(p.favBook.title);
		

	}

}

class Book{
	String title;
	String author;
	int year;
	
}

class Person{
	String name;
	String favColor;
	Book favBook;
	
	Person(String n, String c, Book b){
		name = n;
		favColor = c;
		favBook = b;
	}
}
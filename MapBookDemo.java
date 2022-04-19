package mapdemo;


import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


import collectionsdemo.Book;


public class MapBookDemo {
	
	


	
		public static void main(String[] args) {
			
			//Create a MAp of Books
			Map<Integer,Book> bookMap=new TreeMap<>();
			
			//Create Books
			Book b1=new Book(10,"Let us C ","Yaswanth","BBP", 8);
			Book b2=new Book(11,"DS & Newtworking","Forouxan","Mc Graw Hill", 4);
			Book b3=new Book(12,"Operating Systems","Galwin","Wiley", 6);
			
			//adding books to Map
			bookMap.put(3, b3);
			bookMap.put(1, b1);
			bookMap.put(2, b2);
		
			//Traversing in Map 
			for(Entry<Integer,Book> e:bookMap.entrySet())
			{
				int key=e.getKey();
				Book b=e.getValue();
				System.out.println("Book :"+key+" Details: ");
				System.out.println(b.getId()+ " "+b.getName()+" "+b.getAuthor()+" "+b.getPublisher()+" "+b.getQuantity());
			}

		}

	}



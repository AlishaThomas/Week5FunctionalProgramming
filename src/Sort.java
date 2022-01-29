import java.util.List;

public class Sort {

	
	public static void main(String[] args) {
		new Sort().run();
		new Sort().run2();
	}

	  private void run() { List<Cat> lambda = Cat.getCats(); lambda.sort((catA,
	  catB)-> Cat.compare(catA, catB)); System.out.println(lambda);
	  
	  }
	 
	private void run2() {
		List<Cat> cats = Cat.getCats();
		cats.sort(Cat::compare);
		System.out.println(cats);
	}
	
	
	
}


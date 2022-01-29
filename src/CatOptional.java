import java.util.NoSuchElementException;
import java.util.Optional;

public class CatOptional {
	
	public static void main(String[] args) {
		new CatOptional().run();
	}

	private void run() {
		
		Cat cat = methodA(Optional.of(new Cat("Dog")));
		System.out.println(cat);
		
		try {
			methodA(Optional.empty());
		}catch(NoSuchElementException e) {
		System.out.println(e.getMessage());
		}
		
	}

	private Cat methodA(Optional<Cat> optionalCat) {
	return optionalCat.orElseThrow(() -> new NoSuchElementException("Not a Cat!"));

	}
}
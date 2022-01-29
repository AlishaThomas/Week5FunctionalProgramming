import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		
		new Stream().run();
		
		
	}

	private void run() {
		
	String catStream = Cat.getCats().stream()
		.map(Cat::toString)
		.sorted()
		.collect(Collectors.joining(", "));
	System.out.println(catStream);
	}

}

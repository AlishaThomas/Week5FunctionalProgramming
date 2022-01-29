import java.util.ArrayList;
import java.util.List;

public class Cat {

	private String name;
	
	private static List<Cat> cats = List.of(
			new Cat("Shorthair"),
			new Cat("Bengal"),
			new Cat("Calico"),
			new Cat("Longhair"),
			new Cat("Himalayan"));
	
	
	public Cat(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return name + " Cat";
	}
	
	public static int compare(Cat catA, Cat catB ) {
		return catA.name.compareTo(catB.name);
	}
	
	public static List<Cat> getCats(){
		return new ArrayList<>(cats);
	}
	
	
	
}

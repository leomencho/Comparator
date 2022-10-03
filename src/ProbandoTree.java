import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ProbandoTree {
	public static void main(String[] args) {
		
		Set<String> ts= new TreeSet<>((a,b) -> b.compareTo(a)
		);
		ts.add("uno");
		ts.add("dos");
		ts.add("tres");
		ts.add("tres");
		ts.add("cuatro");
		
		System.out.println("los ts son: " + ts);
		
		Set<Integer> num = new TreeSet<>(Comparator.reverseOrder());
		num.add(1);
		num.add(3);
		num.add(2);
		num.add(8);
		num.add(3);
		
		System.out.println("lo numeros son "+ num);
		
	}
}

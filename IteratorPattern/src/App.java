import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class App {

	/**
	 * Iterator pattern is very commonly used design pattern in Java !!!
	 * 	 This is used to get a way to access the elements of a collection object in 
	 * 		sequential manner without any need to know its underlying representation
	 * 
	 */
	
	public static void main(String[] args) {

		NameRepository nameRepository = new NameRepository();
		
//		for(Iterator iter = nameRepository.getIterator(); iter.hasNext() ; ){
//			String name = (String) iter.next();
//			System.out.println(name);
//		}

		List<String>names = Arrays.asList("adam","daniel","ron","ana");
        Stack<String>stack = new Stack<>();
		stack.push("10");
		stack.push("20");
		stack.push("30");

		Iterator<String> iterator= names.iterator();

		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

	}
}

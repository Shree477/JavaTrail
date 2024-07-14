import java.util.ArrayList;
import java.util.List;

public class ListExample2 {

	public static void main(String[] args) {
		
		List<String>list=new ArrayList<String>();
		list.add("Ganesh");		
		list.add("Anand");
		list.add("Shyam");
		list.add("Amol");
		list.add(null);
		list.add(null);
		System.out.println(list);
	}

}
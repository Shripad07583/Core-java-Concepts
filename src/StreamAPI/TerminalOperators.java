package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TerminalOperators {
	
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(12,34,56,78,90,76,54,34);
		
		//1.Print using for each
		// l.Stream().forEach(x -> System.out.print(x));
		
		
		//2. skipping element and staring in list
		List<Integer> la = l.stream().skip(5).toList();
		System.out.println(la.toString());
		
		
		//3. count
		Long count = l.stream().count();
		System.out.println("count is : " + count );
		
		
		//4. collect
		Set<Integer> s = l.stream().collect(Collectors.toSet());
		
		
		//5. Any match
		boolean flag = l.stream().anyMatch(y -> y>100);
		System.out.println(flag);
		
		
		//6. All match
		boolean flag2 = l.stream().allMatch(z-> z>10);
		System.out.println(flag2);
		
		
		//7. none match
		boolean flag3 = l.stream().noneMatch(w -> w == 32);
		System.out.println(flag3);
		
		
		
	}

}

package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperators {
	
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(12,34,5,6,78,898,654,45);
		
		//iteration -> foreach -> terminal operator
		l.stream().forEach(x -> System.out.println(x));
		
		
		
		 l.stream()
		.filter(x -> x%3 ==0)
		.filter(x -> x%2 == 0)
		.map(y -> y * 10)
		.forEach(x -> System.out.println(x));
		 
		          
		 
		  l.stream()
		  .filter(x -> x%3 ==0)
		  .filter(x -> x%2==0)
		  .map(y -> y*10)
		  .forEach(x -> System.err.print(x));
		  
		  
		  //find number divisible by 3 and print it
		  
		  l.stream()
		  .filter(condition -> condition %3==0)
		  .forEach(x-> System.out.println(x));
		  
		  //multiply each number by 10 and store it in list
		  List<Integer> la = l.stream().map(value -> value *10).collect(Collectors.toList());
		  System.out.println(la.toString());
		  
		  
		  //count numbers less than 5
		  Long count = l.stream().filter(y-> y<5).count();
		  System.out.println(count);
		
		
		
		
		
	}

}

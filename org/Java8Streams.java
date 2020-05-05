package org;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Streams {

	public static void main(String[] args) throws IOException {

		/*
		 * //1.Integer Streams
		 * 
		 * IntStream .range(1, 10) .forEach(a -> System.out.print(a));
		 * 
		 * System.out.println();
		 * 
		 * //2.Integer Stream by skipping some elements
		 * 
		 * IntStream .range(1, 10) .skip(5) .forEach(System.out::print);
		 * 
		 * System.out.println();
		 * 
		 * 
		 * //3.Integer Stream with Sum
		 * 
		 * System.out.print( IntStream .range(1, 6) .sum());
		 * 
		 * 
		 * //4.Sort in Ascending order
		 * 
		 * Stream.of("Dsg","Vicente","Javier","Dhanashekar") .sorted() .findFirst()
		 * .ifPresent(System.out::print);
		 * 
		 * //Sort in Descending order
		 * 
		 * Stream.of("Dsg","Vicente","Javier","Dhanashekar")
		 * .sorted(Comparator.reverseOrder()) .findFirst()
		 * .ifPresent(System.out::print);
		 * 
		 * 
		 * //5.Stream from Array,sort filter and print
		 * 
		 * String[] array =
		 * {"Dsg","Vicente","Javier","Dhanashekar","DRaja","DRani","Dinesh"};
		 * 
		 * Arrays.stream(array) .filter(a -> a.startsWith("DR"))
		 * .forEach(System.out::println);
		 * 
		 * //6.Avg of a square of an int Array
		 * 
		 * Arrays.stream(new int[] {2,4,6,8,10}) .map(x -> x*x) .average()
		 * .ifPresent(System.out::print);
		 * 
		 * 
		 * //7. Stream from list filter and print
		 * 
		 * List<String> stringLists =
		 * Arrays.asList("Dsg","Vicente","Javier","Dhanashekar");
		 * 
		 * stringLists .stream() .map(String::toLowerCase) .filter(x ->
		 * x.startsWith("d")) .forEach(System.out::println);
		 * 
		 * 
		 * //8.Stream rows from text file , sort, filter and print
		 * 
		 * Stream<String> bands = Files.lines(Paths.get(
		 * "C:\\Users\\dhanashekaragowda.sm\\Workspace\\Java8Streams\\src\\org\\bands.txt"
		 * ));
		 * 
		 * //System.out.println(Paths.get(
		 * "C:\\Users\\dhanashekaragowda.sm\\Workspace\\Java8Streams\\src\\org\\bands.txt"
		 * ).toAbsolutePath());
		 * 
		 * bands.sorted().filter(x -> x.length() >=12).forEach(System.out::println);
		 * 
		 * bands.close();
		 * 
		 * //9.Stream rows from text file and save to list
		 * 
		 * List<String> bands2 = Files.lines(Paths.get(
		 * "C:\\Users\\dhanashekaragowda.sm\\Workspace\\Java8Streams\\src\\org\\bands.txt"
		 * )) .filter(x -> x.length()<=10) .collect(Collectors.toList());
		 * 
		 * //10.Stream rows from CSV file and count
		 * 
		 * bands2.forEach(System.out::println);
		 * 
		 * Stream<String> bands3 = Files.lines(Paths.get(
		 * "C:\\Users\\dhanashekaragowda.sm\\Workspace\\Java8Streams\\src\\org\\data.txt"
		 * ));
		 * 
		 * int rowCount = (int) bands3.map(x -> x.split(",")).filter(x ->
		 * x.length==3).count();
		 * 
		 * System.out.println("Number of proper rows : "+rowCount); bands3.close
		 

		// 11.Stream rows from CSV file,parse data from rows
		
		Stream<String> rows = Files.lines(Paths.get("C:\\Users\\dhanashekaragowda.sm\\Workspace\\Java8Streams\\src\\org\\data.txt"));

		rows.map(x -> x.split(","))
		.filter(x -> x.length==3)
		.filter(x -> Integer.parseInt(x[1])>15)
		.forEach(x->System.out.println(x[0]+" "+x[1]+" "+x[2]));
		
		rows.close();
		
		
		//12.Stream rows from CSV file and store fields in HashMap
		
		Stream<String> rows = Files.lines(Paths.get("C:\\Users\\dhanashekaragowda.sm\\Workspace\\Java8Streams\\src\\org\\data.txt"));
		
		Map<Character,Integer> collect = new HashMap<>();
				
		collect = rows
				.map(x -> x.split(","))
				.filter(x -> x.length==3)
				.filter(x -> Integer.parseInt(x[1])>=15)
				.collect(Collectors.toMap( x ->
						x[0].charAt(0),x -> Integer.parseInt(x[1])));
		
		collect.forEach((k,v) -> System.out.println(k +":"+v));
		
		//13.Reduction- Sum
		
		double total = Stream.of(7.3,1.5,4.8)
				.reduce(0.0,(Double a,Double b) -> a+b);
		
		System.out.print(total);
		*/
		
		//14.Reduction - summary statistics
		
		IntSummaryStatistics  summary = IntStream.of(7,2,19,88,73,4,10)
				.summaryStatistics();
		
		System.out.print(summary);
		
		
	}
}

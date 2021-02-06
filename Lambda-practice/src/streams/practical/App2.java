package streams.practical;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App2 {

	public static void main(String[] args) throws IOException {

		Stream<String> lines = Files.lines(Paths.get("files/wordFile.txt"));
		lines.sorted().filter(l -> l.length() > 6).forEach(x -> System.out.print(x + ", "));
		lines.close();
		System.out.println();
		
		List<String> words = Files.lines(Paths.get("files/wordFile.txt"))
				.filter(x -> x.contains("th"))
				.collect(Collectors.toList());
		words.forEach(x -> System.out.print(x + ", "));
		System.out.println();
		
		Stream<String> rows = Files.lines(Paths.get("files/stockDataCsv.txt"));
		int rowCount = (int) rows
				.map(x -> x.split(","))
				.filter(x -> x.length >3)
				.count();
		System.out.println(rowCount + " good rows.");
		rows.close();
		
		Stream<String> filerows = Files.lines(Paths.get("files/stockDataCsv.txt"));
		filerows.map(x -> x.split(",")) //x - entire line as a text and store it as array
		.filter(x -> x.length > 3)
		.filter(x -> Integer.parseInt(x[1].trim()) > 15)
		.forEach(x -> System.out.println(x[0].trim() + " " + x[2].trim() + " " + x[3].trim()));
		
		filerows.close();
				
	}
}

package fileprocessors;

import java.io.IOException;

import aggregators.AggregatorProcessor;
import aggregators.MinAggregator;

public class AggregatorApp {

	public static void main(String[] args) throws IOException {
		
		
		  MinAggregator agg = new MinAggregator(); 
		  AggregatorProcessor<MinAggregator> aggsProcessor = new AggregatorProcessor<MinAggregator>(agg,"table.csv");
		  double value = aggsProcessor.runAggregator(1); // column number of file
		  System.out.println(value);
		 
	}

}

package telran.stream;

import java.util.Random;
import java.util.stream.IntStream;

public class SportLoto {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printing out sportloto random numbers
		//application with command line mandatory arguments
		//first argument minimal inclusive value
		//second argument maximal inclusive value
		//third argument amount of the random numbers
		//Example: java -jar sportLoto 1 49 7
		// 3, 10, 49, 1, 40, 6, 7
		int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[1]);
		int count = Integer.parseInt(args[2]);
		
		Random random = new Random();
		IntStream.generate(() -> random.nextInt((max - min) + 1) + min).distinct().limit(count).forEach(System.out::println);
	}
}

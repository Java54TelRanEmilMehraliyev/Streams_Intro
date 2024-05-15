package telran.stream;

import java.util.Random;


public class SportLoto {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// printing out sportloto random numbers
		// application with command line mandatory arguments
		// first argument minimal inclusive value
		// second argument maximal inclusive value
		// third argument amount of the random numbers
		// Example: java -jar sportLoto 1 49 7
		// 3, 10, 49, 1, 40, 6, 7
		if (args.length < 3) {
			throw new IllegalArgumentException(
					"Требуются три аргумента: минимальное значение, максимальное значение и количество чисел");

		}
		int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[1]);
		int count = Integer.parseInt(args[2]);

		if (min >= max) {
			throw new IllegalArgumentException("Минимальное значение должно быть меньше максимального");
		}
		if (count <= 0) {
			throw new IllegalArgumentException("Количество чисел должно быть больше 0");
		}
		if (count > (max - min + 1)) {
			throw new IllegalArgumentException("Количество чисел не может быть больше диапазона значений");
		}
		Random random = new Random();
		random.ints(min, max + 1).distinct().limit(count).forEach(i -> System.out.print(i + "\t"));
	}
}

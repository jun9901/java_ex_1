package ch08;

import java.util.Arrays;
import java.util.Random;

public class LottoNumber {

	final static int LOTTTO_NUMBER_SIZE = 6;
	public int[] getLottoNuber() {
		
		// 번호를 담을 공간 만들기
		int[] numbers = new int[LOTTTO_NUMBER_SIZE];
		Random random = new Random();
		
		for (int i = 0; i < numbers.length; i++) {
			int seletedNumber = random.nextInt(45) + 1;
			numbers[i] = seletedNumber;
			Arrays.sort(numbers);
			for (int j = 0; j < i; j++) {
				if(numbers[i] == numbers[j]) {
					i = i - 1;
					break;
				}
			}
		}
		
		return numbers;
	}
	public static void main(String[] args) {
		LottoNumber lottoNumber = new LottoNumber();
		
		for (int i = 0; i < args.length; i++) {
			String string = args[i];
			
		}
	}
}

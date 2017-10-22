//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

public class IntroToRandom {
	public static void main(String[] args) {
		Random gen = new Random();

		int rand = gen.nextInt(101);
		System.out.println(rand);
		rand = gen.nextInt(50) + 25;
		System.out.println(rand);
		rand = gen.nextInt(310) - 222;
		System.out.println(rand);
	}
}
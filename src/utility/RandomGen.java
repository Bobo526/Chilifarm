package utility;

import java.util.*;

public abstract class RandomGen {
	
	static Random random = new Random();
	
	public static int getRandomQuality() {
		
		return random.nextInt(10) + 1;
	}
	
	public static double getRandomGrowTime() {
		
		return 8.0 + (10.0 - 8.0) * random.nextDouble();
	}
}
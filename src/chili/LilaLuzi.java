package chili;

import utility.RandomGen;

public class LilaLuzi extends Chili{
	
	public LilaLuzi(String n) {
		
		name = n;
		
		type = "LilaLuzi";
		price = 2.5;
		growTime = RandomGen.getRandomGrowTime();
		quality = RandomGen.getRandomQuality();
	}
}
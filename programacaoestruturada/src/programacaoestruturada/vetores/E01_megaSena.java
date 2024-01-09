package programacaoestruturada.vetores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class E01_megaSena {

	public static void main(String[] args) {
	
		int[] aposta = new int[6];
		
		aposta[0] = (int) Math.round(Math.random()*59+1);
		
		aposta[1] = (int) Math.round(Math.random()*59+1);
		
		aposta[2] = (int) Math.round(Math.random()*59+1);
		
		aposta[3] = (int) Math.round(Math.random()*59+1);
		
		aposta[4] = (int) Math.round(Math.random()*59+1);
		
		aposta[5] = (int) Math.round(Math.random()*59+1);
		
		//System.out.printf("%d - %d - %d - %d - %d - %d",aposta[0],aposta[1],aposta[2],aposta[3],aposta[4],aposta[5]);
		
		System.out.println(Math.random());
	}
}

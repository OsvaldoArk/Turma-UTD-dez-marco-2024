package programacaofuncional.foreach;

import java.util.Arrays;
import java.util.List;

public class E01_NumerosMenores {
	static int menoresQue501 = 0;
	
	public static void main(String[] args) {
		
		List<Integer> crazyNumbers = Arrays.asList(937, 5, 395, 402, 501, 333, 502, 781, 3, 691);
	
		
		crazyNumbers.forEach(x -> {if(x<501) menoresQue501++;});
	
		System.out.println(menoresQue501);
	}

}

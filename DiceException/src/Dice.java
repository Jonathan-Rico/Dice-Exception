public class Dice {	
	public int Throw(int dices){	
		int total = 0;
		
		if (dices >3 || dices <1) {
			throw new ArithmeticException();
		}
		if (dices >= 1 && dices <=3) {
			for (int k = dices; k >0; k--) {
				int die = (int) (1 + (Math.random() * 6));
				System.out.printf("Dice %d is % d\n", k , die);
				total = total + die;
			}
		}
		System.out.printf("\t%d dice have been rolled.\n", dices);
		System.out.printf("Total = %s\n", total);
		return total;
		
					
	}
}
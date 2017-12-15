
public class Dice {
	
	private int[] die1Rolls;
	private int[] die2Rolls;
	private int   loadedDieIndex;
	private int   lastDie1Roll;
	private int   lastDie2Roll;
	
	public Dice(int[] die1Rolls, int[] die2Rolls){
		this.loadedDieIndex = 0;
		this.die1Rolls = die1Rolls;
		this.die2Rolls = die2Rolls;
	}
	
	public Dice(){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void roll() {
		this.lastDie1Roll = die1Rolls[this.loadedDieIndex];
		this.lastDie2Roll = die2Rolls[this.loadedDieIndex];
		loadedDieIndex++;
	}

	public int getDie1Roll() {
		// TODO Auto-generated method stub
		return this.lastDie1Roll;
	}

	public int getDie2Roll() {
		// TODO Auto-generated method stub
		return this.lastDie2Roll;
	}

}

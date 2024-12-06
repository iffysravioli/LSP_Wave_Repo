package org.howard.edu.lsp.finalexam.question2;
import java.util.Random;

public class JavaRandomStrategy {
	private Random random = new Random();
    
    public int generateRandomNumber() {
        return Math.abs(random.nextInt()) + 1;

}

	public int generateRandomNumber1() {
		// TODO Auto-generated method stub
		return 0;
	}
}
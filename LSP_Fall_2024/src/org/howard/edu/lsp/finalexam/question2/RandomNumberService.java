package org.howard.edu.lsp.finalexam.question2;
public class RandomNumberService {
    private static RandomNumberService instance;
    private JavaRandomStrategy strategy;
    
    private RandomNumberService() {
 
    }
    
   
    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }
    
  
    public void setStrategy(JavaRandomStrategy customRandomStrategy) {
        this.strategy = customRandomStrategy;
    }
    
   
    public int getRandomNumber() {
        if (strategy == null) {
            throw new IllegalStateException("No strategy set");
        }
        return strategy.generateRandomNumber();
    }


	public void setStrategy(CustomRandomStrategy customRandomStrategy) {
		// TODO Auto-generated method stub
		
	}
}
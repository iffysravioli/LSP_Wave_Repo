package org.howard.edu.lsp.finalexam.question2;

public class RandomNumberClient {
    public static void main(String[] args) {
        RandomNumberService service = RandomNumberService.getInstance();
        
        // Test Java's built-in random number generator
        service.setStrategy(new JavaRandomStrategy());
        System.out.println("Using Java Random Strategy: " + service.getRandomNumber());
        
        // Test custom random number generator
        service.setStrategy(new CustomRandomStrategy());
        System.out.println("Using Custom Random Strategy: " + service.getRandomNumber());
    }
}
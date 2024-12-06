package org.howard.edu.lsp.finalexam.question2;

public class CustomRandomStrategy {
	private long seed = System.currentTimeMillis();
    private static final long multiplier = 1597;
    private static final long increment = 51749;
    private static final long modulus = Integer.MAX_VALUE;
    
    public int generateRandomNumber() {
        seed = (multiplier * seed + increment) % modulus;
        return (int) Math.abs(seed) + 1;
}
}
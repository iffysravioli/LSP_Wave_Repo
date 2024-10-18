package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;

public class VotingMachine {
    private HashMap<String, Integer> candidates = new HashMap<>();
    public void addCandidate(String name) { candidates.putIfAbsent(name, 0); }
    public void castVote(String name) { candidates.put(name, candidates.get(name) + 1); }
    public String toString() { return candidates.toString(); }

    public static void main(String[] args) {
        VotingMachine vm = new VotingMachine();
        vm.addCandidate("Alsobrooks"); vm.castVote("Alsobrooks");
        vm.addCandidate("Hogan");
        System.out.println(vm); // Prints candidates and votes
    }
}

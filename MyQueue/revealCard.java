/*
You are given an integer array deck. There is a deck of cards where every card has a unique integer. The integer on the ith card is deck[i].

You can order the deck in any order you want. Initially, all the cards start face down (unrevealed) in one deck.

You will do the following steps repeatedly until all cards are revealed:

Take the top card of the deck, reveal it, and take it out of the deck.
If there are still cards in the deck then put the next top card of the deck at the bottom of the deck.
If there are still unrevealed cards, go back to step 1. Otherwise, stop.
Return an ordering of the deck that would reveal the cards in increasing order.

Note that the first entry in the answer is considered to be the top of the deck */
package MyQueue;

import java.util.*;
import java.util.Queue;

public class revealCard {
  public static void main(String[] args) {
    int[] d = { 17, 13, 11, 2, 3, 5, 7 };
    int[] ans = new int[d.length];
    int z = 0;
    Arrays.sort(d);
    Queue<Integer> q = new ArrayDeque<>();
    for (int i = 0; i < d.length; i++) {
      q.add(i);
    }
    while (q.size() > 1) {
      int idx = q.remove();
      ans[idx] = d[z];
      z++;
      q.add(q.remove());
    }
    ans[q.remove()] = d[z];
    for (int i = 0; i < ans.length; i++) {
      System.out.print(ans[i] + " ");
    }
  }
}

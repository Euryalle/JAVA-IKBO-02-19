package com.company;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        int[] mas1 = {1, 3, 5, 7, 9};
        int[] mas2 = {2, 4, 6, 8, 0};
        Game(mas1,mas2);
    }

    public static void Game(int[] FirstPlayer, int[] SecondPlayer){
        int Turn = 0;
        ArrayDeque<Integer> First = new ArrayDeque<>();
        ArrayDeque<Integer> Second = new ArrayDeque<>();
        for(int fp : FirstPlayer){
            First.add(fp);
        }
        for(int sp : SecondPlayer){
            Second.add(sp);
        }
        while(true){
            if(Turn == 106) {
                System.out.println("botva");
                return;
            }
            if(First.peek() > Second.peek() ||
                    First.peek()==0 && Second.peek()==9 ) {
                First.add(First.remove());
                First.add(Second.remove());
            }
            else if(First.peek() < Second.peek() ||
                    First.peek()==9 && Second.peek()==0){
                Second.add(Second.remove());
                Second.add(First.remove());
            }
            if(First.isEmpty()) {
                System.out.println("second "+ Turn);
                return;
            }
            else if(Second.isEmpty()){
                System.out.println("first "+ Turn);
                return;
            }
            Turn++;
        }

    }

}


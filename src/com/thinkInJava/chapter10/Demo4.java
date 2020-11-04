package com.thinkInJava.chapter10;


interface Game{
    boolean move();
}

interface GameFactory{
    Game getGame();
}

class Checkers implements Game{

    private Checkers() {
    }

    private int moves = 0;
    private static final int MOVES= 3;


    @Override
    public boolean move() {
        System.out.println("Checkers move"+moves);
        return ++moves!=MOVES;
    }

    public static GameFactory factory  = new GameFactory() {
        @Override
        public Game getGame() {
            return new Checkers();
        }
    };
}

class Chess implements Game{
    private Chess(){

    }

    private int moves= 0;
    private static final int MOVES=4;


    @Override
    public boolean move() {
        System.out.println("Chess move"+moves);
        return ++moves != MOVES;
    }

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Chess();
        }
    };
}

class Games{
    public static void playGame(GameFactory factory){
        Game game = factory.getGame();
        while((game.move()));
    }

    public static void main(String[] args) {
        playGame(Checkers.factory);
        playGame(Chess.factory);
    }
}

/**
 *
 * 通过匿名内部类来对工厂模式进行改进，对应的是Demo3
 * */

public class Demo4 {
}

package com.lbg.coh2;

/**
 * Hello world!
 *
 */
public class Runner
{
    public static void main( String[] args )
    {
        UserInput user_input = new UserInput();
        Game game = new Game();
        game.createGrid(20, 20);

        while (user_input.acceptInput() != 4) {
            ;
        }
        System.out.println( "Hello World!" );
    }
}

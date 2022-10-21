package com.lbg.coh2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    /**
    *Test start work or not.
     **/
    @Test
    public void testStart(){
        Game game = new Game();
        game.start();
        System.out.println(Arrays.toString(game.treasureSpot));
        System.out.println(Arrays.toString(game.playerPosition));
    }
}

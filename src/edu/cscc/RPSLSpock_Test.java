package edu.cscc;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RPSLSpock_Test {
    private RPSLSpock rpslSpock;

    @Test
    void isValidPick() {
        Assert.assertTrue(RPSLSpock.isValidPick("rock"));
        Assert.assertTrue(RPSLSpock.isValidPick("paper"));
        Assert.assertTrue(RPSLSpock.isValidPick("scissors"));
        Assert.assertTrue(RPSLSpock.isValidPick("lizard"));
        Assert.assertTrue(RPSLSpock.isValidPick("spock"));
        Assert.assertFalse(RPSLSpock.isValidPick("Invalid_Condition"));
    }

    @Test
    void generatePick() {
        for (int i = 0; i<1000000; i++) {
            String pick = RPSLSpock.generatePick();
            Assert.assertTrue(pick != null);
            Assert.assertTrue(RPSLSpock.isValidPick(pick));
        }
    }

    @Test
    void isComputerWin() {
        Assert.assertTrue(RPSLSpock.isComputerWin("paper","rock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("paper","spock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("rock","lizard"));
        Assert.assertTrue(RPSLSpock.isComputerWin("rock","scissors"));
        Assert.assertTrue(RPSLSpock.isComputerWin("scissors","paper"));
        Assert.assertTrue(RPSLSpock.isComputerWin("scissors","lizard"));
        Assert.assertTrue(RPSLSpock.isComputerWin("lizard","paper"));
        Assert.assertTrue(RPSLSpock.isComputerWin("lizard","spock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("spock","rock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("spock","scissors"));

    }
}
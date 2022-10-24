package test;

import spil.Account;
import spil.Player;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    // Positive test
    @org.junit.jupiter.api.Test
    void setWallet() {
        Player player = new Player();

        player.getAccount().setWallet(-50);
        assertTrue(player.getAccount().getWallet() >= 0, "Fake news");

        player.getAccount().setWallet(50);
        assertFalse(player.getAccount().getWallet()<=0);
    }


    // Negative test
    @org.junit.jupiter.api.Test
    void withdraw() {

    }
}
package com.example.tutorial;
 
import com.example.Node;
import org.hexbot.api.methods.Bank;
import org.hexbot.api.methods.Inventory;
 
public class ExampleBanking extends Node {
    private final int JUNK = 666;
 
    @Override
    public boolean activate() {
        return Inventory.isFull(); //The node will only activate if the players inventory is full
    }
     
    @Override
    public void execute() {
        if (Bank.isOpen()) {
            if (Bank.deposit(JUNK, 0)) {
                Bank.close();
            } else {
                Bank.open();
            }
        }
    }
}

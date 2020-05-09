/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockchain;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */

public class Blockchain {

    /**
     * @param args the command line arguments
     */
    ArrayList<Block> blockchain = new ArrayList<>();
    public static void main(String[] args) {


        String[] genesisTransactions = {"Suraj sent John 999900 bitcoins","hal finney sent 10 bitcoins to John"};
        Block genesisBlock = new Block(0,genesisTransactions);
        System.out.println(genesisBlock.getBlockHash());
         
        String[] block2Transactions = {"John sent 10 bitcoins to Suraj","Suraj sent 10 bitcoins to satrbuck"};
        Block block2= new Block(genesisBlock.getBlockHash(), block2Transactions);
    
       String[] block3Transactions = {"John sent 999 bitcoins to non"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);
    
        
         System.out.println(block2.getBlockHash());
    }
    
    
}

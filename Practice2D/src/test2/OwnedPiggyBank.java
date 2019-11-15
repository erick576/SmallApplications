package test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * A class representing a piggy bank that has an owner. 
 * A piggy bank owns a collection (or possibly collections) of coins,
 * but does not own the coins themselves.
 * 
 * <p>
 * Only the owner of the piggy bank is able to remove coins
 * from the piggy bank.
 */
public class OwnedPiggyBank {
	// YOU NEED TO ADD A FIELD OR FIELDS TO STORE THE COINS
	
	private List<Coin> coins;
	
	private Owner owner;

	/**
	 * Initializes this piggy bank so that it has the specified owner
	 * and no coins.
	 * 
	 * @param owner
	 *            the owner of this piggy bank
	 */
	public OwnedPiggyBank(Owner owner) {
	this.coins = new ArrayList<>();
	this.owner = owner;
	}

	/**
	 * Initializes this piggy bank by copying another piggy bank. This piggy
	 * bank will have the same owner and the same number and type of coins as
	 * the other piggy bank.
	 * 
	 * @param other
	 *            the piggy bank to copy
	 */
	public OwnedPiggyBank(OwnedPiggyBank other) {
	this.coins = new ArrayList<>(other.coins);
	this.owner = other.owner;
	
	}

	/**
	 * Returns the owner of this piggy bank.
	 * 
	 * @return the owner of this piggy bank
	 */
	public Owner getOwner() {
		
		return this.owner;
	}

	/**
	 * Adds the specified coins to this piggy bank.
	 * 
	 * @param coins
	 *            a list of coins to add to this piggy bank
	 */
	public void add(List<Coin> coins) {
		this.coins.addAll(coins);
	}

	/**
	 * Returns true if this piggy bank contains the specified coin, and false
	 * otherwise.
	 * 
	 * @param coin
	 *            a coin
	 * @return true if this piggy bank contains the specified coin, and false
	 *         otherwise
	 */
	public boolean contains(Coin coin) {
		
		return this.coins.contains(coin);
	}

	/**
	 * Allows the owner of this piggy bank to remove a coin equal to the value
	 * of the specified coin from this piggy bank.
	 * 
	 * <p>
	 * If the specified user is not equal to the owner of this piggy bank,
	 * then the coin is not removed from this piggy bank, and null is returned.
	 * 
	 * @param user
	 *            the person trying to remove the coin
	 * @param coin
	 *            a coin
	 * @return a coin equal to the value of the specified coin from this piggy
	 *         bank, or null if user is not the owner of this piggy bank
	 * @pre. the piggy bank contains a coin equal to the specified coin
	 */
	public Coin remove(Owner user, Coin coin) {
		if(!this.owner.equals(user)) {
			return null;
		}
		this.coins.remove(coin);
		return new Coin(coin);
	}

	/**
	 * Allows the owner of this piggy bank to remove
	 * the smallest number of coins whose total value in cents is equal
	 * to the specified value in cents from this piggy bank.
	 * 
	 * <p>
	 * Returns the empty list if the specified user is not equal to
	 * the owner of this piggy bank.
	 * 
	 * @param user
	 *            the person trying to remove coins from this piggy bank
	 * @param value
	 *            a value in cents
	 * @return the smallest number of coins whose total value in cents is equal
	 *         to the specified value in cents from this piggy bank 
	 * @pre. the piggy bank contains a group of coins whose total value is equal
	 *         to specified value
	 */
	public List<Coin> removeCoins(Owner user, int value) {
		if(!this.owner.equals(user)) {
			return new ArrayList<Coin>();
		}
	int dec = value;
	List<Coin> ccc = new ArrayList<Coin>(this.coins);
	List<Coin> cc = new ArrayList<Coin>();
	for(int m = 0; m < ccc.size(); m ++) {
		int i = ccc.lastIndexOf(Coin.TOONIE);
		if(i == -1) {break;}
		if(i != -1) {
		dec -= 200;
		if(dec < 0) {dec += 200; break;}
		cc.add(Coin.TOONIE); 
		ccc.remove(i);}
		
		if(dec == 0) {return cc;}
	}
	for(int l = 0; l < ccc.size(); l ++) {
		int i = ccc.lastIndexOf(Coin.LOONIE);
		if(i == -1) {break;}
		if(i != -1) {
		dec -= 100;
		if(dec < 0) {dec += 100; break;}
		cc.add(Coin.LOONIE); 
		ccc.remove(i);}
		if(dec == 0) {return cc;}
	}
	
	for(int k = 0; k < ccc.size(); k ++) {
		int i = ccc.lastIndexOf(Coin.QUARTER);
		if(i == -1) {break;}
		if(i != -1) {
		dec -= 25;
		if(dec < 0) {dec += 25; break;}
		cc.add(Coin.QUARTER); 
		ccc.remove(i);}
		if(dec == 0) {return cc;}
	}
	for(int h = 0; h < ccc.size(); h ++) {
		int i = ccc.lastIndexOf(Coin.DIME);
		if(i == -1) {break;}
		if(i != -1) {
		dec -= 10;  
		if(dec < 0) {dec += 10; break;}
		cc.add(Coin.DIME); 
		ccc.remove(i);}
		if(dec == 0) {return cc;}
	}
	for(int g = 0; g < ccc.size(); g ++) {
		int i = ccc.lastIndexOf(Coin.NICKEL);
		if(i == -1) {break;}
		if(i != -1) {
		dec -= 5;
		if(dec < 0) {dec += 5; break;}
		cc.add(Coin.NICKEL); 
		ccc.remove(i);}
		if(dec == 0) {return cc;}
	}

	for(int f = 0; f < ccc.size() + 1; f ++) {
		int i = ccc.lastIndexOf(Coin.PENNY);
		if(i != -1) {
		dec -= 1;
		cc.add(Coin.PENNY); 
		ccc.remove(i);}
		if(dec == 0) {return cc;}
	}
		return cc;
	}
	
	

	
	/**
	 * Returns a deep copy of the coins in this piggy bank. The returned list
	 * has its coins in sorted order (from smallest value to largest value;
	 * i.e., pennies first, followed by nickels, dimes, quarters, loonies, and
	 * toonies).
	 * 
	 * @return a deep copy of the coins in this piggy bank
	 */
	public List<Coin> deepCopy() {
	List<Coin> deep = new ArrayList<Coin>(this.coins);
	List<Coin> ret = new ArrayList<Coin>();
	for(int f = 0; f < deep.size(); f ++) {
		int i = deep.lastIndexOf(Coin.PENNY);
		if(i == -1) {break;}
		if(i != -1) {ret.add(new Coin(deep.get(i))); deep.remove(i);}
	}
	for(int f = 0; f < deep.size() + 1; f ++) {
		int i = deep.lastIndexOf(Coin.NICKEL);
		if(i == -1) {break;}
		if(i != -1) {ret.add(new Coin(deep.get(i))); deep.remove(i);}
	}
	for(int f = 0; f < deep.size() + 1; f ++) {
		int i = deep.lastIndexOf(Coin.DIME);
		if(i == -1) {break;}
		if(i != -1) {ret.add(new Coin(deep.get(i))); deep.remove(i);}
	}
	for(int f = 0; f < deep.size() + 1; f ++) {
		int i = deep.lastIndexOf(Coin.QUARTER);
		if(i == -1) {break;}
		if(i != -1) {ret.add(new Coin(deep.get(i))); deep.remove(i);}
	}
	for(int f = 0; f < deep.size() + 1; f ++) {
		int i = deep.lastIndexOf(Coin.LOONIE);
		if(i == -1) {break;}
		if(i != -1) {ret.add(new Coin(deep.get(i))); deep.remove(i);}
	}
	for(int f = 0; f < deep.size() + 1; f ++) {
		int i = deep.lastIndexOf(Coin.TOONIE);
		if(i == -1) {break;}
		if(i != -1) {ret.add(new Coin(deep.get(i))); deep.remove(i);}
	}
	return ret;
	}

	
	/**
	 * Counts the number of coins equal to the specified coin
	 * in this piggy bank.
	 * 
	 * <p>
	 * NOTE TO STUDENTS: You should create a private static 
	 * helper method that recursively counts the number of 
	 * coins in a specified list, array, or map depending on
	 * how you chose to implement the piggy bank. This method
	 * should then call the recursive method to get the required
	 * count.
	 * 
	 * @param coin a coin
	 * @return the number of coins equal to the specified coin
	 * in this piggy bank
	 */
	public int numberOf(Coin coin) {
		// YOU SHOULD MAKE A PRIVATE RECURSIVE HELPER METHOD AND CALL 
		// THE HELPER METHOD
		
		return helper(this.coins, coin, 0, 0);
	}
	private int helper(List<Coin> cc, Coin c, int counter, int counter2) {
		if(counter2 == cc.size()) {
			return counter;
		}
		if(cc.get(counter2).getValue() == c.getValue()) {
			return helper(cc, c, counter + 1, counter2 + 1);
		}
		return helper(cc, c, counter, counter2 + 1);
	}
	// ADD A PRIVATE STATIC HELPER METHOD HERE
	
	
	
}

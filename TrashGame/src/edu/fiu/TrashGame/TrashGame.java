/**
 * 
 */
package edu.fiu.TrashGame;

/**
 * @author simon
 *
 */
public class TrashGame {
	
	private int player; // how many player play the game
	
	/**create a Trash game class to start the game
	 * 
	 */
	public void startgame() {
		
	}
	/**create a method called startgame to call all the method in each class.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * call method in each class
		 */
		
		Hand myhand = new Hand();
		myhand.pickcard();
		myhand.throwcard();
		myhand.positioncard();
		myhand.throwcard();
		myhand.replacecard();
		myhand.discard();
		myhand.faceup();
		myhand.facedown();
		
		Deck myDeck = new Deck();
		myDeck.shuffle();
		
		Player myPlayer = new Player();
		myPlayer.makeMove();
		
		Trash myTrash = new Trash();
		myTrash.gettopcard();
		
	}

}

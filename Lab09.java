/**
 * A robot moves along a row, collecting piles of beepers and placing them one square to
 * the right.
 * 
 * @author <Andre Purits>
 * @version <...>
 *
 */

import edu.fcps.karel2.Display; 
import javax.swing.JOptionPane;

public class Lab09 {
	 
	 public static void main(String[] args) {
		 String map = JOptionPane.showInputDialog("Which map?");
		 Display.openWorld("maps/"+map+".map");
		 Display.setSize(10, 10);
		 Athlete athena = new Athlete(1, 1, Display.EAST, 0);
		 //TODO write a combination of definite and indefinite loops that will cause athena
		 // to pick up each pile of beepers and deposit them one square to the right.
       int beepers = 0;
       while(athena.nextToABeeper()) {
         athena.pickBeeper();
         beepers++;
         }
       athena.move();
       
       int p = 0;
       while(athena.nextToABeeper()) {
       athena.pickBeeper();
       p++;
       }
       for(int n = beepers; n > 0; n--) {
       athena.putBeeper();
       beepers--;
       }
       athena.move();
       while(athena.nextToABeeper()) {
       athena.pickBeeper();
       beepers++;
       }
       for(int z = p; z > 0; z--) {
       athena.putBeeper();
       p--;
       }
       athena.move();
       
       while(athena.nextToABeeper()) {
       athena.pickBeeper();
       p++;
       }
       for(int n = beepers; n > 0; n--) {
       athena.putBeeper();
       beepers--;
       }
       athena.move();
       while(athena.nextToABeeper()) {
       athena.pickBeeper();
       beepers++;
       }
       for(int z = p; z > 0; z--) {
       athena.putBeeper();
       p--;
       }
        athena.move();
       
       while(athena.nextToABeeper()) {
       athena.pickBeeper();
       p++;
       }
       for(int n = beepers; n > 0; n--) {
       athena.putBeeper();
       beepers--;
       }
       athena.move();
       while(athena.nextToABeeper()) {
       athena.pickBeeper();
       beepers++;
       }
       for(int z = p; z > 0; z--) {
       athena.putBeeper();
       p--;
       }
          athena.move();
       
       while(athena.nextToABeeper()) {
       athena.pickBeeper();
       p++;
       }
       for(int n = beepers; n > 0; n--) {
       athena.putBeeper();
       beepers--;
       }
       athena.move();
       while(athena.nextToABeeper()) {
       athena.pickBeeper();
       beepers++;
       }
       for(int z = p; z > 0; z--) {
       athena.putBeeper();
       p--;
       }

	 }
 }
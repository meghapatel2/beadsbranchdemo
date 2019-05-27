/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beads;

import java.util.Scanner;

/**
 *
 * @author Megha,2019
 */
public class BeadTester {
    public static void main(String[] args) {
          Beads b1=new Beads("yellow");
         // Scanner in=new Scanner(System.in);
          b1.setColor("white");
         b1.setLetter('a');
          System.out.println(b1.getColor());
          //System.out.println(b1.getColor()+" "+b1.getLetter());;
    }
   
}

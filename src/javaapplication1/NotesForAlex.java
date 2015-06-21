/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1; 

/**
 *
 * @author Cat
 */
public class NotesForAlex {
    
public static void main(String[] args) {

    Lunch aLunch = new Lunch ("carrot", "orange", 10);

    Lunch bLunch = new Lunch ("sandwich", "beige", 30);

    Lunch cLunch = new Lunch ("crisps", "orange", 20);
    
    Lunch dLunch = new Lunch ("cake", "brown", 10); 
}

    private static class Lunch {
        
        String type = "";
        String colour = "";
        int mass = 0;
    
        public Lunch() {
            // something something lunch
            type = this.type;
            colour = this.colour;
            mass = this.mass;
        }
        
        public Lunch(String sType, String sColour, int sMass){
            type = sType;
            colour = sColour;
            mass = sMass;
        }}}
// mass in grams!!!! 
// this is a change
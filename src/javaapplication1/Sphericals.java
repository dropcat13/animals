package javaapplication1;

public class Sphericals {

    public static void main(String[] args) {
        
        // create a ball using the no argument constructor
        Ball aBall = new Ball();
        
        // print to console (the best way to see what's happening when your
        // program runs. i've seen James do this at times!!
        // also an example of how to extract specific info from an object
        // and print the var as part of a String (sentence).
        System.out.println("The colour is " + aBall.colour + ".");
        
        // Example of a line break whilst printing multiple variables. Line
        // lengths should be kept under 80 chars (annoying). 
        System.out.println("The mass is " + aBall.mass + " and the "
            + "type is " + aBall.type + ".");
        
        // Now, see if you can create a ball object of your own specifying
        // your own type, mass and colour. (Hint: line 12 will help you)
        Ball catsBall = new Ball("bouncy", 30, "red");
        System.out.println("The colour is " + catsBall.colour + ".");
        System.out.println("The type is " + catsBall.type + ".");
        System.out.println("The mass is " + catsBall.mass + ".");
        
        Ball secondBall = new Ball("deflated", 50, "mauve");
        System.out.println("The colour is " + secondBall.colour + ".");
        System.out.println("The type is " + secondBall.type + ".");
        System.out.println("The mass is " + secondBall.mass + ".");
        
        Racquet firstRacquet = new Racquet("tennis", "blue", 50, 70);
        System.out.println("The raquet is a " + firstRacquet.type + " racquet.");
        System.out.println("The colour is " + firstRacquet.colour + ".");
        System.out.println("The bounciness is " + firstRacquet.bounciness + "%.");
        System.out.println("The mass is " + firstRacquet.mass + "g.");
    }
    
    private static class Ball {
        
        String type = "";
        String colour = "";
        int mass = 0;
        Boolean inflated = true;
        
        // no argument constructor, anything created using this constructor will
        // ALWAYS have these values.
        public Ball() {
            type = "'no argument'";
            mass = 100;
            colour = "purple";
        }
        
        public Ball(String sType, int sMass, String sColour){
            type = sType;
            mass = sMass;
            colour = sColour;
        }
    }
    
    private static class Racquet {
        
        String type = "";
        String colour = "";
        int bounciness = 0;
        int mass = 0;
        
        public Racquet() {
            type = this.type;
            colour = this.colour;
            bounciness = this.bounciness;
            mass = this.mass;
        }
        
        public Racquet(String sType, String sColour, int sBounciness, int sMass){
            type = sType;
            colour = sColour;
            bounciness = sBounciness;
            mass = sMass;
        }
    }
    }

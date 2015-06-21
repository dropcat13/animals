public class Animals {
    
    public static void main(String args[]) {
        
        Mammal timmytheLion = new Lion();
        System.out.println("It makes a noise -" + timmytheLion.makeNoise + ".");
        System.out.println("It eats -" + timmytheLion.eat + ".");
        System.out.println("It sleeps" + timmytheLion.sleep + ".");
        System.out.println("It roams -" + timmytheLion.roam + ".");
    }

    private static class Lion extends Mammal {

        public Lion() {
        }
    }

class Mammal  {    
    String makeNoise = "yes";
    String eat = "yes";
    String sleep = "yes";
    String roam = "yes";


public Mammal () {
            makeNoise = this.makeNoise;
            eat = this.eat;
            sleep = this.sleep;
            roam = this.roam;
}
               
public Mammal (String sMakeNoise, String sEat, String sSleep, String sRoam){
            makeNoise = sMakeNoise;
            eat = sEat;
            sleep = sSleep;
            roam = sRoam;
}

class Feline extends Animals {
    String roam = "hunts";
} 

class Lion extends feline {
    String makeNoise = "roars";
    String eat = "at night";
}}}


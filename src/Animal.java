public class Animal {
    
    String makeNoise = "";
    String eat = "";
    String sleep = "";
    String roam = "";
    Boolean alive = true;
    
    public Animal(){}

    public class Hippo extends Animal {
        String makeNoise = "bellows";
        String eat = "munches";
        
        public Hippo () {}
        
        public Hippo (String sMakeNoise, String sEat){
            makeNoise = sMakeNoise;
            eat = sEat;
        }
    }
    
    public class Canine extends Animal {
        String roam = "plays";
        
        public Canine () {}
        
        public Canine (String sRoam){
            roam = sRoam;
        }
    }

    public class Feline extends Animal {
        String roam = "hunts";
        
        public Feline(){}
        
        public Feline (String sRoam){
            roam = sRoam;
        }
    } 

    public class Lion extends Feline {
        String makeNoise = "roars";
        String eat = "at night";
        
        public Lion (){}
        
        public Lion(String sMakeNoise, String sEat){
            makeNoise = sMakeNoise;
            eat = sEat;   
        }       
    }
    
    public class Tiger extends Feline {
        String makeNoise = "growls";
        String eat = "antelope";
        
        public Tiger (){}
        
        public Tiger(String sMakeNoise, String sEat){
            makeNoise = sMakeNoise;
            eat = sEat;   
        }
    }
    
    public class Cat extends Feline {
        String makeNoise = "purrs";
        String eat = "cat food";
        
        public Cat (){}
        
        public Cat(String sMakeNoise, String sEat){
            makeNoise = sMakeNoise;
            eat = sEat;   
        }
    }
    
    public class Dog extends Canine {
        String makeNoise = "barks";
        String eat = "dog food";
        
        public Dog (){}
        
        public Dog(String sMakeNoise, String sEat){
            makeNoise = sMakeNoise;
            eat = sEat;   
        }
    }
    
    public class Wolf extends Canine {
        String makeNoise = "growls";
        String eat = "ungulates";
        
        public Wolf (){}
        
        public Wolf(String sMakeNoise, String sEat){
            makeNoise = sMakeNoise;
            eat = sEat;   
        }
        
    }
}

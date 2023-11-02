import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;

public class  Zoo {

    Animal[] animals;
    String name,
            city;
    private final int nbrCages = 25;
private Aquatic[] aquaticAnimals;
    int nbrAnimals;

    public Zoo() {
    }

    public Zoo(String name, String city, int nbrCages) {

        animals = new Animal[nbrCages];

        //PROSIT4
        if (name.isEmpty()){
            System.out.printf("erreur");
        }
        else{
            this.name = name;

        }
        this.aquaticAnimals = new Aquatic[10];
        this.city = city;
    }


    public void addAqaticAnimal(Aquatic aquatic){

        for(int i=0;i<aquaticAnimals.length;i++){
           aquaticAnimals[i]=aquatic;
        }
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (Aquatic aquaticAnimal : aquaticAnimals) {
            if (aquaticAnimal instanceof tn.esprit.gestionzoo.entities.Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimal instanceof tn.esprit.gestionzoo.entities.Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Nombre de dauphins : " + dolphinCount);
        System.out.println("Nombre de pingouins : " + penguinCount);
    }


    void displayZoo() {
        System.out.printf("Name: " + name + ", City: " + city + ", N° Cages/Animals: " + nbrCages);
    }



    boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
            animals[nbrAnimals] = null;
            this.nbrAnimals--;
        }
        return true;
    }

    void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.name == animals[i].name)
                return i;
        }
        return index;
    }







    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages/Animals: " + nbrCages;
    }


//PROSIT 3
    boolean isZooFull() {

        return nbrAnimals >= nbrCages;
    }



    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        } else if (z2.nbrAnimals > z1.nbrAnimals) {
            return z2;
        } else {

            return z1;
        }
    }


       //PROSIT4
       public boolean addAnimal(Animal animal) {
           if (searchAnimal(animal) != -1) {

               return false;
           }

           if (isZooFull()) {
               // Le zoo est plein, retourne false
               return false;
           }

           animals[nbrAnimals] = animal;
           nbrAnimals++;

           return true;
       }

       //prosit 5
    public class aquatic {
           private String habitat;

           public aquatic(String habitat) {

             this.habitat=habitat;
           }

           public String getHabitat(){
               return habitat;
           }

           public void setHabitat(String habitat) {
               this.habitat = habitat;
           }


       }
    public class terrestre {
        private int nbrLegs;

        public terrestre(int nbrLegs) {

            this.nbrLegs = nbrLegs;
        }

        public int getNbrLegs(){
            return nbrLegs;
        }

        public void getNbrLegs(int habitat) {
            this.nbrLegs = nbrLegs;
        }


    }
    public class Dolphin extends aquatic {
        private float swimmingSpeed;

        // Constructeur
        public Dolphin(String habitat, float swimmingSpeed) {
            super(habitat);
            this.swimmingSpeed = swimmingSpeed;
        }

        // Getter et Setter pour swimmingSpeed
        public float getSwimmingSpeed() {
            return swimmingSpeed;
        }

        public void setSwimmingSpeed(float swimmingSpeed) {
            this.swimmingSpeed = swimmingSpeed;
        }
    }

    public class Penguin extends aquatic {
        private float swimmingDepth;

        // Constructeur
        public Penguin(String habitat, float swimmingDepth) {
            super(habitat);
            this.swimmingDepth = swimmingDepth;
        }

        // Getter et Setter pour swimmingDepth
        public float getSwimmingDepth() {
            return swimmingDepth;
        }

        public void setSwimmingDepth(float swimmingDepth) {
            this.swimmingDepth = swimmingDepth;
        }
    }


}

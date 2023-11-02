import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Terrestrial;

public class ZooManagement {

    public static void main(String[] args) {
        //PROSIT 2
        Animal lion = new Animal();
        lion.name = "Simba";
        lion.age = 8;
        lion.family = "Cats";
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "Wildlife Park";
        myZoo.city = "Ariana";
        myZoo.animals = new Animal[20];

        Zoo myZoo1 = new Zoo();
        myZoo.name = "Wildlife Park 2";
        myZoo.city = "mrj";
        myZoo.animals = new Animal[10];




        Animal dog = new Animal("Canine", "Snoopy", 2, true);

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "Snoopy", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

        //PROSIT 3
myZoo.isZooFull();
if (myZoo.isZooFull()){
    System.out.printf("plein");
}else {
    System.out.printf("ajout success");
}



      Zoo zz= Zoo.comparerZoo(myZoo, myZoo1);


//prosit5

        System.out.println("Le zoo avec le plus d'animaux est : " + zz);
        Aquatic aquatic = new Aquatic("Fish", "Sardine", 2, true, "Sea");
        Terrestrial terrestrial = new Terrestrial("Panda", "Narla", 4, true, 2);
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);


        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);



        aquatic.swim();
        dolphin.swim();
        penguin.swim();


//prosit5


        myZoo.addAqaticAnimal(dolphin);

    }


}




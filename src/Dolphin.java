import tn.esprit.gestionzoo.entities.Aquatic;

public abstract class Dolphin extends aquatic {
    private float swimmingSpeed;

    // Constructeur


        public Dolphin() {
        }

        public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
            super(family, name, age, isMammal, habitat);
            this.swimmingSpeed = swimmingSpeed;
        }

        @Override

           public abstract  void swim();
        @Override
        public String toString() {
            return super.toString() + ", swimmingSpeed:" + swimmingSpeed;
        }
    }

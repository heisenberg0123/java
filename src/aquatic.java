import tn.esprit.gestionzoo.entities.Aquatic;

public  class aquatic extends Animal {

    protected String habitat;

    public aquatic() {
    }

    public aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }


    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }






    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        aquatic other = (aquatic) obj;
        return age == other.age && habitat.equals(other.habitat) && name.equals(other.name);
    }
}

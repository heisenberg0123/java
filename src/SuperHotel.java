public class SuperHotel {
    static int[] tab;

    public void reserve() {
        tab[0] = 1;
    }

    public static void main(String[] args) {
        SuperHotel sp = new SuperHotel();

try {
    sp.reserve();
}catch (NullPointerException ex){
        System.out.printf("waa");
    }
}}

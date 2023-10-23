public class AddTable {

    public static void main(String[] args) {
        int[] array = new int[3];
        for (int i=0;i< 4;i++){
            try {


            array[i]= i;

          }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println(array);   }
        }
    }
}

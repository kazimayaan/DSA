public class arrays {
    public static void main(String[] args) {
        // q store a roll no
        int a = 189;
        // store a name
        String name = "kazim";

        // q store 5 roll nos;

        int rolls[]= {1,2,3,4,5};
        // array[] kazim = new arrays();
        int [] rnos = new int[5];
        rnos[1] = 23;
     
        System.out.println(rnos[1]);
        //arrays are mutable'
        // /new keyword/ to create a new object
        System.out.println(rnos[0]);
        for (int i = 0; i < rnos.length; i++) {
            System.out.println(rnos[i]);
        }
        String[] array = new String[5];
        System.out.println(array[1]);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

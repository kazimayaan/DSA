public class scoping {
    public static void main(String[] args) {
        
        {
            //values initialized in the block will remain inside teh block
            //already initialized var cant be initialized again
        }

        //scoping in for
        for (int i = 0; i < 10; i++) {

            System.out.println(i);
            
        }
        int i = 20;
        System.out.println(i);
    }
}

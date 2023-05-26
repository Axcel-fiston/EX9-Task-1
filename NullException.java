public class NullException{
    static Integer generateException(){
        Integer i=null;
        return i;
    }
}
 class ThrowException {
    public static void main(String[] args) {
        try {
           Integer j=NullException.generateException();
           j.toString();
        } catch (NullPointerException e) {
            System.out.println("A NullPointerException has occurred: " + e.getMessage());
            System.out.println("\n"+e);
            System.out.println("\nThe call stack:");
            e.printStackTrace();

        }
    }
}

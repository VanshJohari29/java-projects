public class ExceptionPractice {
    public static void main(String[] args){
        int result1 = 10;
        try {
            int[] arr = new int[3];
            arr[5] = 10;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception found");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of bound exception");
        }
        catch(Exception e){
            System.out.println("Any other excetion");
        }
        finally {
            System.out.println(result1);
        }

    }
}

import java.util.InputMismatchException;
import java.util.Scanner;
public class t5
{
    int n1;
    int n2;
    int result;
    Scanner sc;
    
    public t5() {
        this.sc = new Scanner(System.in);
    }
    
    void calculate() {
        System.out.println("Enter first number");
        try {
            final int n1 = this.sc.nextInt();
            System.out.println("Enter second number");
            final int n2 = this.sc.nextInt();
            this.result = n1 / n2;
        }
        catch (InputMismatchException ime) {
            System.out.println("IME DETECTED");
        }
        catch (ArithmeticException ae) {
            System.out.println("AE Detected");
        }
        catch (Exception e) {
            System.out.println("error occured");
        }
        finally {
            System.out.println(invokedynamic(makeConcatWithConstants:(I)Ljava/lang/String;, this.result));
        }
    }
    
    public static void main(final String[] args) {
        final t5 obj = new t5();
        obj.calculate();
    }
}
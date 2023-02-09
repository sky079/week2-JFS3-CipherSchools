public class t2
{
    int arg;
    
    t1() {
        this.arg = 5;
        System.out.println("Hi! I am a default constructor");
    }
    
    t1(final int arg) {
        this();
        this.arg = arg;
    }
    
    public static void main(final String[] args) {
        final int arg = 10;
        final t1 obj = new t1(10);
        System.out.println(obj.arg);
    }
}
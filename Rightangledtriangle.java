public class Rightangledtriangle{
    public static void r_a_t(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.println(" * " );
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        r_a_t(5);
    }
}
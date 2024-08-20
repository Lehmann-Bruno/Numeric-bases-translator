public class B10toBinary {
    public static void B10toB2(Integer b10) {
        while (b10>=1) {
            System.out.print(b10%2);
            System.out.print(" // ");
            System.out.print(b10);
            System.out.print("/2 = ");
            System.out.println(b10/2);
            b10 = (b10/2);
        }
    }
}

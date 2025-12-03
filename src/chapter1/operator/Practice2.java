package chapter1.operator;

public class Practice2 {

    public static void main(String[] args) {

        int x = 3;
        int y = 5;

        // x가 y보다 큰지
        boolean booleanBox1 = x > y;
        System.out.println("x가 y보다 큰가? " + booleanBox1);

        // x가 y보다 작은지
        boolean booleanBox2 = x < y;
        System.out.println("x가 y보다 작은가? " + booleanBox2);

        // x와 y가 같은지
        boolean booleanBox3 = x == y;
        System.out.println("x와 y가 같은가? " + booleanBox3);

        // x와 y가 다른지
        boolean booleanBox4 = x != y;
        System.out.println("x와 y가 다른가? " + booleanBox4);
    }
}

package chapter1.array;

public class Practice1 {

    public static void main(String[] args) {

        int[] arr = {3, 4, 7, 10, 15, 20};

        System.out.print("짝수: ");
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

package chapter1.array;

public class Main {

    public static void main(String[] args) {
        // 모험가 명단을 관리하는 법
        String name1 = "Soomin";
        String name2 = "Eunsung";
        // ...

        String[] adventurerList = {"Soomin", "Eunsung", "..."};

        // 1. 배열 선언
//        int[] arr;

        // 2. 배열 길이 할당
//        arr = new int[5];
        // arr = [] [] [] [] []

        // 3. 배열 선언과 길이 동시에 할당
//        int arr = new int[5]

        // 4. 배열 선언과 동시에 배열의 요소 할당
//        int[] arr = {10, 20, 30, 40, 50};
        // [10] [20] [30] [40] [50]

        // 배열의 길이
//        int arrLength = arr.length;
//        System.out.println("arrLength = " + arrLength);

        // 문자열 배열 선언
        String[] strArr = new String[2];

        // 논리형 배열 선언
        boolean[] booleanArr = new boolean[3];

        // 배열의 요소에 접근: 인덱스 활용 방법
        int[] arr = {10, 20, 30, 40, 50};
        //           [0] [1] [2] [3] [4]
        System.out.println("1번째 요소 접근 : " + arr[0]);
        System.out.println("2번째 요소 접근 : " + arr[1]);
        System.out.println("3번째 요소 접근 : " + arr[2]);
        System.out.println("4번째 요소 접근 : " + arr[3]);
        System.out.println("5번째 요소 접근 : " + arr[4]);

        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        arr[4] = 500;
        System.out.println("1번째 요소 접근 : " + arr[0]);
        System.out.println("2번째 요소 접근 : " + arr[1]);
        System.out.println("3번째 요소 접근 : " + arr[2]);
        System.out.println("4번째 요소 접근 : " + arr[3]);
        System.out.println("5번째 요소 접근 : " + arr[4]);
        //   0     1     2     3     4
        // [100] [200] [300] [400] [500]
//        System.out.println(arr[5]);

        //배열 탐색
        for (int i = 0; i < arr.length; i++) {
            System.out.println("인덱스: " + i + ", 값: " + arr[i]);
        }

        // 향상된 for문
        for (int a : arr) {
            System.out.println("값: "+ a);
        }

//        boolean[][] board = new boolean[2][4];
        // [] [] [] []
        // [] [] [] []
        boolean[][] board = {
                {true, false},
                {false, true}
        };
        System.out.println(board[0][0]);
        System.out.println(board[0][1]);
    }
}

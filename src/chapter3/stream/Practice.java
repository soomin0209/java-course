package chapter3.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Practice {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5));

        // 1. 익명 클래스 활용
        Predicate<Integer> predicate = new Predicate<Integer>() {

            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };
        List<Integer> ret1 = arrayList.stream()
                .filter(predicate)
                .collect(Collectors.toList());
        System.out.println("ret1 = " + ret1);

        // 2. 람다식 만들기
        Predicate<Integer> predicateLambda = (integer -> integer % 2 == 0);
        List<Integer> ret2 = arrayList.stream()
                .filter(predicateLambda)
                .collect(Collectors.toList());
        System.out.println("ret2 = " + ret2);

        // 3. 직접 람다식 대입
        List<Integer> ret3 = arrayList.stream()
                .filter(integer -> integer % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("ret3 = " + ret3);
    }
}

package chapter3.collection;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // 배열의 한계
        // 선언과 동시에 길이를 설정 필요
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        // 배열의 정적인 특징의 한계
//        numbers[3] = 40;

        // 컬렉션
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        // ArrayList 활용
        ArrayList<String> names = new ArrayList<>();

        // 데이터 추가
        names.add("Spartan");
        names.add("Soomin");
        names.add("Eunsung");
        names.add("1");
        names.add("2");

        // 순서 보장
        System.out.println("names = " + names);

        // 중복 데이터 허용
        names.add("Spartan");
        System.out.println("names = " + names);

        // 데이터 단건 조회
        String name1 = names.get(0);    // 숫자는 인덱스
        System.out.println("name1 = " + name1);

        // 데이터 삭제
        names.remove("1");
        System.out.println("names = " + names);

        // TODO 중복 데이터인 "Spartan"을 삭제하면 어떻게 되는지
        // -> 앞에서부터 검색하기 때문에 0번 인덱스 Spartan만 삭제
        // -> 모두 삭제하려면 while문이나 removeIf 사용
        names.remove("Spartan");
        System.out.println("names = " + names);

        // HashSet 사용 방법
        HashSet<String> uniqueNames = new HashSet<>();

        // 데이터 추가
        uniqueNames.add("Spartan");
        uniqueNames.add("Soomin");
        uniqueNames.add("Eunsung");
        uniqueNames.add("1");
        uniqueNames.add("2");

        // 순서 보장 X
        System.out.println("uniqueNames = " + uniqueNames);
        // get() 활용 불가
//        uniqueNames.get();

        // 중복 데이터 불가
        uniqueNames.add("Spartan");
        System.out.println("uniqueNames = " + uniqueNames);

        // 데이터 제거
        uniqueNames.remove("Spartan");
        System.out.println("uniqueNames = " + uniqueNames);

        // HashMap 활용
        // <키(""), 값(0) -> 저장
        HashMap<String, Integer> memberMap = new HashMap<>();

        // 데이터 추가
        memberMap.put("Spartan", 15);
        memberMap.put("Soomin", 15);
        memberMap.put("Eunsung", 1);
        memberMap.put("Hodu", 2);
        memberMap.put("Zero", 3);

        // 순서 보장 X
        System.out.println("memberMap = " + memberMap);

        // 키 중복 불가 -> 값 덮어쓰기
        memberMap.put("Spartan", 5);
        System.out.println("memberMap = " + memberMap);

        // 단건 조회
        Integer spartanNum = memberMap.get("Spartan");
        System.out.println("spartanNum = " + spartanNum);

        // 데이터 세트 삭제
        memberMap.remove("Spartan");
        System.out.println("memberMap = " + memberMap);
        
        // 키 확인
        Set<String> keySet = memberMap.keySet();
        System.out.println("keySet = " + keySet);

        // 값 확인
        Collection<Integer> values = memberMap.values();
        System.out.println("values = " + values);
    }
}

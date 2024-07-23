package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DictionaryTest {

    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("==단어 입력 단계==");
        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q') : ");
            String eng = sc.nextLine();
            if (eng.equals("q")) {
                break;
            }
            System.out.print("한글 뜻을 입력하세요 (종료는 'q') : ");
            String kr = sc.nextLine();
            if (kr.equals("q")) {
                break;
            }
            dictionary.put(eng, kr);
        }

        System.out.println("==단어 검색 단계==");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q') : ");
            String searchWord = sc.nextLine();
            if(searchWord.equals("q")) {
                break;
            }
            if (dictionary.containsKey(searchWord)) {
                String koreanMeaning = dictionary.get(searchWord);
                System.out.println(searchWord + "의 뜻 : " + koreanMeaning);
//                for (Map.Entry<String, String> entry : dictionary.entrySet()) {
//                    if(searchWord.contains(entry.getKey())) System.out.println(searchWord + "의 뜻 : " + entry.getValue());
//                }
            }else{
                System.out.println(searchWord + "은(는) 사전에 없는 단어입니다.");
            }
        }
    }
}

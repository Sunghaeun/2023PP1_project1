package org.example;



public class WordManager {
    Scanner s = new Scanner(System.in);
    WordCRUD wordCRUD;
    Word word;
    /*
    *** 영단어 마스터 ***
    *********************
    1. 모든 단어 보기
    2. 수준별 단어 보기
    3. 단어 검색
    4. 단어 추가
    5. 단어 수정
    6. 단어 삭제
    7. 파일 저장
    8. 나가기
    *********************
    => 원하는 메뉴는? 4
     */
    WordManager(){

    }
    public int selectMenu(){
        System.out.println("*** 영단어 마스터 ***\n" +
                "    *********************\n" +
                "    1. 모든 단어 보기\n" +
                "    2. 수준별 단어 보기\n" +
                "    3. 단어 검색\n" +
                "    4. 단어 추가\n" +
                "    5. 단어 수정\n" +
                "    6. 단어 삭제\n" +
                "    7. 파일 저장\n" +
                "    8. 나가기\n" +
                "    *********************\n" +
                "    => 원하는 메뉴는? ");
        return s.nextInt();
    }
    public void start(){
        int menu = selectMenu();
    }
}

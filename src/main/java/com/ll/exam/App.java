package com.ll.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public void run() {
        System.out.println("-- 명언 SSG --");

        Scanner sc = new Scanner(System.in);

        // 가장 마지막 글의 명언글 번호
        int lastId = 0;
        ArrayList<WiseSaying> wiseSayings = new ArrayList<>();

        outer:
        while(true){

            System.out.println("-- 명령해주세요. --");
            String str = sc.nextLine().toString();

            switch(str){
                case "등록":
                    System.out.println("명언 : ");
                    String content = sc.nextLine().toString();
                    System.out.println("작가 : ");
                    String author = sc.nextLine().toString();
                    int id = ++lastId;

                    WiseSaying ws = new WiseSaying(id, content, author);
                    wiseSayings.add(ws);
                    System.out.println(id+"번째 명언이 작성되었습니다.");
                    break;

                case "목록":
                    System.out.println("번호 / 명언 / 작가");
                    System.out.println("==================");

                    for (int i = wiseSayings.size() -1; i >= 0; i-- ){
                        WiseSaying ws_ = wiseSayings.get(i);
                        System.out.printf("%d %s %s \n", ws_.number, ws_.content, ws_.author);
                    }
                    break;


                case "삭제":
                    break;

                case "종료":
                    break outer;
            }
        }
    }
}

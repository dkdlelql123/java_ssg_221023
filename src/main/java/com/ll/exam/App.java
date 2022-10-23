package com.ll.exam;

import java.util.Scanner;

public class App {
    public void run() {
        System.out.println("-- 명언 SSG --");

        Scanner sc = new Scanner(System.in);

        // 가장 마지막 글의 명언글 번호
        int lastId = 0;

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
                    System.out.println(id+"번째 명언이 완료되었습니다.");
                    break;

                case "종료":
                    break outer;
            }
        }
    }
}

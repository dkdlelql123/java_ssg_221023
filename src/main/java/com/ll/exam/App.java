package com.ll.exam;

import java.util.Scanner;

public class App {
    public void run() {
        System.out.println("-- 명언 SSG --");


        Scanner sc = new Scanner(System.in);

        outer:
        while(true){

            System.out.println("-- 명령해주세요. --");
            String str = sc.nextLine().toString();

            switch(str){
                case "종료":
                    break outer;
            }
        }
    }
}

package com.lhw.java.board;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== 자바 텍스트 게시판==");
        System.out.println("==프로그램 시작==");

        int articleLastid = 0;

        while (true){
            System.out.printf("명령)");
            String cmd = sc.nextLine();

            if (cmd.equals("/usr/article/write")){
                System.out.println("==게시물 등록==");
                System.out.printf("제목: ");
                String title = sc.nextLine();
                System.out.printf("내용: ");
                String content = sc.nextLine();

                int id = articleLastid + 1;
                articleLastid++;
                System.out.printf("%d번 게시물이 등록 되었습니다.\n", id);

            }


            else if (cmd.equals("exit")){
                System.out.println("프로그램을 종료 합니다.");
                break;
            }
            else
                System.out.println("잘못된 명령어 입니다.");
        }


        sc.close();
        }
    }

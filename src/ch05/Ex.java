package ch05;

import java.util.Scanner;

public class Ex {

   public static void main(String[] args) {
      // 6번
      int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

      System.out.println(array.length); // 3
      System.out.println(array[2].length); // 5

      // 7번
      System.out.println("---------------------");
      int[] array1 = { 1, 5, 3, 8, 2 };
      int maxnumber = 0;
      for (int i = 0; i <= 4; i++) {
         maxnumber = (maxnumber > array1[i]) ? maxnumber : array1[i];
      }
      System.out.println(maxnumber);

      // 8번
      System.out.println("---------------------");
      int total = 0;
      int counter = 0;
      for (int ban = 0; ban <= 2; ban++) {
         for (int jumsu = 0; jumsu < array[ban].length; jumsu++) {
            total += array[ban][jumsu];
            counter++;
         }
      }
      System.out.println(total);
      double avg = (double) total / counter;
      System.out.println(avg);

      // 9번
      System.out.println("---------------------");
      Scanner sc = new Scanner(System.in);

      int student = 0;
      int[] array2 = null;
      int maxnumber0 = 0;
      double total0 = 0;
      while (true) {
         System.out.println("-------------------------------------------");
         System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
         System.out.println("-------------------------------------------");
         System.out.print("선택>");
         int menu = sc.nextInt();

         if (menu == 1) {
            System.out.print("학생수>");
            student = sc.nextInt();
            array2 = new int[student];
         } else if (menu == 2) {
            for (int a = 0; a < array2.length; a++) {
               System.out.print("scores[" + a + "]:");
               array2[a] = sc.nextInt();
            }
         } else if (menu == 3) {
            for (int a = 0; a < array2.length; a++) {
               System.out.println("scores[" + a + "]:" + array2[a]);
            }
         } else if (menu == 4) {
            for (int a = 0; a < array2.length; a++) {
               maxnumber0 = (maxnumber0 > array2[a]) ? maxnumber0 : array2[a];
               total0 += array2[a];
            }
            System.out.println("최고점수:" + maxnumber0);
            System.out.println("평균점수:" + (double) total0 / student);
         } else if (menu == 5) {
            System.out.println("프로그램 종료");
            break;
         } else {
            System.out.println("메뉴를 다시 입력하세요.");
         }
         

      }
      sc.close();
   }

}
package jungol;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      Person[] ar = new Person[2];
      for (int i = 0; i < ar.length; i++) {
         String name = sc.next();
         int kor = sc.nextInt();
         int eng = sc.nextInt();
         ar[i] = new Person(name, kor, eng);
      }
      sc.close();

      for (int i = 0; i < ar.length; i++) {
         ar[i].print();
      }

      int sum_kor = 0, sum_eng = 0;
      for (int i = 0; i < ar.length; i++) {
         sum_kor += ar[i].getKor();
         sum_eng += ar[i].getEng();
      }
      System.out.println("avg " + (sum_kor / ar.length) + " " + (sum_eng / ar.length));
   }
}

class Person {
   private String name;
   private int kor;
   private int eng;

   public Person(String name, int kor, int eng) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
   }

   public void print() {
      System.out.println(name + " " + kor + " " + eng);
   }

   public int getKor() {
      return kor;
   }

   public int getEng() {
      return eng;
   }
}
package com.codestates.seb.Ai_V1;
import java.util.Scanner;

public class Ai_V1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int advertisementCost;
    advertisementCost = Integer.parseInt(sc.nextLine());
    System.out.print("[System] 예측에 영향을 주는 원인(광고비)의 값을 알려주세요 (단위 원) : ");
    // 시스템 프로그램 안내 출력문을 정의합니다.
    int a = 2, b = 1;

    // 수식에 필요한 변수를 먼저 정의하여 줍니다. (※ 수식과 똑같은 변수명으로 정의 )
    // 안내 사항에 나온 것 처럼 임의의 값으로 정의합니다.
    int webVisitorAmount = a * advertisementCost + b;
    // 웹 페이지 방문자 수를 예측하기 위한 수식을 코드로 정의합니다.

    System.out.println(webVisitorAmount);
    // 결과로 나온 값은 printf()를 통해 출력합니다.
  }
}

import java.util.Scanner;

public class Quiz {
    /* 문제. while 문을 사용해서
       1 ~ 100 까지 숫자 중 3 의 배수를 추출하시오.
       (for 문 사용 금지)
     */
    public static void main(String[] args) {
        int i = 1;

        /* for 의 경우
           for(i = 1; i < 101; i++)

           //i = 1; 이라는 초기화는 while 에서 할 수 없다.
           //while 에서는 초기값을 쓸 수 없음, 밖에서 쓰고 들어와야

           while(i++ < 101)
         */

        /*
        while(i++ < 101) {
             if(i)
         */

        while (i++ < 101) {
            if (i % 3 == 0) {
                System.out.println("i = " + i);
            }
        }

        for (i = 1; i++ < 101; ) {
            if (i % 3 == 0) {
                System.out.println("i = " + i);

            }
        }

        i = 1;
        while (i < 101) {
            if (i % 3 == 0) {
                System.out.println("i = " + i);
            }
            i++;
        }
    }
}

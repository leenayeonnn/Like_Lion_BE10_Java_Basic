public class WhileEx {
    public static void main(String[] args) {
        // while(조건문) {실행문}
        // 조건이 참일 동안 실행문 반복
        // 실행문 내 조건문 변경에 대한 내용 존재해야함
        // 무한루프 가능성 있음

        int i = 1; // 지역변수
        while (i <= 10) {
            System.out.println("****************");
            i = i + 1;
        }

        int a = 0;
        while (a < 5) {
            int b = 0;
            while (b <= a) {
                System.out.print("*");
                b++;
            }
            System.out.println();
            a++;
        }

        int x = 1;
        while (x <= 100){
            System.out.println(x);
            x++;
        }
    }
}

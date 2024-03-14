public class Operate {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;
        System.out.println(maxInt);

        char c = 'a';
        System.out.println((int) c);
        char c2 = (char) 97;
        System.out.println((c2));

        // 조건식? 값1 : 값2;
        int a = 10;
        int b = 20;

        int result = a > b ? a : b;
        System.out.println(result);

        Book book = new Book();
        if(book instanceof Object){
            System.out.println("Book은 객체임");
        }
    }
}

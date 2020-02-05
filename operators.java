public class operators {
    public static void main(String[] args){
        String myString = "Hello" + "World!";
        // System.out.println("Hello, I'm " + 27 + ".");  // 문자열과 숫자를 더하게되면 숫자를 문자열로 인식하여 합쳐준다.
        System.out.println("숫자 연산자");
        int a = 9;
        double b = 5;  // 하나를 소수형으로 변환해주면 더 상세한 단위는 소수단위를 기준으로 결과값이 나옴

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));  // 자바에서 정수나누기 정수는 정수로 나오기 때문에 1로 나옴
        System.out.println(a + " % " + b + " = " + (a % b));

        System.out.println("비교 연산자");
        System.out.println(3 + " > " + 2 + " = " + (3 > 2));
        System.out.println(3 + " < " + 2 + " = " + (3 < 2));
        System.out.println(3 + " >= " + 2 + " = " + (3 >= 2));
        System.out.println(3 + " <= " + 2 + " = " + (3 <= 2));
        System.out.println(3 + " == " + 2 + " = " + (3 == 2));
        System.out.println(3 + " != " + 2 + " = " + (3 != 2));

        System.out.println("불린 연산자 - and");
        System.out.println("true && true : " + (true && true));
        System.out.println("true && false : " + (true && false));
        System.out.println("false && true : " + (false && true));
        System.out.println("false && false : " + (false && false));

        System.out.println("불린 연산자 - or");
        System.out.println("true || true : " + (true || true));
        System.out.println("true || false : " + (true || false));
        System.out.println("false || true : " + (false || true));
        System.out.println("false || false : " + (false || false));

        System.out.println("불린 연산자 - not");
        System.out.println("!true : " + !true);
        System.out.println("!false : " + !false);

    }
}

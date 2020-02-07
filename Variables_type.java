public class Variables_type {
    public static void main(String[] args){
        boolean myBoolean = true;
        myBoolean = false;

        int myInt = 23;

        //myInt = 123541243134; // int가 저장할 수 있는 값의 범위는 -2의31승 혹은 2의 31승 +- 약 21억까지 저장이 가능하다.
        long myLong = 123541243134L; // long이라는 형 이름을 지정하여 myLong 변수 안에 큰 수를 넣되 끝에 L 을 추가하여 긴 정수임을 알려줘야

        double myDouble = 3.14;

        String myString = "codeIt!!"; // java에서 string은 기본자료형이 아니다.

        System.out.println("Hello!");
        String hello = "Hello, I'm ";  //  이제 아래에 String 을 어떻게 사용하는지 예시를 꺼내보겠다.
        String dot = ".";

        System.out.print(hello);
        System.out.print(27);
        System.out.println(dot);

    }
}


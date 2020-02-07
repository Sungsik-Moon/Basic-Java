public class Variables {
    public static void main(String[] args){
        int age;  // age라는 이름의 정수를
        age = 27;

        int num = 21;  // 변수와 값의 선언을 같이 할 수도 있다.
        age = 26;

        // age = 26.5;  // age에 소수를 넣으면 오류가 나온다(하단 빨간 줄)
        age = age + 1;
        System.out.print("Hello, I'm ");
        System.out.print(age);
        //System.out.println(age); // ln 메소드를 계속 사용하면 줄을 계속 넘겨 어색하므로 그냥 print한다.
        System.out.println(".");
    }
}

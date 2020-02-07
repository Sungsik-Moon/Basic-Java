public class while_prac {
    public static void main(String[] agrs) {
        int num = 10000;
        int key = 153;

        int i = 1;

//        while(key * i < num){     // 153부터 배수를 하나씩 올려가며 찾는 방식
//            i ++;
//        }
//        System.out.println((i-1) * 153);
        while (num % key > 0){   // 더 효율적인 방법이다. 계산하는 수가 줄어들기 때문.
                                 // 하지만 항상 효율성을 고려할 수 있는지는 미지수
            num = num - i;       // 10000에서 1씩 내려가면서 153의 배수인지 검토
            i ++;
        }
        System.out.println(num);
    }
}

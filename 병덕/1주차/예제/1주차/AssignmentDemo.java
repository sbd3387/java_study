package 예제;

public class AssignmentDemo {
    public static void main(String [] args){
        int value = 1;
        value += 1;
        System.out.println("값 =" + value);
        value -= 1;
        System.out.println("값 = " +value);
        value <<= 3; // vlaue의 처음 값은 1이고, << 3 연산을 수행하면 2를 세 번 곱하므로 결과는 8이다
        System.out.println("값 = " +value);
        value %= 3;
        System.out.println("값 = " +value);

    }
}

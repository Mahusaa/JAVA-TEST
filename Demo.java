class Calculator{
    public int sum(int a, int b){
        return a + b;
    }
}


public class Demo {
    public static void main(String a[]){
        Calculator calc = new Calculator();

        int result = calc.sum(9, 10);
        System.out.println(result);
    }

}

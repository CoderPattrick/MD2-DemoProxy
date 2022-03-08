public class Main {
    public static void main(String[] args) {
        CalculatorProxy proxy = new CalculatorProxy();
        double result = proxy.add(1,2);
        System.out.println("1+2="+result);
        result = proxy.add(1,Double.MAX_VALUE);
    }
}

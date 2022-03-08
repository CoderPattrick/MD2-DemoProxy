public class CalculatorProxy implements iCalculator{
    private Calculator calculator;

    public CalculatorProxy() {
        calculator = new Calculator();
    }
    @Override
    public double add(double a, double b) {
        if(a/2+b/2 >= Double.MAX_VALUE/2){
            throw new RuntimeException("Out of range!");
        }
        if(a/2+b/2 <= Double.MIN_VALUE/2){
            throw new RuntimeException("Out of range!");
        }
        return calculator.add(a,b);
    }

    @Override
    public double sub(double a, double b) {
        if(a/2-b/2 >= Double.MAX_VALUE/2){
            throw new RuntimeException("Out of range!");
        }
        if(a/2-b/2 <= Double.MIN_VALUE/2){
            throw new RuntimeException("Out of range!");
        }
        return calculator.sub(a,b);
    }

    @Override
    public double mul(double a, double b) {
        double result = calculator.mul(a,b);
        if(a != 0 && result / a != b){
            throw new RuntimeException("Out of range");
        }
        return result;
    }

    @Override
    public double div(double a, double b) {
        if(b == 0){
            throw new RuntimeException("Can't divide by zero");
        }
        return calculator.div(a,b);
    }
}

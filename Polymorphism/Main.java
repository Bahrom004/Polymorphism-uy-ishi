
public class Main {
    public static void main(String[] args) {
        MathFunction math = new MathFunction();
        //ADDING
        System.out.println("Int: "+math.add(5,3));
        System.out.println("Double: "+math.add(5.5, 4.5));
        System.out.println("Float: "+math.add(5.5f, 6.5f));
        System.out.println("Long: "+math.add(90000000000L, 10000000000L));
        //MINUS
        System.out.println("Int: "+math.sub(10, 11));
        System.out.println("Double: "+math.sub(4.9, 4.89));
        System.out.println("Float: "+math.sub(6.5f, 6.0f));
        System.out.println("Long: "+math.sub(1000000000000L, 9999999999999L));
        //MULTIPLY
        System.out.println("Int: "+math.multiply(5, 5));
        System.out.println("Double: "+math.multiply(5.5, 6.5));
        System.out.println("Float: "+math.multiply(3.5f, 4.5f));
        System.out.println("Long: "+math.multiply(95175352L, 98425862852L));
        //DIVIDING
        System.out.println("Int: "+math.div(15,5));
        System.out.println("Double: "+math.div(5.0, 2.5));
        System.out.println("Float: "+math.div(6.0f,3.5f));
        System.out.println("Long: +"+math.div(9845623215L,98756325695L));
        //ABS
        System.out.println("Abs: " + math.abs(-5));
        System.out.println("Abs: " + math.abs(-5.5));
        System.out.println("Abs: " + math.abs(-5.5f));
        System.out.println("Abs: " + math.abs(-5000000000L));
        //POW
        System.out.println("Pow: " + math.pow(2, 3));
        System.out.println("Pow: " + math.pow(2.0, 3.0));
        System.out.println("Pow: " + math.pow(2.0f, 3.0f));
        System.out.println("Pow: " + math.pow(2L, 3L));


    }
}
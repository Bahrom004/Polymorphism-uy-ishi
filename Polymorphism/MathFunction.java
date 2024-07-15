public class MathFunction {


    //ADD
    public  int add(int a, int b){
        return a+b;
    }

    public double add(double a, double b){
        return a+b;
    }

    public float add(float a, float  b){
        return a+b;
    }

    public long add(long a, long b){
        return a+b;
    }

    //SUB

    public int sub(int a, int b){
        return a-b;
    }

    public double sub(double a, double b){
        return a-b;
    }

    public float sub(float a, float b){
        return a-b;
    }

    public long sub(long a, long b){
        return a-b;
    }

    //MULTIPLY

    public int multiply(int a, int b){
        return a*b;
    }

    public double multiply(double a, double b){
        return a*b;
    }

    public float multiply(float a, float b){
        return a*b;
    }

    public long multiply(long a, long b){
        return a*b;
    }

    //DIV

    public int div(int a, int b){
        if (b==0){
            System.out.println("You can't divide by zero!!!");
        }else {
            return a/b;
        }
        return a/b;
    }

    public double div(double a, double b){
        if (b==0){
            System.out.println("You can't divide by zero!!!");
        }else{
            return a/b;
        }
        return a/b;
    }
    public float div( float a, float b){
        if (b==0){
            System.out.println("You can't divide by zero!!!");
        }else {
            return a/b;
        }
        return a/b;
    }
    public long div(long a, long b){
        if (b==0){
            System.out.println("You can't divide by zero!!!");
        }else {
            return a/b;
        }
        return a/b;
    }

    //ABS
    public int abs(int a){
        return Math.abs(a);
    }
    public double abs(double a){
        return Math.abs(a);
    }
    public float abs(float a){
        return Math.abs(a);
    }
    public long abs(long a){
        return Math.abs(a);
    }

    //Pow

    public int pow(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public double pow(double a, double b) {
        return Math.pow(a, b);
    }

    public float pow(float a, float b) {
        return (float) Math.pow(a, b);
    }

    public long pow(long a, long b) {
        return (long) Math.pow(a, b);
    }

}


















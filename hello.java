class hello{
     public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(calFact(5));
    }
    public static int calFact(int n){
        if (n==1) return 1;
        else{
            return n*calFact(n-1);
        }
    }
}
class Fibonacci{
    //some text
    //will be added here
}
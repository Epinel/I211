public class MyInteger{
    //data field
    private int value;

    //constructor
    public MyInteger(int value) {
        this.value=value;
    }
    //getter method
    public int getValue(){
        return value;
    }

    //instance methods ()
    public boolean isEven() {
        return value%2==0;
    }

    public boolean isOdd() {
        return value%2 !=0;
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    //static methods (int)

    public static boolean isEven(int value) {
        return value%2==0;
    }

    public static boolean isOdd(int value) {
        return value%2 !=0;
    }

    public static boolean isPrime(int value){
        if (value<=1){
            return false;
        }
        for (int i=2; i<=Math.sqrt(value);i++){
            if (value%i==0){
                return false;
            }
        }
        return true;
    }

    //static methods (MyInteger)
    public static boolean isEven(MyInteger myInt){
        return myInt.value%2==0;
    }

    public static boolean isOdd(MyInteger myInt){
        return myInt.value%2 !=0;
    }

    public static boolean isPrime(MyInteger myInt){
        return isPrime(myInt.value);
    }

    //equals methods

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger myInt){
        return this.value == myInt.value;
    }

    //parseInt
    public static int parseInt(char[] chars){
        int result=0;
        for (int i=0; i<chars.length; i++){
            result = result*10+(chars[i]-'0');
        }
        return result;
    }

    public static int parseInt(String str){
        int result = 0;
        for (int i=0; i<str.length(); i++){
            result = result*10+(str.charAt(i)-'0');
        }
        return result;
    }
}

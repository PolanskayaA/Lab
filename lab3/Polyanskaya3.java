class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return isEven(value);
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    public boolean equals(int num) {
        return this.value == num;
    }

    public boolean equals(MyInteger other) {
        return this.value == other.value;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static boolean isEven(MyInteger obj) {
        return isEven(obj.value);
    }
    public static boolean isOdd(MyInteger obj) {
        return isOdd(obj.value);
    }
    public static boolean isPrime(MyInteger obj) {
        return isPrime(obj.value);
    }
    public static int parseInt(char[] charArray) {
        return Integer.parseInt(new String(charArray));
    }
    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }
    public static void main(String[] args) {
        MyInteger num1 = new MyInteger(7);
        MyInteger num2 = new MyInteger(10);
        System.out.println("num1 is even: " + num1.isEven());
        System.out.println("num1 is odd: " + num1.isOdd());
        System.out.println("num1 is prime: " + num1.isPrime());
        System.out.println("num2 is even: " + MyInteger.isEven(num2));
        System.out.println("num2 is odd: " + MyInteger.isOdd(num2));
        System.out.println("num2 is prime: " + MyInteger.isPrime(num2));
        System.out.println("num1 equals 7: " + num1.equals(7));
        System.out.println("num1 equals num2: " + num1.equals(num2));
        char[] digits = {'1', '2', '3'};
        System.out.println("Parsed char array: " + MyInteger.parseInt(digits));
        System.out.println("Parsed string: " + MyInteger.parseInt("456"));
    }
}


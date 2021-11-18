public class HelloWorld {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        System.out.println(num2);
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
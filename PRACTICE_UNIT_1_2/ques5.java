public class ques5 {
    public static int staticVar1 = 10;
    public static String staticVar2 = "Static Variable";
    public static int staticVar3;

    static {
        System.out.println("Static block initialized.");
        staticVar3 = staticVar1 * 2;
    }

    public static void staticMethod() {
        System.out.println("Inside static method.");
        System.out.println("staticVar1: " + staticVar1);
        System.out.println("staticVar2: " + staticVar2);
        System.out.println("staticVar3: " + staticVar3);
    }

    public static void main(String[] args) {
        System.out.println("Inside main method.");
        System.out.println("staticVar1: " + staticVar1);
        System.out.println("staticVar2: " + staticVar2);
        System.out.println("staticVar3: " + staticVar3);

        staticMethod();
    }
}

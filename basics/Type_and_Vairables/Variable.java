class Variable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20 + a;
        System.out.println(b);
        boolean flag;
        flag = true;
        System.out.println(flag);
        char ch = 'A';
        System.out.println(ch + "B");
        System.out.println(ch + 'B');

        String str = "Hello";
        System.out.println(str + " World" + 'A');

        // float f1 = 10.5 -> Type mismatch: cannot convert from double to float
        // Java(16777233)

        float f1 = 10.5f, f2 = 20.5f;
        double d1 = 10.5, d2 = 20.5d;

        // final: cannot be changed
        final int START_INT = 1;
        final int END_INT = 10;

        System.out.println("Max int: " + Integer.MAX_VALUE);
        System.out.println("Min byte: " + Byte.MIN_VALUE);
        System.out.println("Double byte: " + Double.MIN_VALUE);

    }
}

public class WrapperD {
    public static void main(String[] args) {
        int num = 2;
        // Integer num1 = new Integer(4);
        // System.out.println(num1);
        // 1. you can directly assign
        Integer num1 = 4;
        System.out.println(num1);
        // 2. Aoutoboxing , converting primitive type to its corresponding wrapper class object automatically
        Integer num2 = num; // this is boxing "Integer num2 = Integer.valueof(num)" manualy
        System.out.println("Aoutoboxing "+num2);
        // 3. AoutoUnboxing, Converting wrapper object to primitive type aoutomatically
        int num3 = num1; // this is unboxing, "int num = num1.intValue()" manually
         System.out.println("AutoUnboxing "+num3);
        // 4. String to int;
        String str ="13";
        int get = Integer.parseInt(str);
        System.out.println("Stirng to int "+get);
    }
}

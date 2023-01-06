package Scope;

public class Main {
    public static void main(String[] args) {
        Scope_check scope_check = new Scope_check();
        scope_check.multiply_by_2();

        Scope_check.Inner_class inner_class = scope_check.new Inner_class();
        inner_class.multiply_by_2();
        System.out.println("Inner class's private_int2 = " + inner_class.getPrivate_int2());
    }
}
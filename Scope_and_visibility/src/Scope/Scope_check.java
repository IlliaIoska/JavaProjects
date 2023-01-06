package Scope;

public class Scope_check {
    public int public_int = 0;
    private int private_int1 = 1;

    public Scope_check() {
        System.out.println("The scope check has been created");
    }

    public int getPrivate_int1() {
        return private_int1;
    }

    public void multiply_by_2() {
        int private_int = 2;
        System.out.println("2 * 2 = " + (private_int * 2));
    }

    public class Inner_class {
        private int private_int2 = 3;

        public Inner_class() {
            System.out.println("Public class has been created");
        }

        public int getPrivate_int2() {
            return private_int2;
        }

        public void multiply_by_2() {
            Scope_check.this.multiply_by_2();
//            int private_int_from_outer_class = Scope_check.this.private_int1;
//            int private_int = 2; variable from the method scope
            System.out.println("2 * 2 = " + (private_int2 * 2));
        }
    }
}

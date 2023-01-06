public class Static_initialization_block {
    public static final String owner;

    static { // called before constructor
        owner = "John";
        System.out.println("The SID block is called");
    }

    public Static_initialization_block() {
        System.out.println("The constructor is called");
    }

    static { // called before constructor
        System.out.println("Second SIB");
    }

    public void method() {
        System.out.println("The method was called");
    }
}

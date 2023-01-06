public class Password {
    private static final int encryption_key = 789;
    private final int encrypted_password;

    public Password(int password) {
        this.encrypted_password = encrypt(password);
    }

    public final int getEncrypted_password() {
        return encrypted_password;
    }

    private int encrypt(int password) {
        return password ^ encryption_key;
    }

    public boolean is_pass_valid(int password) {
        if(encrypt(password) == this.encrypted_password) {
            System.out.println("Valid passord");
            return true;
        } else {
            System.out.println("Invalid password");
            return false;
        }
    }
}

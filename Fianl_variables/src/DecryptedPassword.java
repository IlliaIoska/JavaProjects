public class DecryptedPassword extends Password {
    private final int decrypted_password;

    public DecryptedPassword(int password, int decrypted_password) {
        super(password);
        this.decrypted_password = decrypted_password;
    }

    @Override
    public int getEncrypted_password() { // The base's class method is "final"
        return super.getEncrypted_password();
    }
}

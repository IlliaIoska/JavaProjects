public class Baseball_player extends Player {
    public Baseball_player(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void routine() {
        System.out.println("Playing baseball");
    }
}

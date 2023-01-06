import java.util.Enumeration;
import java.util.Hashtable;

public class Hamburger {private Hamburger[] burger_list = new Hamburger[0];
    private final Hashtable<String, String> ITEM_PRICE = new Hashtable<>();
    private final String[] bread_rolls = new String[]{"rye", "barley"};
    private final String[] meat_types = new String[]{"pork", "lamb", "chicken", "beef"};
    private final  String[] additions = new String[]{"tomato", "carrot", "lettuce", "jambo"};
    private String bread_roll_type;
    private final String BURGER_NAME;
    private String meat_type;
    private String addition;

    public Hamburger(String bread_roll_type, String burger_name, String meat_type, String addition) {
        ITEM_PRICE.put("rye", "100");
        ITEM_PRICE.put("barley", "200");
        ITEM_PRICE.put("pork", "10");
        ITEM_PRICE.put("lamb", "20");
        ITEM_PRICE.put("beef", "30");
        ITEM_PRICE.put("tomato", "10");
        ITEM_PRICE.put("carrot", "20");
        ITEM_PRICE.put("lettuce", "30");
        ITEM_PRICE.put("jambo", "40");

        for (int i = 0; i < bread_rolls.length; i++) {
            if (bread_roll_type.equals(bread_rolls[i])) {
                this.bread_roll_type = bread_roll_type;
            }
        }

        for (int i = 0; i < meat_types.length; i++) {
            if (meat_type.equals(meat_types[i])) {
                this.meat_type = meat_type;
            }
        }

        for (int i = 0; i < additions.length; i++) {
            if (addition.equals(additions[i])) {
                this.addition = addition;
            }
        }

        this.BURGER_NAME = burger_name;
    }
    public String getBread_roll_type() {
        return bread_roll_type;
    }

    public String getBURGER_NAME() {
        return BURGER_NAME;
    }

    public String getMeat_type() {
        return meat_type;
    }

    public String getAddition() {
        return addition;
    }

    public Hashtable<String, String> getITEM_PRICE() {
        return ITEM_PRICE;
    }

    public String[] getBread_rolls() {
        return bread_rolls;
    }

    public String[] getMeat_types() {
        return meat_types;
    }

    public String[] getAdditions() {
        return additions;
    }

    public int calc_price() {
        int bread_roll_price = Integer.parseInt(ITEM_PRICE.get(getBread_roll_type()));
        int meat_price = Integer.parseInt(ITEM_PRICE.get(getMeat_type()));
        int addition_price = Integer.parseInt(ITEM_PRICE.get(getAddition()));
        int price = bread_roll_price + meat_price + addition_price;
        System.out.println(getBURGER_NAME() + " costs " + price);
        return price;
    }

    public Hashtable<String, String> add_ITEM_PRICE(String item, String price) {
        Enumeration ingredients= getITEM_PRICE().keys();

        while (ingredients.hasMoreElements()) {
            if (item.equals(ingredients.nextElement())) {
                System.out.println("Ingredient already exists");
            } else {
                this.ITEM_PRICE.put(item, price);
            }
        }
        return this.ITEM_PRICE;
    }
    public Hamburger[] add_burger_to_a_list(Hamburger burger_to_add) {
        int burger_list_length = 0;
        if (existing_list.length == 0) {
            burger_list_length = 1;
        } else {
            burger_list_length = burger_list.length;
        }
        Hamburger[] updated_burger_list = new Hamburger[burger_list_length];

        for (int i = 0; i < updated_burger_list.length; i++) {
            updated_burger_list[i] = burger_to_add;
        }
        return updated_burger_list;
    }
}

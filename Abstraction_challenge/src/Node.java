import java.lang.String;

public class Node extends List_item {

    public Node(Object list_item_value) {
        super(list_item_value);
    }

    @Override
    List_item get_next_item() {
        return this.next_item;
    }

    @Override
    List_item get_previous_item() {
        return this.previous_item;
    }

    @Override
    List_item setNext_item(List_item list_item) {
        this.next_item = list_item;
        return this.next_item;
    }

    @Override
    List_item setPrevious_item(List_item list_item) {
        this.previous_item = list_item;
        return this.previous_item;
    }

    @Override
    int compare_to(List_item list_item) {
        if (list_item != null) {
            return ((String) super.getList_item_value()).compareTo(((String) list_item.getList_item_value()));
        } else {
            return -1;
        }
    }
}

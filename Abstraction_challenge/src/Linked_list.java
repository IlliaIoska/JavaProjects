public class Linked_list implements Node_list {
    private List_item root_node;

    public Linked_list(List_item root_node) {
        this.root_node = root_node;
    }

    @Override
    public List_item get_root_node() {
        return this.root_node;
    }

    @Override
    public List_item add_list_item(List_item list_item) {
        if (this.root_node == null) {
            this.root_node = list_item;
            return this.root_node;
        }
        List_item current_list_item = this.root_node;
        while (current_list_item != null) {
            int comparison = current_list_item.compare_to(list_item);
            if (comparison < 0) {
                if (current_list_item.get_next_item() != null) {
                    current_list_item = current_list_item.get_next_item();
                } else {
                    current_list_item.setNext_item(list_item).setPrevious_item(current_list_item);
                    return current_list_item.get_next_item();
                }
            } else if (comparison > 0) {
                if (current_list_item.get_previous_item() != null) {
                    current_list_item.get_previous_item().setNext_item(list_item).setPrevious_item(current_list_item.get_previous_item());
                    list_item.setNext_item(current_list_item).setPrevious_item(list_item);
                } else {
                    this.root_node.setPrevious_item(list_item).setNext_item(this.root_node);
                    this.root_node = list_item;
                }
                return this.root_node.get_previous_item();
            } else {
                System.out.println(list_item.getList_item_value() + " is already present in the list");
                return null;
            }
        }
        return null;
    }

    @Override
    public List_item remove_list_item(List_item list_item) {
        if (list_item != null) {
            System.out.println("Deleting item = " + list_item.getList_item_value());
        }

        List_item current_item = this.root_node;
        while (current_item != null) {
            int comparison = current_item.compare_to(list_item);
            if (comparison == 0) {
                System.out.println("Found the item");
                if (current_item == this.root_node) {
                    this.root_node = current_item.get_next_item();
                } else {
                    current_item.get_previous_item().setNext_item(current_item.get_next_item());
                    if (current_item.get_next_item() != null) {
                        current_item.get_next_item().setPrevious_item(current_item.get_previous_item());
                    }
                }
                return current_item;
            } else if (comparison < 0) {
                current_item = current_item.get_next_item();
            } else {
                System.out.println("The item cannot be found");
                return null;
            }
        }
        return null;
    }

    @Override
    public void traverse_list(List_item root_node) {
        if (root_node == null) {
            System.out.println("The root is null");
        } else {
            while (root_node != null) {
                System.out.println("Root's value = " + root_node.getList_item_value());
                root_node = root_node.get_next_item();
            }
        }
    }
}

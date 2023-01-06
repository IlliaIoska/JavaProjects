public class Search_tree implements Node_list{
    private List_item root = null;

    public Search_tree(List_item root) {
        this.root = root;
    }

    @Override
    public List_item get_root_node() {
        return this.root;
    }

    @Override
    public List_item add_list_item(List_item list_item) {
        return list_item;
    }

    @Override
    public List_item remove_list_item(List_item list_item) {
        return null;
    }

    @Override
    public void traverse_list(List_item root_node) {
        if (root_node != null) {
            traverse_list(root_node.get_previous_item());
            System.out.println(root_node.getList_item_value());
            traverse_list(root_node.get_next_item());
        }
    }
}

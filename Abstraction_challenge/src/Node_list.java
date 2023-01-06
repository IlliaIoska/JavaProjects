public interface Node_list {
    List_item get_root_node();
    List_item add_list_item(List_item list_item);
    List_item remove_list_item(List_item list_item);
    void traverse_list(List_item root_node);
}

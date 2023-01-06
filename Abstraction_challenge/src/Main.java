public class Main {
    public static void main(String[] args) {
        Search_tree search_tree = new Search_tree(null);
        search_tree.traverse_list(search_tree.get_root_node());



        String string_data = "5 7 3 9 8 2 1 0 4 6";
        String[] string_data_array = string_data.split(" ");
        for (String s : string_data_array) {
            search_tree.add_list_item(new Node(s));
        }

        search_tree.traverse_list(search_tree.get_root_node());
//        search_tree.remove_list_item(new Node("3"));
//        search_tree.traverse_list(search_tree.get_root_node());
//        search_tree.remove_list_item(new Node("0"));
//        search_tree.traverse_list(search_tree.get_root_node());
    }
}
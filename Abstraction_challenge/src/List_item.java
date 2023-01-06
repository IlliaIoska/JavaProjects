public abstract class List_item {
    protected List_item next_item = null;
    protected List_item previous_item = null;
    protected Object list_item_value;

    public List_item(Object list_item_value) {
        this.list_item_value = list_item_value;
    }

    public Object getList_item_value() {
        return list_item_value;
    }

    public void setList_item_value(Object list_item_value) {
        this.list_item_value = list_item_value;
    }

    abstract List_item get_next_item();
    abstract List_item get_previous_item();
    abstract List_item setNext_item(List_item list_item);
    abstract List_item setPrevious_item(List_item list_item);
    abstract int compare_to(List_item list_item);

}

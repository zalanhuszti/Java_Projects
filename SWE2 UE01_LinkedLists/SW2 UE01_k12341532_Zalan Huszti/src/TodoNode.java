public class TodoNode {
    Todo todo;
    TodoNode next;

    public TodoNode(Todo todo) {
        this.todo = todo;
        this.next = null;
    }
}
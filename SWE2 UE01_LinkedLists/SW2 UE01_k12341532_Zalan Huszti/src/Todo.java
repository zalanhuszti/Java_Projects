import java.time.LocalDate;

public class Todo {

    private static int idCounter = 0;
    private final int id;
    private String description;
    private LocalDate dueDate;
    private Status status;

    public Todo(String description, LocalDate dueDate) {
        this.id = idCounter++;
        this.description = description;
        this.dueDate = dueDate;
        this.status = Status.OPEN;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public Status getStatus() {
        return status;
    }
    public void complete() {
        this.status = Status.DONE;
    }

    @Override
    public String toString() {
        return String.format("%d: %s - %s : %s", id, dueDate, description, status);
    }
}


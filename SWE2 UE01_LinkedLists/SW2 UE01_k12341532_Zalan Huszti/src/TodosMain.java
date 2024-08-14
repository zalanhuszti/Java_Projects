import java.time.LocalDate;

public class TodosMain {

    public static void main(String[] args) {
        TodoManager todoManager = new TodoManager();

        In.open("todos.txt");
        if (!In.done()) {
            Out.println("Cannot open file todos.txt");
            return;
        }

        int year = In.readInt();
        while (In.done()) {
            int month = In.readInt();
            int day = In.readInt();
            String descr = In.readString();


            year = In.readInt();
        }

        In.close();

       /* 2020 03 08 "Program SW2 assignment 1"
        2020 03 09 "Attend SW2 class"
        2020 03 02 "Attend SW2 class"
        2020 03 10 "Study inheritance in Java"
        2020 03 03 "Study packages in Java"
        2020 03 09 "Attend SW2 lecture"
        2020 03 14 "Program SW2 assignment 2"
        2020 03 09 "Submit SW2 assignment 1"*/

        LocalDate march8 = LocalDate.of(2020, 3, 8);
        LocalDate march9 = LocalDate.of(2020, 3, 9);
        LocalDate march2 = LocalDate.of(2020, 3, 2);
        LocalDate march10 = LocalDate.of(2020, 3, 10);
        LocalDate march3 = LocalDate.of(2020, 3, 3);
        LocalDate march14 = LocalDate.of(2020, 3, 14);

        todoManager.addTodo("Program SW2 assignment 1", march8);
        todoManager.addTodo("Attend SW2 class", march9);
        todoManager.addTodo("Attend SW2 class", march2);
        todoManager.addTodo("Study inheritance in Java", march10);
        todoManager.addTodo("Study packages in Java", march3);
        todoManager.addTodo("Attend SW2 lecture", march9);
        todoManager.addTodo("Program SW2 assignment 2", march14);
        todoManager.addTodo("Submit SW2 assignment 1", march9);


        Out.println();
        Out.println("All Todos:");
        Out.println("===========");
        //int size = todoManager.countTodos(null, null);
        //System.out.println(size);
        /*Todo[] todos = new Todo[size];
        todos = todoManager.getAllTodos();
        Out.println(todos);*/

        Out.println();
        Out.println("Until March 9:");
        Out.println("==============");
        int size = todoManager.countTodos(march9, null);
        Todo[] todos = new Todo[size];
        todos = todoManager.getTodosUntil(march9);
        Out.println(todos);


        // TODO: complete some todos

        Out.println();
        Out.println("Done:");
        Out.println("===========");
        // TODO get and print todos which are done

        Out.println();
        Out.println("Still open:");
        Out.println("===========");
        // TODO get and print todos which are still done

        Out.println();
        Out.println("Still open until Until March 9:");
        Out.println("===============================");
        // TODO get and print todos which are still open until March 9

    }

}



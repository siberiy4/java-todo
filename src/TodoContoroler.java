import java.util.ArrayList;
import java.util.Scanner;

public class TodoContoroler {
    static ArrayList<Todo> todos = new ArrayList<>();

    private TodoContoroler() {
    }

    public static void createTodo() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println();
            try {

                System.out.print("Todoを入力してください: ");
                String title = scan.nextLine();
                System.out.print("備考があれば入力してください: ");
                String note = scan.nextLine();

                Todo tmp = new Todo(title, note);

                System.out.print("開始日時があれば入力してください: ");
                String start = scan.nextLine();

                tmp.setStartline(start);

                System.out.print("期限があれば入力してください: ");
                String dead = scan.nextLine();
                tmp.setDeadline(dead);

                System.out.println("入力完了です");

                todos.add(tmp);
                break;

            } catch (Exception e) {
                System.out.println();
                System.err.println("入力に失敗しました。再入力してください");
                continue;
            }

        }
        scan.close();
    }

    public static void printAllTodo() {
        if (todos.size() == 0) {
            System.out.println("なにも登録されていません");
            System.out.println();
            return;
        }
        for (int i = 0; i < todos.size(); i++) {
            System.out.println("Todo Number: " + i + 1);
            todos.get(i).printTodo();
        }
    }

}

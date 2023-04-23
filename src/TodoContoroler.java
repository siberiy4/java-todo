import java.util.ArrayList;
import java.util.Scanner;

public class TodoContoroler {
    static ArrayList<Todo> todos = new ArrayList<>();

    private TodoContoroler() {
    }

    public static void createTodo() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Todoの種類 ");
                System.out.print("1.制約なし 2.期限あり 3.開始時間あり 4.開始時間・期限あり: ");
                int todoType = Integer.parseInt(scan.nextLine());
                if (todoType < 1 || 4 < todoType) {
                    throw new IllegalArgumentException();
                }
                System.out.print("Todoを入力してください: ");
                String title = scan.nextLine();
                System.out.print("備考があれば入力してください: ");
                String note = scan.nextLine();

                if (todoType == 1) {
                    todos.add(new SimpleTodo(title, note));
                }

                System.out.println("入力完了です");

                break;

            } catch (Exception e) {
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

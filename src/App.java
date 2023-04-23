import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            while (true) {

                System.out.println("Todoの操作 ");
                System.out.print("1.Todo追加 2.一覧確認 3.削除 4.終了: ");
                int todoType = input.nextInt();
                if (todoType < 1 || 4 < todoType) {
                    throw new IllegalArgumentException();
                } else if (todoType == 1) {
                    TodoContoroler.createTodo();

                } else if (todoType == 2) {
                    TodoContoroler.printAllTodo();

                } else if (todoType == 3) {
                    // TodoContoroler.removeTodo();

                } else if (todoType == 4) {
                    System.out.println("Todoを終了します");
                    return;
                } else {

                    System.out.println("正しく入力してください");
                }
            }

        } catch (Exception e) {
            System.err.println("不正な操作です");
        }

    }
}

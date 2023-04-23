import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        int todoType = 0;

        while (true) {
            System.out.println("Todoの操作 ");
            System.out.print("1.Todo追加 2.一覧確認 3.削除 4.終了: ");
            try  {
                todoType = Integer.parseInt(input.nextLine());
                if (todoType < 1 || 4 < todoType) {
                    throw new IllegalArgumentException();
                }

                if (todoType == 1) {
                    TodoContoroler.createTodo();

                }
                if (todoType == 2) {
                    TodoContoroler.printAllTodo();

                }
                if (todoType == 3) {
                    // TodoContoroler.removeTodo();

                }
                if (todoType == 4) {
                    System.out.println("Todoを終了します");
                    break;
                }

            } catch (Exception e) {
                System.err.println("不正な操作です");

            }

        }
        input.close();

    }
}

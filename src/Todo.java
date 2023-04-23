public class Todo {
    private Boolean done;
    private String title;
    private String note;
    private String startline;
    private String deadline;

    public Todo(String title, String note) {

        this.setNote(note);
        this.setTitle(title);
        this.done = false;
        this.setStartline("");
        this.setDeadline("");
    }

    public void printTodo() {
        System.out.println((this.getDone() ? "完了済" : "未完了"));
        System.out.println("内容: " + this.getTitle());
        if (this.note.length() != 0) {
            System.out.println("備考: " + this.getNote());
        }
        if (this.startline.length() != 0) {
            System.out.println("開始日時: " + this.getStartline());
        }
        if (this.deadline.length() != 0) {
            System.out.println("期限: " + this.getDeadline());
        }
    }

    public void setTitle(String title) throws IllegalArgumentException {
        if (title.length() == 0) {
            throw new IllegalArgumentException();
        }

        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNote() {
        return this.note;
    }

    public void doneTodo() {
        this.done = true;
    }

    public Boolean getDone() {
        return this.done;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getDeadline() {
        return this.deadline;
    }

    public void setStartline(String startline) {
        this.startline = startline;
    }

    public String getStartline() {
        return this.startline;
    }

}

public abstract class Todo {
    private Boolean done;
    private String title;
    private String note;

    public Todo() {
        done = false;
    }

    public void printTodo() {
        System.out.println((this.getDone()?"完了済":"未完了"));
        System.out.println("内容: " + this.getTitle());
        System.out.println("備考: "+ this.getNote());
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

    public Boolean getDone() {
        return this.done;
    }

    public void doneTodo() {
        this.done = true;
    }

}

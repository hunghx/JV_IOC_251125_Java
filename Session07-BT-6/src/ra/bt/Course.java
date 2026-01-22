package ra.bt;

public class Course {
    private int code;
    private String title;

    public Course() {
    }

    public Course(int code, String title) {
        this.code = code;
        this.title = title;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void showCourse(){
        System.out.println("Course Code: " + code + ", Title: " + title);
    }
}

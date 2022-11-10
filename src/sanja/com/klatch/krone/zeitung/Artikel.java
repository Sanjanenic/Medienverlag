package sanja.com.klatch.krone.zeitung;

public class Artikel {
    private  String title;
    private String content;

    public Artikel(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Artikel{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
package InterfaceDemo;

public class News implements INews {
    int id;
    String title;
    String ngayXuatBan;
    String author;
    String content;
    float averageRate;

    int[] rates;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNgayXuatBan() {
        return ngayXuatBan;
    }

    public void setNgayXuatBan(String ngayXuatBan) {
        this.ngayXuatBan = ngayXuatBan;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void display() {
        System.out.println("title = " + title);
        System.out.println("ngayXuatBan = " + ngayXuatBan);
        System.out.println("author = " + author);
        System.out.println("content = " + content);
    }

    @Override
    public float calculate() {
        int sum = 0;
        for (int i = 0; i < rates.length; i++) {
            sum += rates[i];
        }
        return (float) sum/rates.length ;
    }
}

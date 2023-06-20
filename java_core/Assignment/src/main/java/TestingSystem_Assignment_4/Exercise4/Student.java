package TestingSystem_Assignment_4.Exercise4;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.time.LocalDate;

public class Student {
    private int id;
    private String name;
    private String queQuan;
    private float avgScore;

    LocalDate localDate = LocalDate.now();

    public Student(String name, String queQuan, float avgScore) {
        this.name = name;
        this.queQuan = queQuan;
        this.avgScore = avgScore;
    }

    public void setAvgScore(float avgScore) {
        this.avgScore = avgScore;
    }

    public void congDiem (float score) {
        this.avgScore += score;
    }

    @Override
    public String toString() {
        if(this.avgScore < 4 && this.avgScore > 0){
            return "Student{" +
                    "name='" + name + '\'' +
                    ", avgScore=" + avgScore +
                    '}' + " => Học lực YẾU";
        } else if (this.avgScore > 4 && this.avgScore < 6) {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", avgScore=" + avgScore +
                    '}' + " => Học lực TRUNG BÌNH";
        } else if (this.avgScore > 6 && this.avgScore < 8) {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", avgScore=" + avgScore +
                    '}' + " => Học lực KHÁ";
        } else if(this.avgScore > 8 && this.avgScore < 10) {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", avgScore=" + avgScore +
                    '}' + " => Học lực GIỎI";
        }else {
        return null;
        }
    }
}

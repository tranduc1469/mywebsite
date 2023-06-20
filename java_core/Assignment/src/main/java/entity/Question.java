package entity;

import java.time.LocalDateTime;

public class Question {
    int QuestionId;
    String content;
    CategoryQuestion CategoryId;
    TypeQuestion TypeId;
    int creatorId;
    LocalDateTime CreateDate;
}

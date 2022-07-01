package pojo;

import java.sql.Date;

/**
 * 护理记录
 */

/*
create table nursingrecord(
id int primary key auto_increment ,
content varchar(200),
startdate date,
enddate date,
record_userid int unique,
record_levelid int,
CONSTRAINT fk_record_user FOREIGN KEY(record_userid) REFERENCES customer(id),
CONSTRAINT fk_record_level FOREIGN KEY(record_levelid) REFERENCES nursinglevel(id)

);
 */

public class NursingRecord {
    /*
    TODO
     前端要删除一部分
     */
    private Integer id;
    private String content; //内容
    private Date start; //开始时间
    private Date end; //结束时间
    private Integer userId;  //与顾客的外键
    private Integer levelId; //与等级的外键

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    @Override
    public String toString() {
        return "NursingRecord{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", start=" + start +
                ", end=" + end +
                ", userId=" + userId +
                ", levelId=" + levelId +
                '}';
    }
}

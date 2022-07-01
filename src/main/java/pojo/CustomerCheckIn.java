package pojo;

import java.sql.Date;

/**
 * 客户入住记录
 */

/*
create table checkinrecord(
id int primary key auto_increment,

bedid int,
checkindate date,
expirationdate date,
attention varchar(20),
checkin_id int unique,
CONSTRAINT fk_checkin_user FOREIGN KEY(checkin_id) REFERENCES customer(id)
););
 */
public class CustomerCheckIn {
    int id;
    int bedId;  //床位
    Date checkInDate;   //入住时间
    Date expirationDate;    //到期时间
    String attention;   //注意事项
    int customerId;     //客户ID（外键）

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBedId() {
        return bedId;
    }

    public void setBedId(int bedId) {
        this.bedId = bedId;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "CustomerCheckIn{" +
                "id=" + id +
                ", bedId=" + bedId +
                ", checkInDate=" + checkInDate +
                ", expirationDate=" + expirationDate +
                ", attention='" + attention + '\'' +
                ", customerId=" + customerId +
                '}';
    }
}

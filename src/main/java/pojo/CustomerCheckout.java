package pojo;

import java.sql.Date;

/**
 * 客户退住记录
 */

/*
create table retreatrecord(
id  int primary key auto_increment,
retreattime date,

retreatreason varchar(20),
asktime date,
auditperson varchar(20),
auditopinion varchar(20),
retreat_id int unique,
CONSTRAINT fk_retreat_user FOREIGN KEY(retreat_id) REFERENCES customer(id)
);
*/

public class CustomerCheckout {
    private Integer id;
    private Date retreatTime;   //退房时间
    private String retreatReason;   //退房原因
    private Date askTime;   //申请时间
    private String auditPerson ;    //监管人
    private String auditOpinion;    //监管人意见
    private Integer retreatId;     //退房客户id（外键）

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getRetreatTime() {
        return retreatTime;
    }

    public void setRetreatTime(Date retreatTime) {
        this.retreatTime = retreatTime;
    }

    public String getRetreatReason() {
        return retreatReason;
    }

    public void setRetreatReason(String retreatReason) {
        this.retreatReason = retreatReason;
    }

    public Date getAskTime() {
        return askTime;
    }

    public void setAskTime(Date askTime) {
        this.askTime = askTime;
    }

    public String getAuditPerson() {
        return auditPerson;
    }

    public void setAuditPerson(String auditPerson) {
        this.auditPerson = auditPerson;
    }

    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion;
    }

    public Integer getRetreatId() {
        return retreatId;
    }

    public void setRetreatId(Integer retreatId) {
        this.retreatId = retreatId;
    }

    @Override
    public String toString() {
        return "CustomerCheckout{" +
                "id=" + id +
                ", retreatTime=" + retreatTime +
                ", retreatReason='" + retreatReason + '\'' +
                ", askTime=" + askTime +
                ", auditPerson='" + auditPerson + '\'' +
                ", auditOpinion='" + auditOpinion + '\'' +
                ", retreatId=" + retreatId +
                '}';
    }
}

package pojo;

/**
 * 客户外出
 */

/*
create table outgoing(
id int primary key auto_increment,
outgoingreason varchar(20),
outgoingtime varchar(20),
expectedreturntime varchar(20),
actualreturntime varchar(20),
escort varchar(20),
escorttel varchar(20),
outgoing_id int,
CONSTRAINT fk_outgoing_user FOREIGN KEY(outgoing_id) REFERENCES customer(id)
);
 */

public class CustomerGoOut {
    private Integer id;
    private String outGoingReason;  //外出原因
    private String outGoingTime;    //外出时间
    private String expectedReturnTime;  //预期返回时间
    private String actualReturnTime;    //实际返回时间
    private String escort;  //陪同人
    private String escortTel;  //陪同人电话
    private Integer customerId; //外出客户id（外键）

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOutGoingReason() {
        return outGoingReason;
    }

    public void setOutGoingReason(String outGoingReason) {
        this.outGoingReason = outGoingReason;
    }

    public String getOutGoingTime() {
        return outGoingTime;
    }

    public void setOutGoingTime(String outGoingTime) {
        this.outGoingTime = outGoingTime;
    }

    public String getExpectedReturnTime() {
        return expectedReturnTime;
    }

    public void setExpectedReturnTime(String expectedReturnTime) {
        this.expectedReturnTime = expectedReturnTime;
    }

    public String getActualReturnTime() {
        return actualReturnTime;
    }

    public void setActualReturnTime(String actualReturnTime) {
        this.actualReturnTime = actualReturnTime;
    }

    public String getEscort() {
        return escort;
    }

    public void setEscort(String escort) {
        this.escort = escort;
    }

    public String getEscortTel() {
        return escortTel;
    }

    public void setEscortTel(String escortTel) {
        this.escortTel = escortTel;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "CustomerGoOut{" +
                "id=" + id +
                ", outGoingReason='" + outGoingReason + '\'' +
                ", outGoingTime='" + outGoingTime + '\'' +
                ", expectedReturnTime='" + expectedReturnTime + '\'' +
                ", actualReturnTime='" + actualReturnTime + '\'' +
                ", escort='" + escort + '\'' +
                ", escortTel='" + escortTel + '\'' +
                ", customerId=" + customerId +
                '}';
    }
}

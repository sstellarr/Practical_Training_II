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
escordtel int,
outgoing_id int,
CONSTRAINT fk_outgoing_user FOREIGN KEY(outgoing_id) REFERENCES customer(id)
);
 */

public class CustomerGoOut {
    int id;
    String outGoingReason;  //外出原因
    String outGoingTime;    //外出时间
    String expectedReturnTime;  //预期返回时间
    String actualReturnTime;    //实际返回时间
    String escort;  //陪同人
    String escortTel;  //陪同人电话
    int customerId; //外出客户id（外键）
}

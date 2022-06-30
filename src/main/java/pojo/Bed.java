package pojo;

/**
 * 床位
 */

/*create table bedmanage(
id int primary key auto_increment,
buildingid int,
isavailable char(1),
userid int unique,
CONSTRAINT fk_bed_user FOREIGN KEY(userid) REFERENCES customer(id)
);
 */

public class Bed {
    int id;
    int buildingId; //所在建筑
    int roomId; //房间号
    boolean isAvailable;    //是否可用
    int userId; //使用者编号（外键）
}

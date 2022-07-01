package pojo;

/**
 * 床位
 */

/*create table bedmanage(
id int primary key auto_increment,
roomid int,
buildingid int,
isavailable char(1),
userid int unique,
CONSTRAINT fk_bed_user FOREIGN KEY(userid) REFERENCES customer(id)
);
 */

public class Bed {
    private Integer id;
    private Integer roomId; //房间号
    private Integer buildingId; //所在建筑
    private String isAvailable;    //是否可用
    private Integer userId; //使用者编号（外键）

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    public String getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "id=" + id +
                ", roomId=" + roomId +
                ", buildingId=" + buildingId +
                ", isAvailable='" + isAvailable + '\'' +
                ", userId=" + userId +
                '}';
    }
}

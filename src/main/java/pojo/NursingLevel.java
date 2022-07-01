package pojo;

/**
 * 护理等级
 */

/*
create table nursinglevel(
id int primary key auto_increment ,
name varchar(20),
state char(1)
);
 */

public class NursingLevel {
    private Integer id;
    private String name;  //等级名称
    private String status; //启用状态

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "NursingLevel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

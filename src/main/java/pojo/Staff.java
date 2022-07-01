package pojo;

/**
 * 员工
 */

/*
create table staff(
id int primary key auto_increment,
client_name varchar(15),
client_gender char(1),
client_id varchar(15),
client_type char(2),
client_account varchar(20),
client_password varchar(20),
client_tel varchar(11)
);
 */

public class  Staff{
    private Integer id;
    private String name; //员工名称
    private String gender;  //性别
    private String ID;   //员工ID
    private String type;    //种类
    private String account; //用户名
    private String password;    //密码
    private String tel;  //电话号码

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", ID='" + ID + '\'' +
                ", type='" + type + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}

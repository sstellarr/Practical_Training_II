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
client_relation varchar(20)
);
 */

public class  Staff{
    private Integer id;
    private String name; //员工名称
    private String gender;  //性别
    private String staffId;   //员工ID
    private String type;    //种类
    private String account; //用户名
    private String password;    //密码
    private String tel;  //电话号码

    private String relation; //与客户的关系；服务对象

    public Staff() {
    }

    public Staff(String name, String gender, String staffId, String type, String account, String password, String tel, String relation) {
        this.name = name;
        this.gender = gender;
        this.staffId = staffId;
        this.type = type;
        this.account = account;
        this.password = password;
        this.tel = tel;
        this.relation = relation;
    }

    public Staff(Integer id, String name, String gender, String staffId, String type, String account, String password, String tel, String relation) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.staffId = staffId;
        this.type = type;
        this.account = account;
        this.password = password;
        this.tel = tel;
        this.relation = relation;
    }

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

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
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

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", staffId='" + staffId + '\'' +
                ", type='" + type + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", tel='" + tel + '\'' +
                ", relation='" + relation + '\'' +
                '}';
    }
}

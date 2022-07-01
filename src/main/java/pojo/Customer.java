package pojo;

import java.sql.Date;

/**
 * 客户
 */

/*
create TABLE customer(
id int primary key auto_increment,
name varchar(15),
gender char(1),
age int,
tel varchar(20),
idcardnumber varchar(20),
filenumber varchar(20),
account varchar(20),
password varchar(20),
height int,
birthday date
);
);
 */
public class Customer {
    private Integer id;
    private String name;    //姓名
    private String  gender;    //性别
    private Integer age;    //年龄
    private String tel;    //电话
    private String idCardNumber;   //身份卡号
    private String fileNumber;     //档案编号
    private String account;    //用户名
    private String password;   //密码
    private Integer height; //身高
    private Date birthday;  //生日

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
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

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", tel='" + tel + '\'' +
                ", idCardNumber='" + idCardNumber + '\'' +
                ", fileNumber='" + fileNumber + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", height=" + height +
                ", birthday=" + birthday +
                '}';
    }
}

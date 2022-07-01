package pojo;

/**
 * 管理员
 */

/*

create table manager(
id int primary key auto_increment,
account varchar(20),
password varchar(20);

 */

public class Administrator {
    private Integer id;
    private String account;    //用户名
    private String password;   //密码

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Administrator{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

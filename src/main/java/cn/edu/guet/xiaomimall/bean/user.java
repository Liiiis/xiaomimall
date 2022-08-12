package cn.edu.guet.xiaomimall.bean;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/07/31/19:56
 * @Description:
 */
public class user {
    private int id;
    private String name;
    private String phone;
    private String email;
    private String sex;
    private Date ctime;
    private Date uptime;

    public user(int id, String name, String phone, String email, String sex, Date ctime, Date uptime) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.sex = sex;
        this.ctime = ctime;
        this.uptime = uptime;
    }

    public user(String name, String phone, String email, String sex) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.sex = sex;
    }

    public user(int id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public user() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                ", ctime=" + ctime +
                ", uptime=" + uptime +
                '}';
    }
}

package cn.edu.guet.xiaomimall.bean;

import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/26/21:36
 * @Description:
 */
public class employee {
    private int table_id;
    private String number;
    private String name;
    private String phone;
    private String gender;
    private String identity;
    private String position;
    private Date hiredate;
    private String state;
    private String remark;

    public employee() {
    }

    public employee(String number, String name, String phone, String gender, String identity, String position, Date hiredate, String state, String remark) {
        this.number = number;
        this.name = name;
        this.phone = phone;
        this.gender = gender;
        this.identity = identity;
        this.position = position;
        this.hiredate = hiredate;
        this.state = state;
        this.remark = remark;
    }

    public employee(int table_id, String number, String name, String phone, String gender, String identity, String position, Date hiredate, String state, String remark) {
        this.table_id = table_id;
        this.number = number;
        this.name = name;
        this.phone = phone;
        this.gender = gender;
        this.identity = identity;
        this.position = position;
        this.hiredate = hiredate;
        this.state = state;
        this.remark = remark;
    }


    public int getTable_id() {
        return table_id;
    }

    public void setTable_id(int table_id) {
        this.table_id = table_id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "employee{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", identity='" + identity + '\'' +
                ", position='" + position + '\'' +
                ", hiredate=" + hiredate +
                ", state='" + state + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}

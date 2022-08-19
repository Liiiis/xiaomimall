package cn.edu.guet.xiaomimall.bean;

import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/19/16:30
 * @Description:
 */
public class orderpro {
    private int id;
    private String orderid;
    private int pid;
    private Date ctome;
    private String category;

    public orderpro() {
    }

    public orderpro(int id, String orderid, int pid, Date ctome, String category) {
        this.id = id;
        this.orderid = orderid;
        this.pid = pid;
        this.ctome = ctome;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Date getCtome() {
        return ctome;
    }

    public void setCtome(Date ctome) {
        this.ctome = ctome;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

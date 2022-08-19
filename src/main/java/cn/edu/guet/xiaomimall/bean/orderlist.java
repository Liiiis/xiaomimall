package cn.edu.guet.xiaomimall.bean;

import java.sql.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/18/18:37
 * @Description:
 */
public class orderlist {
    private int id;
    private String ordernumber;
    private String sumPrice;
    private String shoppingcar;
    private Date ctime;

    public orderlist() {
    }

    public orderlist(int id, String ordernumber, String sumPrice, String shoppingcar, Date ctime) {
        this.id = id;
        this.ordernumber = ordernumber;
        this.sumPrice = sumPrice;
        this.shoppingcar = shoppingcar;
        this.ctime = ctime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public String getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(String sumPrice) {
        this.sumPrice = sumPrice;
    }

    public String getShoppingcar() {
        return shoppingcar;
    }

    public void setShoppingcar(String shoppingcar) {
        this.shoppingcar = shoppingcar;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}

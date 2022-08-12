package cn.edu.guet.xiaomimall.bean;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/07/26/19:24
 * @Description:
 */
public class product {
    private int id;//id
    private String number;//编号
    private String name;//商品名称
    private double price;//商品定价
    private double cost;//成本
    private int stock;//库存
    private String status;//商品规格
    private String category;//类别
    private String path;//图片路径


    public product(int id, String number, String name, double price, double cost, int stock, String status, String category, String path) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.price = price;
        this.cost = cost;
        this.stock = stock;
        this.status = status;
        this.category = category;
        this.path = path;
    }

    public product(int id, String number, String name, double price, double cost, int stock, String status, String category) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.price = price;
        this.cost = cost;
        this.stock = stock;
        this.status = status;
        this.category = category;
    }

    public product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", cost=" + cost +
                ", stock=" + stock +
                ", status='" + status + '\'' +
                ", category='" + category + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}

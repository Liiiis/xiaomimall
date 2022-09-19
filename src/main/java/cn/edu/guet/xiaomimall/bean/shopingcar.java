package cn.edu.guet.xiaomimall.bean;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/13/22:27
 * @Description:
 */
public class shopingcar {
    private int id;
    private String name;
    private double price;
    private int num;
    private String path;
    private String category;//类别
    private boolean checked;

    public shopingcar() {
    }

    public shopingcar(int id, String name, double price, int num, String path, String category, boolean checked) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.num = num;
        this.path = path;
        this.category = category;
        this.checked = checked;
    }

    public shopingcar(shopingcar shopingcar) {
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "shopingcar{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", path='" + path + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}

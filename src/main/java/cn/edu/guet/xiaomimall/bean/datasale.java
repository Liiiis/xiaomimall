package cn.edu.guet.xiaomimall.bean;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/22/13:28
 * @Description:
 */
public class datasale {
    private int value;
    private String name;

    public datasale() {
    }

    public datasale(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

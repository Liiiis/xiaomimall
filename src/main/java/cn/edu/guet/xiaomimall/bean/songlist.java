package cn.edu.guet.xiaomimall.bean;

import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 钟丁豪
 * @Date: 2022/08/02/10:24
 * @Description:
 */
public class songlist {
    private String listId;
    private String listName;
    private boolean publishStatus;
    private String creator;
    private Date createTime;
    private Date updateTime;

    public songlist(String listId, String listName, boolean publishStatus, String creator) {
        this.listId = listId;
        this.listName = listName;
        this.publishStatus = publishStatus;
        this.creator = creator;
    }

    public songlist(String listId, String listName, boolean publishStatus, String creator, Date createTime, Date updateTime) {
        this.listId = listId;
        this.listName = listName;
        this.publishStatus = publishStatus;
        this.creator = creator;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public songlist() {
    }

    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public boolean isPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(boolean publishStatus) {
        this.publishStatus = publishStatus;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}

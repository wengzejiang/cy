package com.cy.pj.goods.pojo;


import java.util.Date;

/**
 * Package: com.cy.pj.goods.pojo
 * Description： TODO
 * Author: wengzejiang
 * Date: Created in 2021/3/7 0007 15:05
 * Company: 暂无
 * Version: 0.0.1
 * Modified By:
 */


public class Goods {

    private int id;
    private String name;
    private String remark;
    private Date createdTime;

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                ", createdTime=" + createdTime +
                '}';
    }

    public Goods(int id, String name, String remark, Date createdTime) {
        this.id = id;
        this.name = name;
        this.remark = remark;
        this.createdTime = createdTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRemark() {
        return remark;
    }

    public Date getCreatedTime() {
        return createdTime;
    }
}

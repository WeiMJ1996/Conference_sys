package com.wmj.entity;

public class Feedback {
    private Integer id;

    private Integer userid;

    private String content;

    private String picdesc;

    private Integer isback;

    private Integer flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPicdesc() {
        return picdesc;
    }

    public void setPicdesc(String picdesc) {
        this.picdesc = picdesc == null ? null : picdesc.trim();
    }

    public Integer getIsback() {
        return isback;
    }

    public void setIsback(Integer isback) {
        this.isback = isback;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
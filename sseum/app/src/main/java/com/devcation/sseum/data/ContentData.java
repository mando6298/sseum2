package com.devcation.sseum.data;

public class ContentData {

    int type; // 1

    int id;

    String textid;
    String tag;

    public ContentData(int id, String textid, String tag) {
        this.id = id;
        this.textid = textid;
        this.tag = tag;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTextid() {
        return textid;
    }

    public void setTextid(String textid) {
        this.textid = textid;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

}

package com.devcation.sseum.data;

public class WriteData {

    int type;

    String tag; // 주제
    String textid;  // 글 ID
    String write;  // 내용
    String date;  // 날짜
    String username;  // 글작성자

    public WriteData(String tag, String textid, String write, String date, String username) {
        this.tag = tag;
        this.textid = textid;
        this.write = write;
        this.date = date;
        this.username = username;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTextid() {
        return textid;
    }

    public void setTextid(String textid) {
        this.textid = textid;
    }

    public String getWrite() {
        return write;
    }

    public void setWrite(String write) {
        this.write = write;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

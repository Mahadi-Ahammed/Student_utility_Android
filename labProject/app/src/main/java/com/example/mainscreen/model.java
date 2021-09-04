package com.example.mainscreen;

//package com.example.demofirebasetorecycler;

public class model
{
    String title,subname,subcode,topics,due,purl;
    model()
    {

    }
    public model(String title, String subname, String subcode, String topics, String due, String purl) {
        this.title = title;
        this.subname = subname;
        this.subcode = subcode;
        this.topics = topics;
        this.due = due;
        this.purl = purl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public String getSubCode() {
        return subcode;
    }

    public void setSubCode(String subcode) {
        this.subcode = subcode;
    }

    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }
}

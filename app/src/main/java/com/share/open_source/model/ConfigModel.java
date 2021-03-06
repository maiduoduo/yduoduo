package com.share.open_source.model;

import com.google.gson.Gson;

import java.io.Serializable;


public class ConfigModel implements Serializable{
    private String id;
    private String notice;
    private String image;
    private String versionCode;
    private String forceVersionCode;
    private String link;
    private String keyword;
    private String message;
    private String intro;
    private String email;
    private String QQ1;
    private String QQ2;
    private String alipayCommand;
    private long time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public String getForceVersionCode() {
        return forceVersionCode;
    }

    public void setForceVersionCode(String forceVersionCode) {
        this.forceVersionCode = forceVersionCode;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQQ1() {
        return QQ1;
    }

    public void setQQ1(String QQ1) {
        this.QQ1 = QQ1;
    }

    public String getQQ2() {
        return QQ2;
    }

    public void setQQ2(String QQ2) {
        this.QQ2 = QQ2;
    }

    public String getAlipayCommand() {
        return alipayCommand;
    }

    public void setAlipayCommand(String alipayCommand) {
        this.alipayCommand = alipayCommand;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}

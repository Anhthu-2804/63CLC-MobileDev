package com.anhthu.recycleview;

public class MyDataModel {
    private int avatarResource;
    private String name;
    private String info;

    public MyDataModel(int avatarResource, String name, String info) {
        this.avatarResource = avatarResource;
        this.name = name;
        this.info = info;
    }

    public int getAvatarResource() {
        return avatarResource;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }
}

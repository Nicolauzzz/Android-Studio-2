package com.example.modul2_kel31;

public class Member {

    private String name;
    private String nim;
    private int imageResId;

    public Member(String name, String nim, int imageResId) {
        this.name = name;
        this.nim = nim;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public String getNim() {
        return nim;
    }

    public int getImageResId() {
        return imageResId;
    }
}

package com.example.napat.githubtest;

import com.google.gson.annotations.Expose;

public class User {
    @Expose
    String name;
    @Expose
    String blog;
    @Expose
    String company;
    @Expose
    String website;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getBlog() {
        return blog;
    }

    public String getCompany() {
        return company;
    }

    public String getWebsite() {
        return website;
    }
}

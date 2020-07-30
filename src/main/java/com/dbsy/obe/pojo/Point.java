package com.dbsy.obe.pojo;

public class Point {
    private Integer id;

    private String introduction;

    private Integer requirementId;

    public Point(Integer id, String introduction, Integer requirementId) {
        this.id = id;
        this.introduction = introduction;
        this.requirementId = requirementId;
    }

    public Point() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Integer getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(Integer requirementId) {
        this.requirementId = requirementId;
    }
}
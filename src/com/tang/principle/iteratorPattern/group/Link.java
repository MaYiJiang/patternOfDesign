package com.tang.principle.iteratorPattern.group;

/**
 * ClassName:Link Package:com.tang.principle.iteratorPattern.group.lang @Date:2021/10/27
 * 20:47 @Author:TYH
 */
public class Link {
    private String fromId; // 雇员ID
    private String toId; // 雇员ID

    public Link(String fromId, String toId) {
        this.fromId = fromId;
        this.toId = toId;
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getToId() {
        return toId;
    }

    public void setToId(String toId) {
        this.toId = toId;
    }
    // ...get/set
}

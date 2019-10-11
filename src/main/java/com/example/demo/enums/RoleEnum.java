package com.example.demo.enums;

import lombok.Getter;

/**
 * @author zzz
 */
public enum RoleEnum {
    /**
     * 管理
     */
    ADMIN(0,"管理员"),
    /**
     * 超级管理员
     */
    ROOT(1,"超级管理员");
    @Getter
    private Integer code;
    @Getter
    private String desc;

    RoleEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

//    public Integer getCode() {
//        return code;
//    }
//
//    public String getDesc() {
//        return desc;
//    }
}

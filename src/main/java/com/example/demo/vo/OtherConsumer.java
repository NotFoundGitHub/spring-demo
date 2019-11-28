package com.example.demo.vo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class OtherConsumer implements Serializable {
    private Integer mobilePhone;
    /**
     * 零食
     */
    private Integer snacks;
    /**
     * 租金
     */
    private Integer rent;
    /**
     * 礼物
     */
    private Integer gift;
}

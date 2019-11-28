package com.example.demo.vo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class ConsumeVo implements Serializable {
    Integer breakfast;
    Integer lunch;
    Integer dinner;
    Integer shopping;
    OtherConsumer otherConsumer;
}

package com.example.demo.service.impl;

import com.example.demo.service.ConsumeService;
import com.example.demo.vo.ConsumeVo;
import org.springframework.stereotype.Service;

/**
 * @author zhaoguoqian
 */
@Service
public class ConsumeServiceImpl implements ConsumeService {
    @Override
    public Integer addMorningAndLunch(ConsumeVo consumeVo) {
        return consumeVo.getBreakfast()+consumeVo.getLunch();
    }
}

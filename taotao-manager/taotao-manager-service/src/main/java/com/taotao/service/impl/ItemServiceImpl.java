package com.taotao.service.impl;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Name: ItemServiceImpl
 * 商品管理service
 * User: Standard
 * Time: 2017/8/2 12:54
 * Created by IntelliJ IDEA.
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public TbItem getItemById(Long itemId) {
        TbItemExample exapmle = new TbItemExample();
        TbItemExample.Criteria criteria = exapmle.createCriteria();
        criteria.andIdEqualTo(itemId);
        List<TbItem> list = tbItemMapper.selectByExample(exapmle);
        for (int i = 0; i < list.size(); i++) {
            TbItem tbItem =  list.get(i);
            return tbItem;
        }
        return null;
    }
}
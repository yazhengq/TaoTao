package com.taotao.service;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.pojo.TbItem;

/**
 * Name: ItemService
 * ItemService接口
 * User: Standard
 * Time: 2017/8/2 12:48
 * Created by IntelliJ IDEA.
 */
public interface ItemService {
    TbItem getItemById(Long itemId);

    EUDataGridResult getItemList(int page, int rows);
}
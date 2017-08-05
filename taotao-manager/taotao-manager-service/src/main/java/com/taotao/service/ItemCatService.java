package com.taotao.service;

import com.taotao.common.pojo.EUTreeNode;

import java.util.List;

/**
 * Name: ItemCatService
 * ItemCatService接口
 * User: Standard
 * Time: 2017/8/3 11:27
 * Created by IntelliJ IDEA.
 */
public interface ItemCatService {
    List<EUTreeNode> getItemCatList(long parentId);
}

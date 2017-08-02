package com.taotao.controller;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Name: PageController
 * 页面跳转controller
 * User: Standard
 * Time: 2017/8/2 15:27
 * Created by IntelliJ IDEA.
 */
@Controller
public class PageController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/")
    public String showIndex() {
        return "index"; //item-add
    }

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page; //item-add
    }

}
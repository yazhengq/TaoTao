package com.taotao.common.pojo;

import java.util.List;

/**
 * Name: EUDataGridResult
 * 创建一个EasyUIDateGrid支持的数据格式的Pojo
 * User: Standard
 * Time: 2017/8/2 15:56
 * Created by IntelliJ IDEA.
 */
public class EUDataGridResult {

    private long total;
    private List<?> rows;
    public long getTotal() {
        return total;
    }
    public void setTotal(long total) {
        this.total = total;
    }
    public List<?> getRows() {
        return rows;
    }
    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}

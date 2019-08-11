package entity;

import java.io.Serializable;
import java.util.List;

/**
 * @CLASSNAME PageResult
 * @Description 分页对象
 * @Author miaomiaole
 * @Date 2019/08/08/16:58
 * Version 1.0
 **/
public class PageResult<T> implements Serializable {
    //总记录数--->springData使用的是Long类型查找主键
    private Long total;

    //显示记录数
    private List<T> rows;

    public PageResult() {
    }

    public PageResult(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}

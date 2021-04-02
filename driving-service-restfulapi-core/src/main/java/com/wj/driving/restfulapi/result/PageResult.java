package com.wj.driving.restfulapi.result;

import java.io.Serializable;
import java.util.List;

public class PageResult<T> implements Serializable {

    private List<T> list;

    private Integer totalCount;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}

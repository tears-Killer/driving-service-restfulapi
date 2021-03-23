package com.wj.driving.restfulapi.result;

import com.wj.driving.restfulapi.dto.admin.AdminDetailsDTO;

import java.util.List;

public class PageResult<T> {

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

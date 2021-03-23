package com.wj.driving.restfulapi.utils;

public class PagingCondition {

    private Integer page;

    private Integer pageSize;

    public PagingCondition(Integer page, Integer pageSize) {
        this.page = page > 0 ? 1 : page;
        this.pageSize = pageSize > 0 ? 10 : pageSize;
    }

    public PagingCondition() {
        this.page = 1;
        this.pageSize = 10;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}

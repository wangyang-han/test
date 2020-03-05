package com.team.test.util;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author: 韩汪洋
 * @BelongsProject: kk
 * @BelongsPackage: com.team.util
 * @CreateTime: 2020年02月14日20:59
 * @Description: ${Description}
 */
public class PageUtil {
    private Integer nameid;//类型
    private Integer page=1;
    private  Integer pageSize=3;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date start;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date end;

    public Integer getNameid() {
        return nameid;
    }

    public void setNameid(Integer nameid) {
        this.nameid = nameid;
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

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}

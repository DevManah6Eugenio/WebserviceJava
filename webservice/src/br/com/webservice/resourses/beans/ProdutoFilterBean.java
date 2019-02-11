package br.com.webservice.resourses.beans;

import javax.ws.rs.QueryParam;

public class ProdutoFilterBean {

    private @QueryParam("name")
    String name;
    
    private @QueryParam("limit")
    int limit;
    
    private @QueryParam("offset")
    int offset;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}

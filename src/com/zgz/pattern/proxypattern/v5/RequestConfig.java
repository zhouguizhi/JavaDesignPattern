package com.zgz.pattern.proxypattern.v5;
/**
 *  这是把请求的url和请求方式封装到一个枚举中
 */
public enum RequestConfig {
    login(RequestUrl.login,RequestMenu.POST);
    private String url;
    private RequestMenu requestMenu;
    RequestConfig(String url, RequestMenu requestMenu) {
        this.url = url;
        this.requestMenu = requestMenu;
    }

    public String getUrl() {
        return url;
    }

    public RequestMenu getRequestMenu() {
        return requestMenu;
    }}


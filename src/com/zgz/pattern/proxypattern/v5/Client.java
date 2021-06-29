package com.zgz.pattern.proxypattern.v5;
import java.util.HashMap;
import java.util.Map;
/**
 * v5版本描述:使用静态代理隔离网络请求,从而Okhttp Volley请求好隔离,某个接口使用volley或者okhttp，比较好的区分,从而导致代码不会耦合在一起
 *
 */
public class Client {
    public static void main(String[] args) {
        Map<String,Object> param = new HashMap<>();
        param.put("userName","zhouguizhi");
        param.put("pwd","123456");
        RequestManager.request(RequestConfig.login, RequestWay.OKHTTP, param, new ICallback() {
            @Override
            public void onFail(Exception e) {

            }
            @Override
            public void onSuccess(Object o) {

            }
        });
    }
}

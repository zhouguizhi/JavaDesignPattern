package com.zgz.pattern.proxypattern.v5;
import java.util.Map;

public final class RequestManager {
    private RequestManager(){}
    public static void request(RequestConfig requestConfig, RequestWay requestWay, Map<String,Object> param, ICallback iCallback){
       if(requestWay==RequestWay.OKHTTP){
           OkHttpRequest okHttpRequest = new OkHttpRequest();
           okHttpRequest.request(requestConfig,param,iCallback);
       }
        if(requestWay==RequestWay.VOLLEY){
            VolleyRequest volleyRequest = new VolleyRequest();
            volleyRequest.request(requestConfig,param,iCallback);
        }
    }
}

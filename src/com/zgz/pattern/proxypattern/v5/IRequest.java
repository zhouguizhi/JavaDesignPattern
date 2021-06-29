package com.zgz.pattern.proxypattern.v5;
import java.util.Map;

public interface IRequest {
    void httpGet(Map<String,Object> param,ICallback callback);
    void httpPost(Map<String,Object> param,ICallback callback);
}

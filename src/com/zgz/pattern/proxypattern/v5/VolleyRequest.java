package com.zgz.pattern.proxypattern.v5;
import java.util.Map;
/**
 * volley的get post请求
 */
public class VolleyRequest implements IRequest {
    @Override
    public void httpGet(Map<String, Object> param, ICallback callback) {

    }
    @Override
    public void httpPost(Map<String, Object> param, ICallback callback) {

    }
    public void request(RequestConfig requestConfig,Map<String, Object> param, ICallback callback){
        if(requestConfig.getRequestMenu()==RequestMenu.POST){
            httpPost(param,callback);
        }else{
            httpGet(param,callback);
        }
    }
}

package com.zgz.pattern.proxypattern.v5;
/**
 * 返回结果的回调
 */
public interface ICallback<T> {
    void onFail(Exception e);
    void onSuccess(T t);
}

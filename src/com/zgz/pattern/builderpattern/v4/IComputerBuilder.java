package com.zgz.pattern.builderpattern.v4;

public interface IComputerBuilder {
    void setCpu();
    void setGpu();
    void setHd();
    void setMemery();
    Computer build();

}

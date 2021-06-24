package com.zgz.pattern.builderpattern.v4;
/**
 * 中端电脑
 */
public class MilldleComputerBuilder implements IComputerBuilder{
    private Computer computer;

    @Override
    public void setCpu() {
        computer.setCpu("i5");
    }

    @Override
    public void setGpu() {
        computer.setGpu("i5");
    }

    @Override
    public void setHd() {
        computer.setHd("1T");
    }

    @Override
    public void setMemery() {
        computer.setMemery("8G");
    }
    @Override
    public Computer build(){
        return computer;
    }
}

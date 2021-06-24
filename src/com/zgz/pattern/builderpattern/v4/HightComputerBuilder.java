package com.zgz.pattern.builderpattern.v4;
/**
 * 高端电脑
 */
public class HightComputerBuilder implements IComputerBuilder{
    private Computer computer = new Computer();
    @Override
    public void setCpu() {
        computer.setCpu("i7");
    }

    @Override
    public void setGpu() {
        computer.setGpu("i7");
    }

    @Override
    public void setHd() {
        computer.setHd("1T");
    }
    @Override
    public void setMemery() {
        computer.setMemery("16G");
    }
    @Override
    public Computer build(){
        return computer;
    }
}

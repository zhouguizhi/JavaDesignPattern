package com.zgz.pattern.builderpattern.v4;

/**
 * 低端电脑
 */
public class LowComputerBuilder  implements IComputerBuilder{
    private Computer computer = new Computer();

    @Override
    public void setCpu() {
        computer.setCpu("i3");
    }

    @Override
    public void setGpu() {
        computer.setGpu("i3");
    }

    @Override
    public void setHd() {
        computer.setHd("1T");
    }

    @Override
    public void setMemery() {
        computer.setMemery("4G");
    }
    @Override
    public Computer build(){
        return computer;
    }
}

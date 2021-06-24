package com.zgz.pattern.builderpattern.v3;
/**
 * 低端电脑
 */
public class LowComputerBuilder {
    private Computer computer;
    public Computer build(){
        computer = new Computer();
        computer.setCpu("i3");
        computer.setGpu("i3");
        computer.setHd("1T");
        computer.setMemery("4G");
        return computer;
    }
}

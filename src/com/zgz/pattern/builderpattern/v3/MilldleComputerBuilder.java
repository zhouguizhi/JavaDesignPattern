package com.zgz.pattern.builderpattern.v3;
/**
 * 中端电脑
 */
public class MilldleComputerBuilder {
    private Computer computer;
    public Computer build(){
        computer = new Computer();
        computer.setCpu("i5");
        computer.setGpu("i5");
        computer.setHd("1T");
        computer.setMemery("8G");
        return computer;
    }
}

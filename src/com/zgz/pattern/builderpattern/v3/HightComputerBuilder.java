package com.zgz.pattern.builderpattern.v3;
/**
 * 高端电脑
 */
public class HightComputerBuilder {
    private Computer computer;
    public Computer build(){
        computer = new Computer();
        computer.setCpu("i7");
        computer.setGpu("i7");
        computer.setHd("1T");
        computer.setMemery("16G");
        return computer;
    }
}

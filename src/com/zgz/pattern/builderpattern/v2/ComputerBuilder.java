package com.zgz.pattern.builderpattern.v2;
/**
 *
 */
public class ComputerBuilder {
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

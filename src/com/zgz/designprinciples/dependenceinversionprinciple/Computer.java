package com.zgz.designprinciples.dependenceinversionprinciple;
/**
 * 电脑
 */
public class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDisk hardDisk;

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }
    public void run(){
        System.out.println("计算机开始运行");
        System.out.println("内存条是:="+memory.getData());
        cpu.run();
    }
}

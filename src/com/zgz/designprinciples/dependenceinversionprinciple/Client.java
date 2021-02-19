package com.zgz.designprinciples.dependenceinversionprinciple;
/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        CPU cpu = new IntelCpu();
        computer.setCpu(cpu);
        HardDisk xiJieHardDisk = new XiJieHardDisk();
        xiJieHardDisk.save("希捷硬盘");
        computer.setHardDisk(xiJieHardDisk);
        Memory jinShiDunMemory = new JinShiDunMemory();
        computer.setMemory(jinShiDunMemory);
        computer.run();
    }
}

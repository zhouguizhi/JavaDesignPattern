package com.zgz.designprinciples.dependenceinversionprinciple;
/**
 * intel cpu
 */
public class IntelCpu implements CPU {
    @Override
    public void run() {
        System.out.println("intel...cpu...");
    }
}

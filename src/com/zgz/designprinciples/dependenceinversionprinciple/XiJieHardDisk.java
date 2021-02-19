package com.zgz.designprinciples.dependenceinversionprinciple;

public class XiJieHardDisk implements HardDisk {
    @Override
    public String save(String data) {
        return "希捷硬盘";
    }
}

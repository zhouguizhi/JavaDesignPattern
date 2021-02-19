package com.zgz.designprinciples.openingclosingprinciple;
/**
 * 改变电脑背景墙
 */
public class ChangComputerExterior {
    public void display(ComputerSkin computerSkin) {
        if(null==computerSkin){
            return;
        }
        computerSkin.display();
    }
}

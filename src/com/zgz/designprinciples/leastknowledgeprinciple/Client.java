package com.zgz.designprinciples.leastknowledgeprinciple;

public class Client {
    public static void main(String[] args) {
        Agent agent = new Agent();
        Company company = new Company("杭州网红科技有限公司");
        agent.setCompany(company);
        agent.setFans(new Fans("傻逼粉丝"));
        agent.setStar(new Star("傻逼明细"));
        agent.meeting();
        agent.business();
    }
}

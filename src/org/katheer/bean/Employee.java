package org.katheer.bean;

import org.springframework.beans.factory.annotation.Required;

public class Employee {
    private String name;
    private String eid;
    private Account account;

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    public String getEid() {
        return eid;
    }

    @Required
    public void setEid(String eid) {
        this.eid = eid;
    }

    public Account getAccount() {
        return account;
    }

    @Required
    public void setAccount(Account account) {
        this.account = account;
    }
}

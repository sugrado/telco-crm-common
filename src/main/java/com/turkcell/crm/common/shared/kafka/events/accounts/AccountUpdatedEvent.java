package com.turkcell.crm.common.shared.kafka.events.accounts;

public class AccountUpdatedEvent {
    private int id;
    private String status;
    private String name;
    private String number;
    private String type;
    private int accountTypeId;

    public AccountUpdatedEvent(int id, String status, String name, String number, String type, int accountTypeId) {
        this.id = id;
        this.status = status;
        this.name = name;
        this.number = number;
        this.type = type;
        this.accountTypeId = accountTypeId;
    }

    public AccountUpdatedEvent() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(int accountTypeId) {
        this.accountTypeId = accountTypeId;
    }
}

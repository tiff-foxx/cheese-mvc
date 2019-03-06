package org.launchcode.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by LaunchCode
 */
@Entity
public class Cheese {

    @Id
    @GeneratedValue
    private int  id;

    @NotNull
    @Size(min=1, max=50, message = "Enter store name")
    private String name;

    @NotNull
    @Size(min=1, message = "Enter card description")
    private String description;

    @NotNull
    @Size(min=1, message = "Enter card balance")
    private String balance;

    @NotNull
    @Size(min=1, message = "Enter card number")
    private String number;

    @NotNull
    @Size(min=1, message = "Enter security code")
    private String code;

    @NotNull
    @Size(min=1, message = "Enter expiration date")
    private String expiration;

    private CheeseType type;

    public Cheese(String name, String description, String balance, String number, String code, String expiration) {
        this.name = name;
        this.description = description;
        this.balance = balance;
        this.number = number;
        this.code = code;
        this.expiration = expiration;
    }

    public Cheese() { }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CheeseType getType() {
        return type;
    }

    public void setType(CheeseType type) {
        this.type = type;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getExpiration () { return expiration; }

    public void setExpiration(String expiration) { this.expiration = expiration; }

}

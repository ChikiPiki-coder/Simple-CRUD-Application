package ru.webapp.tamik.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Person {
    private int id;

    @NotEmpty(message= "Имя не может быть пустым")
    @Size(min=2,max=30,message="Имя должно быть не меньше 2 и не больше 30 букв")
    private String name;
    @NotEmpty(message= "Фамилия не может быть пустой")
    @Size(min=2,max=30,message="Фамилия должна быть не меньше 2 и не больше 30 букв")
    private String lastName;

    @Email(message="Емаил введен неправильно")
    private String email;

    public Person() {
    }

    public Person(int id, String name, String lastName, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

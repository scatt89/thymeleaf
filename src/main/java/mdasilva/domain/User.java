package mdasilva.domain;

import java.io.Serializable;

public class User implements Serializable{

    private int numberId;
    private String name;
    private String shurName;
    private String lastName;
    private int age;

    public User(int numberId, String name, String surName, String lastName, int age) {
        this.numberId = numberId;
        this.name = name;
        this.shurName = surName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getNumberId() {
        return numberId;
    }

    public String getName() {
        return name;
    }

    public String getShurName() {
        return shurName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setNumberId(int numberId) {
        this.numberId = numberId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShurName(String shurName) {
        this.shurName = shurName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (numberId != user.numberId) return false;
        if (age != user.age) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (shurName != null ? !shurName.equals(user.shurName) : user.shurName != null) return false;
        return lastName != null ? lastName.equals(user.lastName) : user.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = numberId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (shurName != null ? shurName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "numberId=" + numberId +
                ", name='" + name + '\'' +
                ", shurName='" + shurName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public static class Builder{

        private int numberId;
        private String name;
        private String shurName;
        private String lastName;
        private int age;

        public User build(){
            return new User(numberId, name, shurName, lastName, age);
        }

        public Builder withUserCopy(User user){
            return new User.Builder()
                    .withAge(user.age)
                    .withLastName(user.lastName)
                    .withName(user.name)
                    .withShurName(user.shurName);
        }

        public Builder withNumberId(int numberId){
            this.numberId = numberId;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withShurName(String shurName) {
            this.shurName = shurName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }
    }
}

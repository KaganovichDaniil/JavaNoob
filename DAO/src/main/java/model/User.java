package model;

import java.util.ArrayList;
import java.util.List;


public class User {
    private int id;
    private String name;
    private int age;
    private String city;
    private List<Auto> autos;

    private User(int id, String name, int age, String city, List<Auto> autos) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
        this.autos = autos;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", autos=" + autos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (age != user.age) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (city != null ? !city.equals(user.city) : user.city != null) return false;
        return autos != null ? autos.equals(user.autos) : user.autos == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (autos != null ? autos.hashCode() : 0);
        return result;
    }

    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public List<Auto> getAutos() {
        return autos;
    }

    private static class Builder {
        private int id;
        private String name;
        private int age;
        private String city;
        private List<Auto> autos = new ArrayList<Auto>() {
        };



        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setAutos(List<Auto> autos) {
            this.autos = autos;
            return this;
        }

        public User build (){
            return new User(this.id, this.name, this.age, this.city, this.autos);
        }
    }
}

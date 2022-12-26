package models;

public class UserNova {
    private Long id;
    private String name;
    private String surname;

    public UserNova(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return Math.toIntExact(id);
    }

    public void setId(int id) {
        this.id = Long.valueOf(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

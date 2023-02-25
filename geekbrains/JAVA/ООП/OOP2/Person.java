package OOP2;

public class Person {
    private String name;
    private String status;

    public Person(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public void kisKis(String name) {
        System.out.println(name + " зовет кошку: кис-кис");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

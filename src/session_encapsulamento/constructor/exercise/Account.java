package session_encapsulamento.constructor.exercise;

public class Account {
    private Integer number;
    private String name;
    private double balence;


    public Account(Integer number, String name, double initialDeposity) {
        this.number = number;
        this.name = name;
        deposity(initialDeposity);
    }

    public Account(Integer number, String name) {
        this.number = number;
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalence() {
        return balence;
    }

    public void deposity(double amount){
        balence += amount;
    }

    public void withdraw(Double amount){
        balence -= amount + 5;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", balence=" + balence +
                '}';
    }
}

package entities;

import java.util.ArrayList;
import java.util.List;

public class Departament {

    private String name;
    private Integer payDay;

    private Address address;
    private List<Employee> employes = new ArrayList<>();

    public Departament() {

    }

    public Departament(String name, Integer payDay, Address address) {
        this.name = name;
        this.payDay = payDay;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPayDay() {
        return payDay;
    }

    public void setPayDay(Integer payDay) {
        this.payDay = payDay;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Employee> getEmployes() {
        return employes;
    }


    public void addEmployee(Employee employee){

        employes.add(employee);
    }

    public void removeEmployee(Employee employee){

        employes.remove(employee);
    }

    public double payroll(){

        double sum = 0.00;
        for(Employee employee: employes){

            sum +=employee.getSalary();
        }

        return sum;

    }


    public String toString(){

        StringBuilder sb = new StringBuilder();
        sb.append("FOLHA PAGAMENTO: " + "\n");
        sb.append("Departamento Vendas = ");
        sb.append(payroll() + "\n" );
        sb.append("Pagamento realizado no dia ");
        sb.append(getPayDay() + "\n");
        sb.append("Funcionários: " + "\n");
        for(Employee employee : employes){


            sb.append(employee.getName()+ "\n");

        }

        sb.append("Para dúvidas favor entrar em contato: ");
        sb.append(address.getEmail());


        return sb.toString();

    }

}

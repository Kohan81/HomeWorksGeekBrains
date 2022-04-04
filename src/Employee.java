public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String telephon;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String telephon, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephon = telephon;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", telephon='" + telephon + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan Ivanovich",
                "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30 );
        employees[1] = new Employee("Petrov Petr Petrovich",
                "Engineer", "petruha@mail.ru", "891768755", 30000, 37 );
        employees[2] = new Employee("Ivanov Sergey Nikolaevich",
                "Manager", "iv_serg@gmail.com", "893009935", 35000, 28 );
        employees[3] = new Employee("Jyglov Gleb Valentinovich",
                "Security chief", "gleb_1248@gmail.com", "89244912", 40000, 54 );
        employees[4] = new Employee("Rabinovich Issak Albertovich",
                "Director", "gen_director@mailbox.com", "893012345", 75000, 42 );

        isOlderForty(employees);

    }

    static void isOlderForty(Employee[] employees){
        for (int i = 0; i < employees.length; i++){
            if (employees[i].age > 40){
                System.out.println(employees[i].toString());
            }
        }
    }
}

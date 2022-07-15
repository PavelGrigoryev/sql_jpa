package com.example.sql_jpa;

import com.example.sql_jpa.entity.one_to_many_bi.Department;
import com.example.sql_jpa.entity.one_to_many_bi.Employee2;
import com.example.sql_jpa.repository.one_to_many_bi.DepartmentRepository;
import com.example.sql_jpa.repository.one_to_many_bi.Employee2Repository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SqlJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqlJpaApplication.class, args);
    }

   /* @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student maria = new Student("Maria",
                    "Jones",
                    "maria.jones@pavel.edu",
                    21
            );
            Student johnny = new Student("Johnny",
                    "Jameson",
                    "jameson.ruless@pavel.ru",
                    45
            );

            studentRepository.save(maria);
            studentRepository.save(johnny);
        };
    }*/

    /*@Bean
    CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository, DetailRepository detailRepository) {
        return args -> {
            //Employee employee = new Employee("Pavel", "Grigoryev", "IT", 500);
            //Detail detail = new Detail("Minsk", "102", "pavel@gmail.edu");

            //employee.setEmpDetail(detail);

            //employeeRepository.save(employee);

            //Employee employee = new Employee("Jackie", "Chan", "Actor", 5500);
            //Detail detail = new Detail("Hon-Kong", "+98646646546", "chan@tiktok.ch");

            //employee.setEmpDetail(detail);

           // employeeRepository.save(employee);
           // employeeRepository.deleteById(1);

            //Employee employee = new Employee("Misha", "Sidorov", "HR", 850);
            //Detail detail = new Detail("London", "987654321", "mishka@gmail.edu");

            //detail.setEmployee(employee);

            //detailRepository.save(detail);

            //Employee employee = new Employee("Nikolay", "Ivanov", "HR", 850);
            //Detail detail = new Detail("New-York", "65236989749", "nikolasha@gmail.ru");

            //employee.setEmpDetail(detail);
            //detail.setEmployee(employee);

            //detailRepository.save(detail);
            //detailRepository.deleteById(5);
        };
    }*/

    @Bean
    CommandLineRunner commandLineRunner(Employee2Repository employee2Repository, DepartmentRepository departmentRepository) {
        return args -> {
           /* Department department = new Department("IT", 300, 1200);
            Employee2 employee1 = new Employee2("Pavel", "Grigoryev", 800);
            Employee2 employee2 = new Employee2("Elena", "Smirnova", 1000);

            department.addEmployeeToDepartment(employee1);
            department.addEmployeeToDepartment(employee2);

            departmentRepository.save(department);*/
            employee2Repository.deleteById(4);
        };
    }
}

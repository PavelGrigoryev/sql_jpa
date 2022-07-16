package com.example.sql_jpa;

import com.example.sql_jpa.entity.many_to_many.Child;
import com.example.sql_jpa.entity.many_to_many.Section;
import com.example.sql_jpa.entity.one_to_many_bi.Department;
import com.example.sql_jpa.entity.one_to_many_bi.Worker;
import com.example.sql_jpa.repository.many_to_many.ChildRepository;
import com.example.sql_jpa.repository.many_to_many.SectionRepository;
import com.example.sql_jpa.repository.one_to_many_bi.DepartmentRepository;
import com.example.sql_jpa.repository.one_to_many_bi.WorkerRepository;
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

   /* @Bean
    CommandLineRunner commandLineRunner(WorkerRepository workerRepository, DepartmentRepository departmentRepository) {
        return args -> {
            Department department = new Department("Sales", 800, 1500);
            Worker worker = new Worker("Pavel", "Grigoryev", 800);
            Worker worker2 = new Worker("Elena", "Smirnova", 1500);
            Worker worker3 = new Worker("Anton", "Sidorov", 1200);

            department.addEmployeeToDepartment(worker);
            department.addEmployeeToDepartment(worker2);
            department.addEmployeeToDepartment(worker3);

            departmentRepository.save(department);
            //workerRepository.deleteById(4);
        };
    }*/

    @Bean
    CommandLineRunner commandLineRunner(ChildRepository childRepository, SectionRepository sectionRepository) {
        return args -> {
            /*Section section1 = new Section("Dance");
            Child child1 = new Child("Olya", 12);
            Child child2 = new Child("Grisha", 8);
            Child child3 = new Child("Sanya", 9);

            section1.addChildToSection(child1);
            section1.addChildToSection(child2);
            section1.addChildToSection(child3);

            sectionRepository.save(section1);*/

            /*Section section1 = new Section("VolleyBall");
            Section section2 = new Section("Chess");
            Section section3 = new Section("Math");
            Child child1 = new Child("Igor", 10);

            child1.addSectionToChild(section1);
            child1.addSectionToChild(section2);
            child1.addSectionToChild(section3);

            childRepository.save(child1);*/
            //sectionRepository.deleteById(6);
            childRepository.deleteById(5);
        };
    }
}

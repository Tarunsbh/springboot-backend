package net.javapractice.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javapractice.springboot.model.Employee;
import net.javapractice.springboot.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Employee employee = new Employee();
//		employee.setFirstName("dfd");
//		employee.setLastName("sdfds");
//		employee.setEmailId("dfs@sdfd.sdf");
//		employeeRepository.save(employee);
//		
//		Employee employee1 = new Employee();
//		employee1.setFirstName("dfd11");
//		employee1.setLastName("sdfds11");
//		employee1.setEmailId("dfs11@sdfd.sdf");
//		employeeRepository.save(employee1);

	}

}
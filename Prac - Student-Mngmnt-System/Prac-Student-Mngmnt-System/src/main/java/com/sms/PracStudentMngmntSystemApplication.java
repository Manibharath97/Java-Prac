package com.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sms.entity.Student;
import com.sms.repository.StudentRepository;

@SpringBootApplication
public class PracStudentMngmntSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PracStudentMngmntSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
	/*	
		Student student1 = new Student("Mani", "Bharath", "mani@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("jonny", "husk", "jkjk@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("tony", "Bharat", "tony@gmail.com");
		studentRepository.save(student3);
		*/
	}

}

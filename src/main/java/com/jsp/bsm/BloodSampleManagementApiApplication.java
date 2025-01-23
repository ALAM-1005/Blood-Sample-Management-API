package com.jsp.bsm;

import com.jsp.bsm.entity.User;
import com.jsp.bsm.enums.BloodGroup;
import com.jsp.bsm.enums.Gender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BloodSampleManagementApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloodSampleManagementApiApplication.class, args);

		User user = new User();
		User user1 = User.builder()
						.userId(10)
						.userName("Md juned alam")
				       		 .email("mdjunedalam220@gmail.com")
				.PhoneNumber("8405052470")
				.bloodGroup(BloodGroup.A_NEGATIVE)
				.gender(Gender.MALE)
				.age(23)
				.build();
	}

}

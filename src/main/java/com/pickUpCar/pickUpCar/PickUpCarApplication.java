package com.pickUpCar.pickUpCar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PickUpCarApplication{
//	@Autowired
//	private PersonRepository personRepository;
//
//	@Autowired
//	private RequestRepository requestRepository;
//
//	@Autowired
//	private RoleRepository roleRepository;
//
//	@Autowired
//	private UserRepository userRepository;


	public static void main(String[] args) { SpringApplication.run(PickUpCarApplication.class, args); }
//
//	@Override
//	public void run(String... args) throws Exception {

//		Person iulian = new Person("Iulian","ROCA",'M',35,"rocaiulian@gmail.com","0745465854");
//		User ryan = new User("Ryan", "root");
//		Role role = new Role("ADMIN");
//
//		ryan.setRole(role);
//
//		ryan.setPerson(iulian);
//		iulian.setUser(ryan);
















//		Role admin = new Role();
//		admin.setName("ADMIN");
//		admin.setUser(ryaniulian);

//		roleRepository.save(admin);

//		Person inaAlexandrina = new Person("Alexandrina", "Roca",'F',33,"ina.alexandrina@gmail.com","0753024235");
//		User ina=new User("ina","rootina");
//		inaAlexandrina.setUser(ina);
//		ina.setPerson(inaAlexandrina);
//
//		Role roleIna = new Role("USER",ina);
//		Set<Role> roleList = new HashSet<>();
//		roleList.add(roleIna);
//		ina.setRoleList(roleList);
//
//		userRepository.save(ina);


//	}
}

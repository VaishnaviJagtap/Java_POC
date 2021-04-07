package e_commerce.poc.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import e_commerce.poc.config.MessageResponse;
import e_commerce.poc.entity.ERole;
import e_commerce.poc.entity.JwtResponse;
import e_commerce.poc.entity.RoleDao;
import e_commerce.poc.entity.UserDao;
import e_commerce.poc.repository.RoleRepository;
import e_commerce.poc.repository.UserDaoRepository;
import e_commerce.poc.service.JwtUtils;
import e_commerce.poc.service.LoginRequest;
import e_commerce.poc.service.SignupRequest;
import e_commerce.poc.service.UserDetailsImpl;

@RestController
@CrossOrigin
public class JwtAuthenticationController {

	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	UserDaoRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@Autowired
	PasswordEncoder encoder;

	@Autowired
	JwtUtils jwtUtils;

	@PostMapping("/user/auth")
	public ResponseEntity<?> authenticateUser( @RequestBody LoginRequest loginRequest) {

		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);
		String jwt = jwtUtils.generateJwtToken(authentication);
		
		UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();		
		List<String> roles = userDetails.getAuthorities().stream()
				.map(item -> item.getAuthority())
				.collect(Collectors.toList());

		return ResponseEntity.ok(new JwtResponse(jwt));
	}

	@PostMapping("/user/register")
	public ResponseEntity<?> registerUser( @RequestBody SignupRequest signUpRequest) {
		if (userRepository.existsByUsername(signUpRequest.getUsername())) {
			return ResponseEntity
					.badRequest()
					.body(new MessageResponse("Error: Username is already taken!"));
		}

		

		// Create new user's account
		UserDao user = new UserDao(signUpRequest.getUsername(), 
							 encoder.encode(signUpRequest.getPassword()));

		Set<String> strRoles = signUpRequest.getRole();
		Set<RoleDao> roles = new HashSet<>();

		if (strRoles == null) {
			System.out.print("HELLLLLLLLLLOOOOOOOOOOO KHHHHHHHHHHHHAAAAAAAALLLLLLLLLIIIIIIII HHHHHHHHHAAAAAAAAiiiiiiii");
			RoleDao userRole = roleRepository.findByName(ERole.ROLE_USER)
					.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
			roles.add(userRole);
		} else {
			strRoles.forEach(role -> {
				switch (role) {
				case "admin":
					RoleDao adminRole = roleRepository.findByName(ERole.ROLE_ADMIN)
							.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
					roles.add(adminRole);

					break;
				
				case "user":
					RoleDao userRole = roleRepository.findByName(ERole.ROLE_USER)
							.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
					roles.add(userRole);
					
					break;
				}
			});
		}

		user.setRoles(roles);
		userRepository.save(user);

		return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
	}
}

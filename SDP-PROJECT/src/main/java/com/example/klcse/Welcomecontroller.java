package com.example.klcse;

import org.springframework.web.bind.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Welcomecontroller {

@GetMapping("/welcome")
public String welcome()
{
	
	return "Hello pawankalyanreddy";
}

}

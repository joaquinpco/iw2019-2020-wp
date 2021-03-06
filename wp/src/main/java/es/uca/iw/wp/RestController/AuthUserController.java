package es.uca.iw.wp.RestController;

import java.util.Map;

import javax.servlet.ServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.uca.iw.wp.Entity.User;
import es.uca.iw.wp.Repository.UserRepository;

@RestController
public class AuthUserController {

	@Autowired
	private UserRepository _oUserRepository;
	
	@RequestMapping("/accessByToken")
	public User getUserFromAccessCode(@RequestParam(value = "iAccessCode") int iAccessCode)
	{	
		return _oUserRepository.findByAccessCode(iAccessCode);
	}
	
	@RequestMapping("/loginForm")
	public String showLoginForm(ServletRequest request, Model model)
	{
	    Map<String, String[]> paramMap = request.getParameterMap();

	    if (paramMap.containsKey("error")) 
	    { 
	        model.addAttribute("loginError", "Invalid username and password.");
	    }

	    return "/user/loginForm";
	}
}

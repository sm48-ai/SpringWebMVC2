package in.sp.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.sp.beans.User;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
	// @RequestMapping("/helloPage")
	@GetMapping("/helloPage")
	public ModelAndView openHelloPage() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		return mav;
	}

	@GetMapping("/viewSt")
	public ModelAndView showView() {
		ModelAndView mv = new ModelAndView("view");

		return mv;
	}

	@GetMapping("/myForm")
	public String openMyFormPage() {
		return "my-form";
	}
//	@PostMapping("/submitForm")
	// public String handleMyForm(HttpServletRequest req) {
	// String myname=req.getParameter("name1");
	// String myemail=req.getParameter("email1");
	// String myphoneno=req.getParameter("phoneno1");

	// System.out.println("name :"+myname);
	// System.out.println("Email ID:"+myemail);
	// System.out.println("Phone NO:"+myphoneno);
	// return "profile";

	// }
//	@PostMapping("/submitForm")
//	public String handleMyForm(
//			@RequestParam("name1") String myname,
//			@RequestParam("email1") String myemail,
//			@RequestParam("phoneno1") String myphoneno,
//	        Model model
//	        )
//
//	{
//
//		System.out.println("name :" + myname);
//		System.out.println("Email ID:" + myemail);
//		System.out.println("Phone NO:" + myphoneno);
//		
//		model.addAttribute("model_name", myname);
//		model.addAttribute("model_email", myemail);
//		model.addAttribute("model_phNo", myphoneno);
//		
//		return "profile";
//
//	}
	
//	@PostMapping("/submitForm")
//	public String handleMyForm(
//			@RequestParam("name1") String myname,
//			@RequestParam("email1") String myemail,
//			@RequestParam("phoneno1") String myphoneno,
//	        Model model
//	        )
//
//	{
//
//		System.out.println("name :" + myname);
//		System.out.println("Email ID:" + myemail);
//		System.out.println("Phone NO:" + myphoneno);
//		
//		User user=new User();
//		user.setName(myname);
//		user.setEmail(myemail);
//		user.setPhoneno(myphoneno);
//				
//		
//		model.addAttribute("model_user", user);
//
//		
//		return "profile";
//
//	}
	
//	@PostMapping("/submitForm")
//	public String handleMyForm(@ModelAttribute User user)
//
//	{
//
//		System.out.println("name :" + user.getName());
//		System.out.println("Email ID:" + user.getEmail());
//		System.out.println("Phone NO:" + user.getPhoneno());
//
//		return "profile";
//
//	}
	
	@PostMapping("/submitForm")
	public String handleMyForm(@ModelAttribute("model_user") User user)

	{

		System.out.println("name :" + user.getName());
		System.out.println("Email ID:" + user.getEmail());
		System.out.println("Phone NO:" + user.getPhoneno());

		return "profile";

	}

}

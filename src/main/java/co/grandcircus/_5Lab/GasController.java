package co.grandcircus._5Lab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GasController {

		@RequestMapping("/")
		public ModelAndView showHome() {
			ModelAndView mav = new ModelAndView("index");
			return mav;
		}
		
		@RequestMapping("/mileage-form")
		public ModelAndView showForm(){
			ModelAndView mav = new ModelAndView("mileage-form");
			return mav;
		}
		
		@PostMapping("/mileage-form")
		public ModelAndView submitForm(
				@RequestParam ("mileage") Integer mileage,
				@RequestParam ("gallons") Integer gallons) {
			ModelAndView mav = new ModelAndView("results");
			mav.addObject("mileage", mileage);
			mav.addObject("gallons", gallons);
			mav.addObject("miles", mileage * gallons);
			return mav;
			
		}
}

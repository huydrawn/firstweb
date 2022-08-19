package tags;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerSample {
	JdbcTemplate template;

	@RequestMapping("/check")
	public String checkStudent(Model model) {
		Student s = new Student();
		s.setID(1);
		s.setName("le quang huy");
		s.setSex("female");
		Map<String, String> sex = new HashMap<String, String>();
		sex.put("female", "female");
		sex.put("male", "male");
		Map<String, String> subjects = new HashMap<String, String>();
		subjects.put("Math", "Math");
		subjects.put("Chemistry", "Chemistry");
		subjects.put("Physical", "Physical");
		model.addAttribute("pass", subjects);
		Map<String, String> city = new HashMap<String, String>();
		city.put("Phu YEn", "Phu Yen");
		city.put("ha YEn", "ha Yen");
		city.put("Vinh YEn", "Vinh Yen");
		model.addAttribute("city", city);
		model.addAttribute("sex", sex);
		model.addAttribute("student", s);
		return "check";
	}

	@RequestMapping("/show")
	public String show(@ModelAttribute("student") Student s) {

		return null;

	}
}

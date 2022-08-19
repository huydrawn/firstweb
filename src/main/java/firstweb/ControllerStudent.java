package firstweb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ControllerStudent {
	@Autowired
	StudentDao dao; 

	@RequestMapping("/show")
	public String showStudents(Model model) {
		List<Student> students = dao.getAll();
		model.addAttribute("list", students);
		return "show";
	}
}

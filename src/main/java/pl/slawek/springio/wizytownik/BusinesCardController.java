package pl.slawek.springio.wizytownik;


import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("person")
public class BusinesCardController {

    @GetMapping("details")
    public String getPerson(Model model){ // obiekt model to spring, mvc
        model.addAttribute("name", "Andrzej");//to zwracamy na formatke
        model.addAttribute("surname", "Kowalski");
        model.addAttribute("email", "andrzej.kowalpsi@gmail.com");
        model.addAttribute("telephone", "5554443322");
        return "person details";
    }
}

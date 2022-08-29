package pl.slawek.springio.wizytownik;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("person")
public class BusinesCardController {

    @GetMapping("details")
    public String getPerson(){
        return "person details";
    }
}

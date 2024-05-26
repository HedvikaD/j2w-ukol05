package cz.czechitas.java2webapps.ukol5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.validation.BindingResult;
import jakarta.validation.Valid;
import java.time.LocalDate;
import java.time.Period;



/**
 * Kontroler obsluhující registraci účastníků dětského tábora.
 */
@Controller
@RequestMapping("/")
public class RegistraceController {

  @GetMapping("/")
  public ModelAndView formular() {
    ModelAndView modelAndView = new ModelAndView("formular");
    modelAndView.addObject("formular", new RegistraceForm());
    return modelAndView;
  }

  @PostMapping("/")
  public Object formular(@Valid @ModelAttribute("formular") RegistraceForm formular, BindingResult bindingResult) {

    if (bindingResult.hasErrors()) {
      return "/formular";
    }

    if (!overeniVeku(formular.getDatumNarozeni())) {
      bindingResult.rejectValue("datumNarozeni", null, "Věk účastníka musí být mezi 9 a 15 lety.");
      return "formular";
    }

    return new ModelAndView("rekapitulaceRegistrace")
            .addObject("jmeno", formular.getJmeno())
            .addObject("prijmeni", formular.getPrijmeni())
            .addObject("datumNarozeni", formular.getFormatovaneDatum())
            .addObject("turnus", formular.getTurnusDate())
            .addObject("email", formular.getEmail());
  }

  private boolean overeniVeku(LocalDate datumNarozeni) {
    Period period = datumNarozeni.until(LocalDate.now());
    int vek = period.getYears();
    return vek >= 9 && vek <= 15;
  }

}

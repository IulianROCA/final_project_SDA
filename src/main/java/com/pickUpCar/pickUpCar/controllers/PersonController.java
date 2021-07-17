package com.pickUpCar.pickUpCar.controllers;

import com.pickUpCar.pickUpCar.entity.Person;
import com.pickUpCar.pickUpCar.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

//    @GetMapping("/")
//    public String index(Model model) {
//        model.addAttribute("listPersons", personService.getAllPersons());
//        return "index";
//    }

    @GetMapping("/person/list")
    public String showPersonsList(Model model) {
        model.addAttribute("listPersons", personService.getAllPersons());
        return "person_list";
    }

    @GetMapping("/person/new")
    public String showNewPersonForm(Model model) {
        Person person = new Person();
        model.addAttribute("person", person);
        return "person_new";
    }

    @GetMapping("/person/update/{id}")
    public String showUpdatePersonForm(@PathVariable(value = "id") long id, Model model){
        Person person = personService.getPersonById(id);
        model.addAttribute("person", person);
        return "person_update";
    }

    @GetMapping("/person/delete/{id}")
    public String deletePerson(@PathVariable (value = "id") long id){
        this.personService.deletePersonById(id);
        return "redirect:/person/list";
    }

    @PostMapping("/person/save")
    public String savePerson(@ModelAttribute("person") Person person){
        personService.savePerson(person);
        return "redirect:/person/list";
    }
}

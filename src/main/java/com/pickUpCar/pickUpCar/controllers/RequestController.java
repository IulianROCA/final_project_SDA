package com.pickUpCar.pickUpCar.controllers;

import com.pickUpCar.pickUpCar.entity.Request;
import com.pickUpCar.pickUpCar.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RequestController {
    @Autowired
    private RequestService requestService;

//    @GetMapping("/")
//    public String index(Model model) {
//        model.addAttribute("listRequest", requestService.getAllRequest());
//        return "index";
//    }

    @GetMapping("/request/list")
    public String showPersonsList(Model model) {
        model.addAttribute("listRequests", requestService.getAllRequest());
        return "request_list";
    }

    @GetMapping("/request/new")
    public String showNewPersonForm(Model model) {
        Request request = new Request();
        model.addAttribute("request", request);
        return "request_new";
    }

    @GetMapping("/request/update/{id}")
    public String showUpdatePersonForm(@PathVariable(value = "id") long id, Model model){
        Request request = requestService.getRequestById(id);
        model.addAttribute("request", request);
        return "request_update";
    }

    @GetMapping("/request/delete/{id}")
    public String deleteRequest(@PathVariable (value = "id") long id){
        this.requestService.deleteRequestById(id);
        return "redirect:/request/list";
    }

    @PostMapping("/request/save")
    public String savePerson(@ModelAttribute("request") Request request){
        requestService.saveRequest(request);
        return "redirect:/request/list";
    }
}

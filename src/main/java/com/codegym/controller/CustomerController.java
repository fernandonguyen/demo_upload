package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.services.ICustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("customers")
public class CustomerController {

    @Autowired
    ICustomer customerService;

    @GetMapping
    public ModelAndView showList(){
        ModelAndView modelAndView = new ModelAndView();
        List<Customer> customers = customerService.getList();
        modelAndView.addObject("customers",customers);
        modelAndView.setViewName("list");
        return modelAndView;
     }

    @GetMapping(path = "/{id}")
    public String viewDetail(@PathVariable String id, Model model){
        Customer customer = customerService.getById(Integer.parseInt(id));
        model.addAttribute("customer",customer);
        return "detail";
    }

    @GetMapping(path = "/cus")
    public String viewDetail2(@RequestParam("id") String id, Model model){
        Customer customer = customerService.getById(Integer.parseInt(id));
        model.addAttribute("customer",customer);
        return "detail";
    }

    @GetMapping(path = "/addNew")
    public String addNew(Model model){
        model.addAttribute("customer", new Customer());
        return "register";
    }

    @PostMapping(path = "/add")
    public String add(@ModelAttribute("customer") Customer customer, BindingResult  result, Model model){
        if (result.hasErrors()) {
            return "error";
        }
        customerService.add(customer);
        return "forward:/customers";
    }

}

package com.example.demo;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DemoController {

    @GetMapping("/hello")
    public String index(Model model) {
    ModelStudent student = new ModelStudent(
        "Evelyn Tjandinegara",
        "eve",
        18,
        "11-10-2007",
        "Catholic",
        "Makassar",
        "Female",
        "Informatics",
        Arrays.asList(
            "foto1.jpeg", "foto2.jpeg", "foto3.jpeg"
        ),
        Arrays.asList(
            "cooking", "swimming", "playing bricks/LEGO"
        )
    );

    model.addAttribute("student", student);
    model.addAttribute("pageTitle", "My Biodata");

    return "biodata";
    }
}
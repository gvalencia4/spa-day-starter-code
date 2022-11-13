package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {

//    In the UserController, create a handler method displayAddUserForm() to render the form.
//    This handler should correspond to the path /user/add, and for now, it can just return the path to
//    the add.html template.

    @GetMapping("add")
    public String displayAddUserForm() {
        return "user/add";
    }

    @PostMapping("add")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        // add form submission handling code here
//        Check that the verify parameter matches the password within the user object.
//        If it does, render the user/index.html view template with a message that welcomes
//        the user by username. If the passwords don’t match, render the form again.

        if (verify.equals(user.getPassword())) {
            return "user/index";
        }

        return "user/add";
    }
}

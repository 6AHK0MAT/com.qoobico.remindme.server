package com.qoobico.remindme.server.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReminderController {

//    @Autowired
//    private ReminderService service;

    @RequestMapping(value = "/reminders", method = RequestMethod.GET)
    @ResponseBody
    public String getAllReminders() {
        return "getAllReminders";
    }

    @RequestMapping(value = "/reminders/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getReminder(@PathVariable("id") long remindID) {
        return "getReminder";
    }

    @RequestMapping(value = "/reminders", method = RequestMethod.POST)
    @ResponseBody
    public String saveRemider() {
        return "saveRemider";
    }

    @RequestMapping(value = "/reminders/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable long id) {
        return "delete";
    }

}

package com.lokesh.springboot.web.service;

import com.lokesh.springboot.web.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<Todo>();
    private static int todoCount = 3;
    static {
        todos.add(new Todo(1, "lokesh", "Learn Spring BOOT", new Date(), false));
        todos.add(new Todo(1, "lokesh", "Learn AWS", new Date(), false));
        todos.add(new Todo(1, "lokesh", "Learn Salesforce", new Date(), false));
    }

}

package com.exemplo;

import com.exemplo.controllers.*;
import com.exemplo.utils.*;
import io.javalin.Javalin;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        var app = JavalinUtils.makeApp(7070);

        IndexController indexController = new IndexController();

        app.get("/", indexController.get);
        app.get("/ola", indexController.ola);

    }
}
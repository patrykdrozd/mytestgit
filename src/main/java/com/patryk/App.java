package com.patryk;


import com.patryk.configuration.SpringConfiguration;
import com.patryk.model.User;
import com.patryk.service.UserService;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        String names[] = applicationContext.getBeanNamesForType(SessionFactory.class);
        for (String name : names)
            System.out.println(name);
        UserService userService = applicationContext.getBean(UserService.class);
//        userService.create(new User("Marek","Szpako"));


        System.out.println("Wszyscy użytkownicy: ");
        for (User u : userService.getAll()) {
            System.out.println(u);
        }
        Scanner scanner = new Scanner(System.in);
        String line;
        while ((line = scanner.nextLine()) != null) {
            System.out.print("Podaj imie jakiego szukasz: ");
            System.out.println("Znaleziono : ");
            for (User u : userService.getByName(line))
                System.out.println(u);
        }


    }
}

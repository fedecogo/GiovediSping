package fedecapiz.giovediSpring;

import fedecapiz.giovediSpring.dao.PizzaService;
import fedecapiz.giovediSpring.entities.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    PizzaService pizzaService;

    @Override
    public void run(String... args) {
        Random rndm = new Random();
        System.out.println("SALVAIMO UNA PIZZA NEL DATABAS");
        Pizza pizzaHawaii = new Pizza("hawaii", 6.50);
        pizzaService.save(pizzaHawaii);
    }
}
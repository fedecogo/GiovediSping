package fedecapiz.giovediSpring.dao;

import fedecapiz.giovediSpring.entities.Pizza;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.lang.Character.getName;

@Service
@Slf4j
public class PizzaService {
    @Autowired
    private PizzaDAO pizzaDAO;

    public void save (Pizza pizza){
        pizzaDAO.save(pizza);
        System.out.println(" la pizza è stata salvata ");
    }
}

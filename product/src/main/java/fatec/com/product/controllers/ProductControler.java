package fatec.com.product.controllers;

import org.springframework.web.bind.annotation.RestController;

import fatec.com.product.models.Product;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/products")

public class ProductControler {
    @GetMapping
    public ArrayList<Product> getProdutcs(){

        //Declara uma variável do tipo Product
        //Cria um objeto do tipo Product e atribui a variável
        Product p1 = new Product();
        p1.setId(1L);
        p1.setName("Notebook");
        p1.setPrice(2599.00);
        p1.setDescription("Notebook veio usado, tela não funciona...");
        Product p2 = new Product();
        p2.setId(2L);
        p2.setName("PC");
        p2.setPrice(5329.00);
        p2.setDescription("PC novo usado, tela não funciona...");
        Product p3 = new Product();
        p3.setId(3L);
        p3.setName("TV");
        p3.setPrice(529.00);
        p3.setDescription("Tv com tela não funciona...");

         
        ArrayList<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        return products;

    }
}

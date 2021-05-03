package deu.cse.parkslab.querytest.controller;


import com.datastax.oss.driver.api.core.uuid.Uuids;
import deu.cse.parkslab.querytest.model.Product;
import deu.cse.parkslab.querytest.repository.CassandraProductRepository;
import deu.cse.parkslab.querytest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

@CrossOrigin()
@RestController
@RequestMapping(value="/api",consumes = "application/json", produces="application/json")
public class ProductController {

    ProductRepository<Product, UUID> productRepository;

    ProductController(ProductRepository<Product,UUID> productRepository) {
        this.productRepository=productRepository;
    }

    // SELECT * FROM PRODUCT
    @GetMapping("/product")
    public ResponseEntity<List<Product>> getAllProducts(@RequestParam(required = false) String prdName) {
        try {
            List<Product> products = new ArrayList<>();

            if (prdName == null)
                products.addAll(productRepository.findAll());

            if (products.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(products, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//    @GetMapping("/Products/{id}")
//    public ResponseEntity<Product> getProductById(@PathVariable("id") String id) {
//
//    }

    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        try {
            Logger logger = Logger.getLogger(ProductController.class.getName());
            logger.log(Level.INFO,product.getProductName());
            Product _product = productRepository.save(new Product(Uuids.timeBased(), product.getProductName(), product.getProductPrice()));
            return new ResponseEntity<>(_product, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//    @PutMapping("/Products/{id}")
//    public ResponseEntity<Product> updateProduct(@PathVariable("id") String id, @RequestBody Product Product) {
//
//    }
//
//    @DeleteMapping("/Products/{id}")
//    public ResponseEntity<HttpStatus> deleteProduct(@PathVariable("id") String id) {
//
//    }
//
//    @DeleteMapping("/Products")
//    public ResponseEntity<HttpStatus> deleteAllProducts() {
//
//    }
//
//    @GetMapping("/Products/published")
//    public ResponseEntity<List<Product>> findByPublished() {
//
//    }

}

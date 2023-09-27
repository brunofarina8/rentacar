package br.com.brunofarina8.rentacar.controller;

import br.com.brunofarina8.rentacar.dto.CustomerDTO;
import br.com.brunofarina8.rentacar.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping
    public CustomerDTO create(@RequestBody CustomerDTO dto){
        return service.create(dto);
    }

    @GetMapping("/{id}")
    public CustomerDTO findById(@PathVariable("id") int id){
        return service.findById(id);
    }

    @GetMapping
    public List<CustomerDTO> findAll(){
        return service.findAll();
    }

    @PutMapping
    public CustomerDTO update(@RequestBody CustomerDTO dto){
        return service.update(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") int id){
        CustomerDTO dto = service.findById(id);
        service.delete(dto);
        return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
    }
}

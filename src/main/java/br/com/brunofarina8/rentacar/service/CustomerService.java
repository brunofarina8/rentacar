package br.com.brunofarina8.rentacar.service;

import br.com.brunofarina8.rentacar.dto.CustomerDTO;
import br.com.brunofarina8.rentacar.exception.ResourceNotFoundException;
import br.com.brunofarina8.rentacar.model.CustomerModel;
import br.com.brunofarina8.rentacar.repository.CustomerRepository;
import br.com.brunofarina8.rentacar.mapper.CustomModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public CustomerDTO create(CustomerDTO dto){
        CustomerModel model = CustomModelMapper.parseObject(dto, CustomerModel.class);
        return CustomModelMapper.parseObject(repository.save(model), CustomerDTO.class);
    }

    public CustomerDTO findById(int id){
        CustomerModel model = repository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException(null));
        return CustomModelMapper.parseObject(model, CustomerDTO.class);
    }

    public List<CustomerDTO> findAll(){
        List<CustomerModel> list = repository.findAll();
        return CustomModelMapper.parseObjectList(list, CustomerDTO.class);
    }

    public CustomerDTO update(CustomerDTO dto){
        CustomerModel model = repository.findById(dto.getId()).orElseThrow(
                () -> new ResourceNotFoundException(null));
        model = CustomModelMapper.parseObject(dto, CustomerModel.class);
        return CustomModelMapper.parseObject(repository.save(model), CustomerDTO.class);
    }

    public void delete(CustomerDTO dto){
        CustomerModel model = repository.findById(dto.getId()).orElseThrow(
                () -> new ResourceNotFoundException(null)
        );
        repository.delete(model);
    }



}

package com.meomeo.repository.impl;

import com.meomeo.model.Customer;
import com.meomeo.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CustomerRepositoryImpl implements CustomerRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Customer> findAll() {
        TypedQuery<Customer> queryCustomers = em.createQuery("select c from Customer c",Customer.class);
        return queryCustomers.getResultList();
    }

    @Override
    public Customer findById(Long id) {
        TypedQuery<Customer> queryCustomers = em.createQuery("select c from Customer c where c.id=:id",Customer.class);
        queryCustomers.setParameter("id",id);
        try{
            return queryCustomers.getSingleResult();
        }catch (NoResultException e){
            return null;
        }
    }

    @Override
    public void save(Customer customer) {
        if(customer.getId() != null){
            em.merge(customer);
        }else{
            em.persist(customer);
        }
    }

    @Override
    public void remove(Long id) {
        Customer customer = findById(id);
        if(customer != null){
            em.remove(customer);
        }
    }
}

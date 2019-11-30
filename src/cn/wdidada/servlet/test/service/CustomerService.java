package cn.wdidada.servlet.test.service;

import cn.wdidada.servlet.test.dao.CustomerDao;
import cn.wdidada.servlet.test.domain.Customer;
import cn.wdidada.servlet.test.domain.PageBean;

/**
 * Created by codingBoy on 16/10/23.
 */
public class CustomerService
{
    CustomerDao customerDao=new CustomerDao();

    public void add(Customer customer)
    {
        customerDao.add(customer);
    }

//    public List<Customer> findAll()
//    {
//        return customerDao.findAll();
//    }
    public PageBean<Customer> findAll(int pc,int pr)
    {
        return customerDao.findAll(pc,pr);
    }

    public Customer find(String id)
    {
        return customerDao.find(id);
    }

    public void edit(Customer customer)
    {
        customerDao.edit(customer);
    }

    public void delete(String id)
    {
        customerDao.delete(id);
    }

    public PageBean<Customer> query(Customer customer,int pc,int pr)
    {
        return customerDao.query(customer,pc,pr);


    }

}

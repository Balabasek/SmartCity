package service;

import dao.GenericDao;
import dao.impl.GenericDaoImpl;
import table.User;

import java.util.List;

public class UserService {
    private GenericDao userDao = new GenericDaoImpl(User.class);

    public UserService(){

    }

    public void save (User user){
        userDao.create(user);
    }

    public void delete (User user){
        userDao.delete(user);
    }

    public void update (User user){
        userDao.update(user);
    }

    public List<User> findAll (){
        return userDao.findAll();
    }
}

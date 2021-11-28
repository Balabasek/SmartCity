package service;

import dao.GenericDao;
import dao.impl.GenericDaoImpl;
import table.Device;

import java.util.List;

public class DeviceService {
    private GenericDao deviceDao = new GenericDaoImpl(Device.class);

    public DeviceService(){

    }

    public void save (Device device){
        deviceDao.create(device);
    }

    public void delete (Device device){
        deviceDao.delete(device);
    }

    public void update (Device device){
        deviceDao.update(device);
    }

    public List<Device> findAll (){
        return deviceDao.findAll();
    }
}

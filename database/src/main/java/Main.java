import service.DeviceService;
import service.UserService;
import table.Device;
import table.User;


public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        DeviceService deviceService = new DeviceService();




//        User user = new User("Pavel", 19);
//        userService.save(user);
        User user1 = new User("So", 29);

//
        Device device = new Device("laptop");
        deviceService.save(device);
        user1.addDevice(device);
        userService.save(user1);


        deviceService.findAll().forEach(System.out::println);
    }
}

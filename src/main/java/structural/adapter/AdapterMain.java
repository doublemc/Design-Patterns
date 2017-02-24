package structural.adapter;

/**
 * Created by michal on 24.02.17.
 *
 * http://www.oodesign.com/adapter-pattern.html
 */
class AdapterMain {
    public static void main(String[] args) {

        DeviceManagement deviceManagement = new DeviceManagementImpl();
        System.out.println("Device name: " + deviceManagement.getDeviceName());
        deviceManagement.setDeviceName("Cisco 123");
        System.out.println("New device name: " + deviceManagement.getDeviceName());
    }
}

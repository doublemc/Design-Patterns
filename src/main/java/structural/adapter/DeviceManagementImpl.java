package structural.adapter;

/**
 * Created by michal on 24.02.17.
 */
class DeviceManagementImpl implements DeviceManagement {
    private DeviceAccess deviceAccess;

    public DeviceManagementImpl() {
        deviceAccess = new DeviceAccessImpl();
    }

    @Override
    public String getDeviceName() {
        return deviceAccess.getdeviceName();
    }

    @Override
    public void setDeviceName(String deviceName) {
        deviceAccess.setdeviceName(deviceName);
    }

    @Override
    public String getDeviceSOftwareVersion() {
        return deviceAccess.getdeviceSoftwareVersion();
    }
}

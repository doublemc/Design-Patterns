package structural.adapter;

/**
 * Created by michal on 24.02.17.
 */
interface DeviceAccess {
    String getdeviceName();
    void setdeviceName(String deviceName);
    String getdeviceSoftwareVersion();
    void bakcupDeviceConfig();
}

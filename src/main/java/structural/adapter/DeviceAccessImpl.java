package structural.adapter;

/**
 * Created by michal on 24.02.17.
 */
// low-level device access implementation we want to decouple from
class DeviceAccessImpl implements DeviceAccess {
    private String deviceName = null;

    // provided by a device programmer, no camelCase used but we will fix that (not only that ofc) using adapter
    @Override
    public String getdeviceName() {
        if (deviceName == null) {
            return "Super Extraordinary Device";
        }
        return deviceName;
    }

    @Override
    public void setdeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public String getdeviceSoftwareVersion() {
        return "Super Extraordinary Device 2.05";
    }

    @Override
    public void bakcupDeviceConfig() {
        System.out.println("Now starting backing up the device's config");
    }
}

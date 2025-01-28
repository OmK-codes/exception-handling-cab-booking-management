package com.omkcodes.project.model;

public class Driver {
    private String driverId;
    private String driverName;
    private String phone;
    private String licenseNumber;
    private int totalTrips;
    private boolean onlineStatus;

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getTotalTrips() {
        return totalTrips;
    }

    public void setTotalTrips(int totalTrips) {
        this.totalTrips = totalTrips;
    }

    public boolean isOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(boolean onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverId='" + driverId + '\'' +
                ", driverName='" + driverName + '\'' +
                ", phone='" + phone + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", totalTrips=" + totalTrips +
                ", onlineStatus=" + onlineStatus +
                '}';
    }
}


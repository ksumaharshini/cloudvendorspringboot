package com.example.RestdemoShowoff3.model;

public class cloudvendor {
    private String vendorID;
    private String vendorName;
    private String vendorAddress;
    private String vendorphn;
    public cloudvendor() {
    }
    public cloudvendor(String vendorID, String vendorName, String vendorAddress, String vendorphn) {
        this.vendorID = vendorID;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorphn = vendorphn;
    }
    public String getVendorID() {
        return vendorID;
    }
    public String getVendorName() {
        return vendorName;
    }
    public String getVendorAddress() {
        return vendorAddress;
    }
    public String getVendorphn() {
        return vendorphn;
    }
    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }
    public void setVendorphn(String vendorphn) {
        this.vendorphn = vendorphn;
    }
    @Override
    public String toString() {
        return "cloudvendor [vendorID=" + vendorID + ", vendorName=" + vendorName + ", vendorAddress=" + vendorAddress
                + ", vendorphn=" + vendorphn + "]";
    }
    
}

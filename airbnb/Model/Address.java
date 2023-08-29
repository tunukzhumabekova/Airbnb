package airbnb.Model;

public class Address {
    private int	id;
            private String	province;
            private String	region;
            private String	address;
            private static int idd=1;

    public Address( String province, String region, String address) {
        if (province == null || province.isEmpty()) {
            throw new IllegalArgumentException("Province cannot be null or empty");
        }
        if (region == null || region.isEmpty()) {
            throw new IllegalArgumentException("Region cannot be null or empty");
        }
        if (address == null || address.isEmpty()) {
            throw new IllegalArgumentException("Address cannot be null or empty");
        }
        this.id = idd++;
        this.province = province;
        this.region = region;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    @Override
    public String toString() {
        return "Address" +
                "id=" + id +
                "\nprovince=" + province  +
                " \nregion=" + region +
                " \naddress=" + address ;
    }
}

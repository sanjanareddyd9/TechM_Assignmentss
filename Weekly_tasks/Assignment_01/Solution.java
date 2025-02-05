package assignment31;

class TravelAgencies {
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;

    public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFlightFacility() {
        return flightFacility;
    }

    public void setFlightFacility(boolean flightFacility) {
        this.flightFacility = flightFacility;
    }
}

public class Solution {

    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] agencies) {
        int highestPrice = 0;
        for (TravelAgencies agency : agencies) {
            if (agency.getPrice() > highestPrice) {
                highestPrice = agency.getPrice();
            }
        }
        return highestPrice;
    }

    public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies[] agencies, int regNo, String packageType) {
        for (TravelAgencies agency : agencies) {
            if (agency.getRegNo() == regNo && agency.getPackageType().equalsIgnoreCase(packageType) && agency.isFlightFacility()) {
                return agency;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TravelAgencies[] agencies = new TravelAgencies[]{
            new TravelAgencies(123, "A2Z Agency", "Platinum", 50000, true),
            new TravelAgencies(345, "SSS Agency", "Gold", 30000, false),
            new TravelAgencies(987, "Cox and Kings", "Diamond", 40000, true),
            new TravelAgencies(888, "Global Tours", "Silver", 20000, false)
        };

        int highestPackagePrice = findAgencyWithHighestPackagePrice(agencies);
        System.out.println(highestPackagePrice);

        TravelAgencies agency = agencyDetailsForGivenIdAndType(agencies, 987, "Diamond");
        if (agency != null) {
            System.out.println(agency.getAgencyName() + ":" + agency.getPrice());
        } else {
            System.out.println("No matching agency found");
        }
    }
}


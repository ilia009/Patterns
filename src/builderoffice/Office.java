package builderoffice;

public class Office {
    private String title;
    private String district;
    private String exactAddress;
    private int seatsNum;
    private int canteenNum;
    private boolean isSubArend;

    private Office(String title, String district, String exactAddress, int seatsNum, int canteenNum, boolean isSubArend) {
        this.title = title;
        this.district = district;
        this.exactAddress = exactAddress;
        this.seatsNum = seatsNum;
        this.canteenNum = canteenNum;
        this.isSubArend = isSubArend;
    }

    public String getTitle() {
        return title;
    }

    public String getDistrict() {
        return district;
    }

    public String getExactAddress() {
        return exactAddress;
    }

    public int getSeatsNum() {
        return seatsNum;
    }

    public int getCanteenNum() {
        return canteenNum;
    }

    public boolean isSubArend() {
        return isSubArend;
    }

    public static OfficeBuilder builder() {
        return new OfficeBuilder();
    }

    public static class OfficeBuilder {
        private String title;
        private String district;
        private String exactAddress;
        private int seatsNum;
        private int canteenNum;
        private boolean isSubArend;

        public OfficeBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public OfficeBuilder setDistrict(String district) {
            this.district = district;
            return this;
        }

        public OfficeBuilder setExactAddress(String exactAddress) {
            this.exactAddress = exactAddress;
            return this;
        }

        public OfficeBuilder setSeatsNum(int seatsNum) {
            this.seatsNum = seatsNum;
            return this;
        }

        public OfficeBuilder setCanteenNum(int canteenNum) {
            this.canteenNum = canteenNum;
            return this;
        }

        public OfficeBuilder setSubArend(boolean subArend) {
            isSubArend = subArend;
            return this;
        }

        public Office build() {
            return new Office(title, district, exactAddress, seatsNum, canteenNum, isSubArend);
        }
    }
}

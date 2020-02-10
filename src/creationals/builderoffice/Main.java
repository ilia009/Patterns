package creationals.builderoffice;

public class Main {
    public static void main(String[] args) {

        Office office = Office.builder()
                .setTitle("MyOffice")
                .setCanteenNum(99)
                .setDistrict("soloma")
                .setSeatsNum(70)
                .build();

        Office anotherOfice = Office.builder()
                .setTitle("MyOffice")
                .setDistrict("Podol")
                .build();

        showOffice(office);
        System.out.println();
        showOffice(anotherOfice);
    }

    private static void showOffice(Office office) {
        String report;
        report = office.getTitle() + "\n" + office.getDistrict() + "\n" + office.getExactAddress() + "\n" + office.getCanteenNum() + "\n" + office.getSeatsNum();
        System.out.println(report);
    }


}

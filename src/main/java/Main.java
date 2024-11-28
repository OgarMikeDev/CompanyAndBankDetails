public class Main {
    public static void main(String[] args) {
        BankDetails bankDetails = new BankDetails(
                "40702810500120002155", "234234",
                "242434234", "Сбербанк", "Сочи"
        );


        Company company = new Company("Смарт-экспресс", bankDetails);

        bankDetails.setBillNumber("30702810500120002155");

        System.out.println("Инф-я о компании: " + company);
    }
}

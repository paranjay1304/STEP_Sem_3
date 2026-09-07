class FeeAccount {
    void pay() {
        System.out.println("Paid in one go (day-scholar account)");
    }
}

class HostelFeeAccount extends FeeAccount {
    @Override
    void pay() {
        System.out.println("Paid in two installments (hostel account)");
    }
}

public class M5 {
    public static void main(String[] args) {
        FeeAccount[] accounts = {
                new HostelFeeAccount(), new HostelFeeAccount(),
                new FeeAccount(), new FeeAccount()
        };

        int hostel = 0, dayScholar = 0;

        for (FeeAccount account : accounts) {
            if (account != null) {
                if (account instanceof HostelFeeAccount hostelFeeAccount) {
                    hostelFeeAccount.pay();
                    hostel++;
                } else {
                    account.pay();
                    dayScholar++;
                }
            }
        }

        System.out.println("Hostel accounts processed: " + hostel
                + " | Day-scholar accounts processed: " + dayScholar);
    }
}
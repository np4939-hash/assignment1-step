package main.java.week4.assignment_problems;

public class Payment {

    // Normal payment
    void pay(double amount) {
        System.out.println("Paid (cash): Rs " + amount);
    }

    // Process transaction
    static double processTransaction(Payment payment, double amount) {

        if (payment instanceof CardPayment) {

            CardPayment card = (CardPayment) payment;

            return card.payWithProcessingFee(amount);

        } else {

            payment.pay(amount);

            return amount;
        }
    }

    public static void main(String[] args) {

        Payment[] payments = {
            new CardPayment(),
            new Payment(),
            new CardPayment(),
            new Payment(),
            new CardPayment()
        };

        double[] amounts = {
            100, 50, 200, 75, 120
        };

        double totalCollected = 0;

        for (int i = 0; i < payments.length; i++) {

            totalCollected =
                totalCollected +
                processTransaction(payments[i], amounts[i]);
        }

        System.out.println(
            "Total Collected: Rs " + totalCollected
        );
    }
}


// Card payment class
class CardPayment extends Payment {

    double payWithProcessingFee(double amount) {

        double total = amount + (amount * 2 / 100);

        System.out.println(
            "Charged (card, incl. fee): Rs " + total
        );

        return total;
    }
}
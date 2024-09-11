public class Payment {
    public int paymentId;
    public Reservation reservation;
    public PaymentStatus status;
    public int getPaymentId() {
        return paymentId;
    }
    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }
    public Reservation getReservation() {
        return reservation;
    }
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
    public PaymentStatus getStatus() {
        return status;
    }
    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public void pay(Reservation reservation) {
        this.reservation = reservation;
        this.status = PaymentStatus.PAID;
    }

    
}

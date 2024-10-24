package ParkingLot.models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel
{
    private Ticket ticket;
    private Gate gate;
    private BillStatus billStatus;
    private int amount;
    private List<Payment> payment;
    private Date ExitTime;
    private FeeCalculationStretegyType feeCalculationStretegyType;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public List<Payment> getPayment() {
        return payment;
    }

    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }

    public Date getExitTime() {
        return ExitTime;
    }

    public void setExitTime(Date exitTime) {
        ExitTime = exitTime;
    }

    public FeeCalculationStretegyType getFeeCalculationStretegyType() {
        return feeCalculationStretegyType;
    }

    public void setFeeCalculationStretegyType(FeeCalculationStretegyType feeCalculationStretegyType) {
        this.feeCalculationStretegyType = feeCalculationStretegyType;
    }
}

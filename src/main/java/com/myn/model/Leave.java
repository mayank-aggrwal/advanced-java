package com.myn.model;

public class Leave {
    private final String leaveTypeApiName;
    private final String leaveTypeLabel;
    private final Double quantity;
    private final String unitOfTime;

    public Leave(final String leaveTypeApiName, final String leaveTypeLabel, final Double quantity, final String unitOfTime) {
        this.leaveTypeApiName = leaveTypeApiName;
        this.leaveTypeLabel = leaveTypeLabel;
        this.quantity = quantity;
        this.unitOfTime = unitOfTime;
    }

    public String getLeaveTypeApiName() {
        return leaveTypeApiName;
    }

    public String getLeaveTypeLabel() {
        return leaveTypeLabel;
    }

    public Double getQuantity() {
        return quantity;
    }

    public String getUnitOfTime() {
        return unitOfTime;
    }

    @Override
    public String toString() {
        return "Leave [leaveTypeApiName='" +
                this.leaveTypeApiName +
                "', leaveTypeLabel='" +
                this.leaveTypeLabel +
                "', quantity=" +
                this.quantity +
                ", unitOfTime='" +
                this.unitOfTime +
                "']";
    }
}

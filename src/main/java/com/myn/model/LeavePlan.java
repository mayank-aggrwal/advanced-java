package com.myn.model;

import java.util.List;

public class LeavePlan {
    private final String leavePlanApiname;
    private final String leavePlanLabel;
    private final List<Leave> leaves;

    public LeavePlan(final String leavePlanApiname, final String leavePlanLabel, final List<Leave> leaves) {
        this.leavePlanApiname = leavePlanApiname;
        this.leavePlanLabel = leavePlanLabel;
        this.leaves = leaves;
    }

    public String getLeavePlanApiname() {
        return leavePlanApiname;
    }

    public String getLeavePlanLabel() {
        return leavePlanLabel;
    }

    public List<Leave> getLeaves() {
        return leaves;
    }

    @Override
    public String toString() {
        return "LeavePlan [leavePlanApiname=" +
                this.leavePlanApiname +
                "', leavePlanLabel='" +
                this.leavePlanLabel +
                "', leaves={" +
                this.leaves +
                "}]";
    }
}

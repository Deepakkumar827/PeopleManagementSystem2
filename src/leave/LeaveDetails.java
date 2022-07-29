package leave;

import java.time.LocalDate;

public class LeaveObject {
    int id;
    int year;
    int  casualLeave;
    int earnedLeave;
    int  leaveWithoutPay;
    int paternityLeave;
    int sabbaticalLeave;
    int sickLeave;
   /* LocalDate from;
    LocalDate to;
    LocalDate timeOfApply;
    String reason;*/


    public LeaveObject(int id, int year) {
        this.id = id;
        this.year = year;
        casualLeave=6;
        earnedLeave=6;
        leaveWithoutPay=6;
        paternityLeave=6;
        sabbaticalLeave=6;
        sickLeave=6;
    }

    public LeaveObject(int id, int year, int casualLeave, int earnedLeave, int leaveWithoutPay, int paternityLeave, int sabbaticalLeave, int sickLeave) {
        this.id = id;
        this.year=year;
        this.casualLeave = casualLeave;
        this.earnedLeave = earnedLeave;
        this.leaveWithoutPay = leaveWithoutPay;
        this.paternityLeave = paternityLeave;
        this.sabbaticalLeave = sabbaticalLeave;
        this.sickLeave = sickLeave;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public int getCasualLeave() {
        return casualLeave;
    }

    public int getEarnedLeave() {
        return earnedLeave;
    }

    public int getLeaveWithoutPay() {
        return leaveWithoutPay;
    }

    public int getPaternityLeave() {
        return paternityLeave;
    }

    public int getSabbaticalLeave() {
        return sabbaticalLeave;
    }

    public int getSickLeave() {
        return sickLeave;
    }


    ////////


    public void chaCasualLeave(int casualLeave) {
        this.casualLeave = casualLeave;
    }

    public void setEarnedLeave(int earnedLeave) {
        this.earnedLeave = earnedLeave;
    }

    public void setLeaveWithoutPay(int leaveWithoutPay) {
        this.leaveWithoutPay = leaveWithoutPay;
    }

    public void setPaternityLeave(int paternityLeave) {
        this.paternityLeave = paternityLeave;
    }

    public void setSabbaticalLeave(int sabbaticalLeave) {
        this.sabbaticalLeave = sabbaticalLeave;
    }

    public void setSickLeave(int sickLeave) {
        this.sickLeave = sickLeave;
    }
}

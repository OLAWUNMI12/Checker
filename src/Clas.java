import javax.swing.*;
import java.awt.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;


public class Clas {
    int year = 0;
    int month = 0;
    int date = 0;
    String title = "BIRTHDAY CHECKER";

    public Clas() {
    }

    public void setYear() {
        try {
            String questY = "ENTER YEAR";
            String yj = JOptionPane.showInputDialog((Component)null, questY, this.title, 3);
            this.year = Integer.parseInt(yj);
        } catch (NumberFormatException var3) {
            ;
        }

    }

    public void setMonth() {
        try {
            String questM = "ENTER MONTH (1-12)";
            String mj = JOptionPane.showInputDialog((Component)null, questM, this.title, 3);
            this.month = Integer.parseInt(mj);
        } catch (NumberFormatException var3) {
            ;
        }

    }

    public void setDate() {
        try {
            String questD = "ENTER DATE";
            String dj = JOptionPane.showInputDialog((Component)null, questD, this.title, 3);
            this.date = Integer.parseInt(dj);
        } catch (NumberFormatException var3) {
            ;
        }

    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDate() {
        return this.date;
    }

    public int computeDOW() {
        String err1 = "INVALID INPUT!!! ";

        try {
            DayOfWeek day = LocalDate.of(this.year, Month.of(this.month), this.date).getDayOfWeek();
            String output1 = "Your birthday in " + this.year + " will be celeberated on " + day;
            String output2 = "Your birthday in " + this.year + " was celeberated on " + day;
            if (this.year >= 2019) {
                JOptionPane.showMessageDialog((Component)null, output1, this.title, 1);
            } else if (this.year < 2019) {
                JOptionPane.showMessageDialog((Component)null, output2, this.title, 1);
            }
        } catch (Exception var5) {
            JOptionPane.showMessageDialog((Component)null, err1, this.title, 0);
        }

        return 0;
    }

    public int notif() {
        String out = "This program is designed to check the \nDAY OF THE WEEK that corresponds to\nyour birth-date in any YEAR.\nClick OK to continue.....";
        JOptionPane.showMessageDialog((Component)null, out, this.title, 1);
        return 0;
    }

    public static void main(String[] args) {
        Clas dow = new Clas();
        dow.notif();
        dow.setYear();
        dow.setMonth();
        dow.setDate();
        dow.computeDOW();
    }
}

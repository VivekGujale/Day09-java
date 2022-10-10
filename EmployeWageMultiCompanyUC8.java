//Refactor the Code to write a Class Method to Compute Employee Wage - Use Class Method and Class

public class EmployeWageMultiCompanyUC8 {
    public static final int isPartTime = 1;
    public static final int isFullTime = 2;

    public static int EmpWage(String company, int empRatePerHr,
                              int MaxHrsInMonth, int numWorkingDays) {

        int empHrs = 0, totalEmpHrs = 0, empWage, totalEmpWage;
        int totalWorkingDays = 0;
        while (totalEmpHrs <= MaxHrsInMonth && totalWorkingDays <= numWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10 % 3);
            if (empCheck == isPartTime) {
                empHrs = 8;
            } else if (empCheck == isFullTime) {
                empHrs = 16;
            } else {
                empHrs = 0;
            }
            totalEmpHrs = totalEmpHrs + empHrs;
            System.out.println("Days:" + totalWorkingDays + "Emp Hrs:" + empHrs);
        }
        totalEmpWage = totalEmpHrs * empRatePerHr;
        System.out.println("Total Employee Wage for month = " + totalEmpWage);
        return isPartTime;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");
        EmployeWageMultiCompanyUC8.EmpWage("Relience", 20,100,20);
        EmployeWageMultiCompanyUC8.EmpWage("TCS", 10, 150, 15);
        EmployeWageMultiCompanyUC8.EmpWage("Infosys", 15, 125, 22);

        }
    }

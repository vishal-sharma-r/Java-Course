package reporting;

import domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter {

    public EmployeeReportFormatter(Employee anEmployee, FormatType formatType) {
        super(anEmployee, formatType);
    }

    public String getFormattedEmployee() {
        return getFormattedValue();
    }
}
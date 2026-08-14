import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

public class DateComboBox extends Frame implements ItemListener {

    Choice dayChoice;
    Choice monthChoice;
    Choice yearChoice;

    Label dateLabel;

    DateComboBox() {

        setTitle("Date Selection");
        setSize(500, 250);
        setLayout(null);

        // Heading
        Label heading = new Label("Select Date");
        heading.setBounds(200, 50, 100, 30);
        add(heading);

        // Day Combo Box
        dayChoice = new Choice();

        for (int i = 1; i <= 31; i++) {
            dayChoice.add(String.format("%02d", i));
        }

        dayChoice.select("01");
        dayChoice.setBounds(80, 100, 80, 30);
        add(dayChoice);

        // Month Combo Box
        monthChoice = new Choice();

        String[] months = {
            "01", "02", "03", "04", "05", "06",
            "07", "08", "09", "10", "11", "12"
        };

        for (String month : months) {
            monthChoice.add(month);
        }

        monthChoice.select("01");
        monthChoice.setBounds(200, 100, 80, 30);
        add(monthChoice);

        // Year Combo Box
        yearChoice = new Choice();

        for (int year = 1990; year <= 2050; year++) {
            yearChoice.add(String.valueOf(year));
        }

        yearChoice.select("2000");
        yearChoice.setBounds(320, 100, 80, 30);
        add(yearChoice);

        // Displayed Date
        dateLabel = new Label("Selected Date: 01/01/2000");
        dateLabel.setBounds(160, 150, 220, 30);
        add(dateLabel);

        // Add event listeners
        dayChoice.addItemListener(this);
        monthChoice.addItemListener(this);
        yearChoice.addItemListener(this);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    // Handle combo box selection
    public void itemStateChanged(ItemEvent e) {

        int day = Integer.parseInt(dayChoice.getSelectedItem());
        int month = Integer.parseInt(monthChoice.getSelectedItem());
        int year = Integer.parseInt(yearChoice.getSelectedItem());

        // Check whether the selected date is valid
        Calendar cal = Calendar.getInstance();

        cal.setLenient(false);

        try {

            cal.set(year, month - 1, day);

            // Get the selected date
            int validDay = cal.get(Calendar.DAY_OF_MONTH);
            int validMonth = cal.get(Calendar.MONTH) + 1;
            int validYear = cal.get(Calendar.YEAR);

            dateLabel.setText(
                String.format(
                    "Selected Date: %02d/%02d/%04d",
                    validDay,
                    validMonth,
                    validYear
                )
            );

        } catch (IllegalArgumentException ex) {

            dateLabel.setText("Invalid Date!");
        }
    }

    public static void main(String[] args) {

        new DateComboBox();
    }
}
/*
 * Final Version
 * Fully Functioning
 * 
 * EDIT:
 * NOPE! DOES NOT WORK ACCURATELY ALWAYS. DO NOT USE 
 * 
 * 
 */

package com.demo.zpersonal;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ExactDateTimeDifferenceCalculator2 extends JFrame {

	SimpleDateFormat generalFormat = new SimpleDateFormat("MM/dd/yyyy");

	// JFrame Components Used
	static private JTextField textField1 = new JTextField();
	private JTextField textField2 = new JTextField();
	private JButton button = new JButton();
	private JLabel label = new JLabel();
	private JTextArea textArea = new JTextArea();
	private JScrollPane scrollPane = new JScrollPane();
	// ADDED!vvv
	private JCheckBox checkToday = new JCheckBox();
	private JCheckBox inclusive = new JCheckBox();

	// newline add-on for ease
	String newLine = "\n";

	// divider+newLine
	String divider = "~~~~~~~~~~~~~~~~~~~~~~";

	// to check validity of date value later on...
	int realDateCheck = 0;

	// check inclusive date
	boolean checkInclusive = false;

	// credit
	ImageIcon icon = new ImageIcon(
			(getClass().getResource("dateCalculatorIcon.jpg")));
	private JButton creditButton = new JButton();

	ExactDateTimeDifferenceCalculator2() {
		// set title of window
		super("Date Difference Calculator");

		// set title bar icon of window
		super.setIconImage(icon.getImage());

		// initialize previously defined variables
		textField1 = new JTextField("Start Date Here", 15);
		textField2 = new JTextField("End Date Here", 15);
		button = new JButton("Difference");
		label = new JLabel("MM/DD/YYYY");
		textArea = new JTextArea(10, 21);
		scrollPane = new JScrollPane(textArea);
		// ADDED!vvv
		checkToday = new JCheckBox("Today");
		inclusive = new JCheckBox("Inclusive");
		checkToday.setSelected(false);
		inclusive.setSelected(false);
		// getClass refers to THIS class. getResource(param) means get resource
		// for (THIS) with the string name of it as param
		creditButton = new JButton("Credit", icon);

		// add all visual components to window
		setLayout(new FlowLayout());
		add(label);
		add(textField1);
		add(textField2);
		add(checkToday);
		add(inclusive);
		add(scrollPane);
		add(button);
		add(creditButton);

		// creditButton actionlistener
		creditButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(creditButton,
						"Creator: Arjun Bawa", "Credit",
						JOptionPane.INFORMATION_MESSAGE, icon);

			}
		});

		// button actionlistener
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {

				// Part 1 vvv
				// get text of textfields as strings, split it up into
				// 3 parts (the "/" being the divider),
				String inDateString1 = textField1.getText().trim();
				String[] inDateString1Parts = inDateString1.split("/");
				String inDateString2 = textField2.getText().trim();
				String[] inDateString2Parts = inDateString2.split("/");

				// define a date format
				SimpleDateFormat myFormat = new SimpleDateFormat("MM/dd/yyyy");
				// initialize 2 date objects
				Date myDater1 = null, myDater2 = null;

				// try to parse inputs into date formats
				try {
					myDater1 = myFormat.parse(inDateString1);
					myDater2 = myFormat.parse(inDateString2);

				} catch (ParseException e) {
					System.out.println("Wrong Date Format! use MM/DD/YYYY");

					textArea.append("Wrong Date Format! use MM/DD/YYYY"
							+ newLine + divider + newLine);
				}

				// Part 2 vv
				// and turn the year, month and day values into integers for
				// validity
				// checks
				int inDate1Month = Integer.parseInt(inDateString1Parts[0]);
				int inDate1Days = Integer.parseInt(inDateString1Parts[1]);
				int inDate1Year = Integer.parseInt(inDateString1Parts[2]);
				int inDate2Month = Integer.parseInt(inDateString2Parts[0]);
				int inDate2Days = Integer.parseInt(inDateString2Parts[1]);
				int inDate2Year = Integer.parseInt(inDateString2Parts[2]);

				// validity check: input can only be 10 chars
				if ((inDateString1.length() > 10)
						|| (inDateString2.length() > 10)) {
					System.out.println("Wrong Date Format! use MM/DD/YYYY");

					textArea.append("Wrong Date Format! use MM/DD/YYYY"
							+ newLine + divider + newLine);
					realDateCheck++;
				}

				// the differences of year month day values between two dates as
				// integers
				int yearsDiff = myDater2.getYear() - myDater1.getYear();
				int monthsDiff = myDater2.getMonth() - myDater1.getMonth();
				int daysDiff = myDater2.getDate() - myDater1.getDate();

				// 3 calendars out of:
				// first input
				// 2nd input
				// Difference between them
				Calendar cal = new GregorianCalendar(yearsDiff, monthsDiff,
						daysDiff);

				Calendar myDater1Cal = new GregorianCalendar(
						myDater1.getYear(), myDater1.getMonth() + 1, myDater1
								.getDate());
				Calendar myDater2Cal = new GregorianCalendar(
						myDater2.getYear(), myDater2.getMonth() + 1, myDater2
								.getDate());

				// Validity check: if month value of either inputs is more than
				// 12,
				// mark as fake date
				if ((inDate1Month > 12) || (inDate2Month > 12)) {
					textArea.append("Input dates' month value(s) non-existant"
							+ newLine + divider + newLine);
					realDateCheck = 1;
				}

				// validity check: if day values of either inputs is more than
				// their respective month values allow them to be (that is, days
				// value
				// is more than the total # of days in the month associated with
				// the date in
				// question), mark as fake date

				int totalDaysInMonth1 = myDater1Cal
						.getActualMaximum(Calendar.DATE);
				int totalDaysInMonth2 = myDater2Cal
						.getActualMaximum(Calendar.DATE);

				if (((inDate1Month == 2) || (inDate1Month == 02))
						&& ((inDate1Year % 4) == 0)) {
					totalDaysInMonth1 = 29;
				} else if (((inDate1Month == 2) || (inDate1Month == 02))
						&& ((inDate1Year % 4) != 0)) {
					totalDaysInMonth1 = 28;
				}
				if (((inDate2Month == 2) || (inDate2Month == 02))
						&& ((inDate2Year % 4) == 0)) {
					totalDaysInMonth2 = 29;
				} else if (((inDate2Month == 2) || (inDate2Month == 02))
						&& ((inDate2Year % 4) != 0)) {
					totalDaysInMonth2 = 28;
				}

				if ((inDate1Days > totalDaysInMonth1)
						|| (inDate2Days > totalDaysInMonth2)) {
					textArea.append("Input dates' day value(s) non-existant"
							+ newLine + divider + newLine);
					realDateCheck++;
				}

				// compute limitation: if year value of either input is more
				// than 99999,
				// say the year difference is too much
				if ((myDater1.getYear() > 99999)
						|| (myDater2.getYear() > 99999)) {
					textArea.append("Year difference too big" + newLine
							+ "Maximum date year input: 99999" + newLine
							+ divider);
					realDateCheck++;
				}

				// conversions from days to months to years
				if (daysDiff > cal.getActualMaximum(Calendar.DATE)) {
					monthsDiff++;
					daysDiff -= cal.getActualMaximum(Calendar.DATE);
				}

				if (daysDiff < 0) {
					monthsDiff--;
					daysDiff += cal.getActualMaximum(Calendar.DATE) + 1;
				}

				if (monthsDiff > 11) {
					yearsDiff++;
					monthsDiff -= 12;
				}

				if (monthsDiff < 0) {
					yearsDiff--;
					monthsDiff += 12;
				}

				// validity check: if start date is past end date...
				if ((yearsDiff < 0) || (monthsDiff < 0) || (daysDiff < 0)) {
					textArea.append("Start Date is past End Date" + newLine
							+ divider + newLine);
					realDateCheck++;
				}
				if ((yearsDiff == 0) && (monthsDiff == 0) && (daysDiff == 0)) {
					textArea.append("Start Date and End Date are same"
							+ newLine + divider + newLine);
					realDateCheck++;
				}

				// outputs
				if (realDateCheck == 0) {

					if (checkInclusive == true)
						daysDiff++;
					if (inDate1Month == 2 || inDate1Month == 02
							&& (inDate1Year % 4) == 0 && inclusive.isSelected())
						daysDiff -= 3;
					else if (inDate1Month == 2 || inDate1Month == 02
							&& (inDate1Year % 4) == 0
							&& !inclusive.isSelected())
						daysDiff -= 4;

					String yearString = String.valueOf(Math.round(yearsDiff));
					String monthString = String.valueOf(Math.round(monthsDiff));
					String dayString = String.valueOf(Math.round(daysDiff));

					textArea.append("Years: " + yearString + newLine
							+ "Months: " + monthString + newLine + "Days: "
							+ dayString + newLine + divider + newLine);

				} else {
					textArea.append("No real result" + newLine + divider
							+ newLine);
					realDateCheck = 0;
				}

			}

		});

		// checkbox listeners
		checkToday.addItemListener(new ItemListener() {

			public void itemStateChanged(ItemEvent e) {

				if (e.getStateChange() == ItemEvent.SELECTED) {
					Date date = new Date();
					textField1.setText(generalFormat.format(date));
				}
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					textField1.setText("Start Date Here");
				}

			}

		});

		inclusive.addItemListener(new ItemListener() {

			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (e.getStateChange() == ItemEvent.SELECTED)
					checkInclusive = true;
				if (e.getStateChange() == ItemEvent.DESELECTED)
					checkInclusive = false;
			}

		});

	}
}

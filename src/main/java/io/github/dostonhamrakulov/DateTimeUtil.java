package io.github.dostonhamrakulov;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtil {

    private static final String DAY_MONTH_YEAR_PATTERN = "dd-MM-yyyy";
    private static final String HOUR_PATTERN = "HH";
    private static final String MINUTE_PATTERN = "mm";

    private DateTimeUtil() {
    }

    public static String convertToString(final LocalDate localDate) {
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DAY_MONTH_YEAR_PATTERN);
        return localDate.format(formatter);
    }

    public static LocalDate convertToDate(final String dateAsText) {
        return LocalDate.parse(dateAsText, DateTimeFormatter.ofPattern(DAY_MONTH_YEAR_PATTERN));
    }

    /**
     * Convert hour to string format (2 digits)
     */
    public static String convertHourToString(int hour) {
        return String.format("%02d", hour);
    }

    /**
     * Convert minute to string format (2 digits)
     */
    public static String convertMinuteToString(int minute) {
        return String.format("%02d", minute);
    }

    /**
     * Parse hour from string
     */
    public static int parseHour(String hourText) {
        return Integer.parseInt(hourText);
    }

    /**
     * Parse minute from string
     */
    public static int parseMinute(String minuteText) {
        return Integer.parseInt(minuteText);
    }

    /**
     * Convert date and time to LocalDateTime
     */
    public static LocalDateTime convertToLocalDateTime(final LocalDate date, final LocalTime time) {
        return LocalDateTime.of(date, time);
    }

    /**
     * Format LocalDateTime to string
     */
    public static String formatLocalDateTime(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DAY_MONTH_YEAR_PATTERN + " HH:mm");
        return dateTime.format(formatter);
    }
}

package io.github.dostonhamrakulov;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link DateTimeUtil}
 */
public class DateTimeUtilTest {

    /**
     * Testing {@link DateTimeUtil#convertToString(LocalDate)}
     */
    @Test
    void testConvertToString() {
        assertEquals("25-09-2023", DateTimeUtil.convertToString(LocalDate.of(2023, Month.SEPTEMBER, 25)));
        assertEquals("01-04-2023", DateTimeUtil.convertToString(LocalDate.of(2023, Month.APRIL, 1)));
        assertEquals("15-09-2023", DateTimeUtil.convertToString(LocalDate.of(2023, Month.SEPTEMBER, 15)));
    }

    /**
     * Testing {@link DateTimeUtil#convertToDate(String)}
     */
    @Test
    void testConvertToDate() {
        assertEquals(DateTimeUtil.convertToString(LocalDate.of(2023, Month.SEPTEMBER, 25)), "25-09-2023");
        assertEquals(DateTimeUtil.convertToString(LocalDate.of(2023, Month.APRIL, 1)), "01-04-2023");
        assertEquals(DateTimeUtil.convertToString(LocalDate.of(2023, Month.SEPTEMBER, 15)), "15-09-2023");
    }

    /**
     * Testing {@link DateTimeUtil#convertHourToString(int)}
     */
    @Test
    void testConvertHourToString() {
        assertEquals("00", DateTimeUtil.convertHourToString(0));
        assertEquals("05", DateTimeUtil.convertHourToString(5));
        assertEquals("12", DateTimeUtil.convertHourToString(12));
        assertEquals("23", DateTimeUtil.convertHourToString(23));
    }

    /**
     * Testing {@link DateTimeUtil#convertMinuteToString(int)}
     */
    @Test
    void testConvertMinuteToString() {
        assertEquals("00", DateTimeUtil.convertMinuteToString(0));
        assertEquals("05", DateTimeUtil.convertMinuteToString(5));
        assertEquals("30", DateTimeUtil.convertMinuteToString(30));
        assertEquals("59", DateTimeUtil.convertMinuteToString(59));
    }

    /**
     * Testing {@link DateTimeUtil#parseHour(String)}
     */
    @Test
    void testParseHour() {
        assertEquals(0, DateTimeUtil.parseHour("00"));
        assertEquals(5, DateTimeUtil.parseHour("05"));
        assertEquals(12, DateTimeUtil.parseHour("12"));
        assertEquals(23, DateTimeUtil.parseHour("23"));
    }

    /**
     * Testing {@link DateTimeUtil#parseMinute(String)}
     */
    @Test
    void testParseMinute() {
        assertEquals(0, DateTimeUtil.parseMinute("00"));
        assertEquals(5, DateTimeUtil.parseMinute("05"));
        assertEquals(30, DateTimeUtil.parseMinute("30"));
        assertEquals(59, DateTimeUtil.parseMinute("59"));
    }

    /**
     * Testing {@link DateTimeUtil#convertToLocalDateTime(LocalDate, LocalTime)}
     */
    @Test
    void testConvertToLocalDateTime() {
        LocalDate date = LocalDate.of(2023, Month.SEPTEMBER, 25);
        LocalTime time = LocalTime.of(14, 30);
        LocalDateTime dateTime = DateTimeUtil.convertToLocalDateTime(date, time);
        
        assertEquals(date, dateTime.toLocalDate());
        assertEquals(time, dateTime.toLocalTime());
    }

    /**
     * Testing {@link DateTimeUtil#formatLocalDateTime(LocalDateTime)}
     */
    @Test
    void testFormatLocalDateTime() {
        LocalDateTime dateTime = LocalDateTime.of(2023, Month.SEPTEMBER, 25, 14, 30);
        assertEquals("25-09-2023 14:30", DateTimeUtil.formatLocalDateTime(dateTime));
        
        dateTime = LocalDateTime.of(2023, Month.APRIL, 1, 0, 0);
        assertEquals("01-04-2023 00:00", DateTimeUtil.formatLocalDateTime(dateTime));
    }
}

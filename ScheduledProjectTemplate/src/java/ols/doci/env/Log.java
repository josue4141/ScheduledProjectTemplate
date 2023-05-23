/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ols.doci.env;

import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Luis Brayan
 */
public class Log {
    public static void formatedVerbose(String pattern, Object... arguments) {
        Log.verbose(MessageFormat.format(pattern, arguments));
    }

    public static void formatedDebug(String pattern, Object... arguments) {
        Log.debug(MessageFormat.format(pattern, arguments));
    }

    public static void formatedLog(String pattern, Object... arguments) {
        Log.log(MessageFormat.format(pattern, arguments));
    }

    public static void formatedError(String pattern, Object... arguments) {
        Log.error(MessageFormat.format(pattern, arguments));
    }

    public static void error(String message, Exception error) {
        String msg = MessageFormat.format("[{0}] ERROR({2}): {1} {3}",
            Log.now(), message, error.getClass(), error.getMessage());
        System.out.println(msg);
    }

    public static void error(String message) {
        System.out.println(MessageFormat.format("[{0}] ERROR: {1}", Log.now(), message));
    }
    
    public static void log(String message) {
        System.out.println(MessageFormat.format("[{0}] LOG: {1}", Log.now(), message));
    }

    public static void debug(String message) {
        System.out.println(MessageFormat.format("[{0}] DEBUG: {1}", Log.now(), message));
    }

    public static void verbose(String message) {
        System.out.println(MessageFormat.format("[{0}] VERBOSE: {1}", Log.now(), message));
    }

    private static String now() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
}


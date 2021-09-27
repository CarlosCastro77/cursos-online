package br.edu.infnet.appcursosonline.domain.utils;

import java.time.format.DateTimeFormatter;

public class DataUtils {
    static public DateTimeFormatter dateFmt() {
        return DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    }
}

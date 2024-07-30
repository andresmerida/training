package org.andres.training.design.patterns.adapter;

import org.andres.training.design.patterns.adapter.csv.CsvFileAdapter;
import org.andres.training.design.patterns.adapter.excel.ExcelFileAdapter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class MainAdapter {
    private static final String PATH = "src" + File.separator +
            "main" + File.separator +
            "resources" + File.separator +
            "files" + File.separator;

    public static void main(String[] args) throws FileNotFoundException {
        // EXCEL
        InputStream ExcelInputStream = new FileInputStream(PATH + "ArchivoExcel.xlsx");
        InputFile excelFileAdapter = new ExcelFileAdapter();
        FileAdapter fileAdapter = new FileAdapter(excelFileAdapter);
        System.out.println(fileAdapter.readFile(ExcelInputStream));

        // CSV
        InputStream csvInputStream = new FileInputStream(PATH + "ArchivoCSV.txt");
        InputFile csvFileAdapter = new CsvFileAdapter();
        FileAdapter fileCsvAdapter = new FileAdapter(csvFileAdapter);
        System.out.println(fileCsvAdapter.readFile(csvInputStream));
    }
}

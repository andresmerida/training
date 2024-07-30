package org.andres.training.design.patterns.adapter.excel;

import org.andres.training.design.patterns.adapter.InputFile;
import org.andres.training.design.patterns.adapter.Person;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelFileAdapter implements InputFile {
    @Override
    public List<Person> readFile(InputStream inputStream) {
        List<Person> people = new ArrayList<>();
        try {
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheetAt(0);

            for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
                Row row = sheet.getRow(i);
                int cell = row.getFirstCellNum();

                Person person = new Person();
                person.setName(row.getCell(cell).getStringCellValue());
                person.setLastName(row.getCell(++cell).getStringCellValue());
                person.setAge((int) row.getCell(++cell).getNumericCellValue());

                people.add(person);
            }

            workbook.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return people;
    }
}

package com.naukri.dataprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.naukri.FrameworkConstants.naukriFrameworkConstants;

public class DataProviderUtil {

	private static FileInputStream file ;
	private static  XSSFWorkbook book ;
	private static XSSFSheet sheet;
	private static  Map<String, String>map ;
private static List<Map<String, String>> list = new ArrayList();


	public static List<Map<String, String>> getdata()
	{
		try {
			file = new FileInputStream(naukriFrameworkConstants.getDatasheetpath());
            book = new XSSFWorkbook(file);


		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


              sheet = book.getSheet("sheet1");

                int rowcount = sheet.getLastRowNum();
                
                int cellcount = sheet.getRow(0).getLastCellNum();
                
                Object[] data = new Object[rowcount];
                
               
                
              for (int row = 0 ; row < rowcount; row ++) {
            	  
            	  map = new HashMap<String, String>();
            	  
            	  for (int cell = 0; cell < cellcount; cell++) {
            		  DataFormatter format = new DataFormatter();
            		  String key = format.formatCellValue(sheet.getRow(0).getCell(cell));
            		    String value = format.formatCellValue(sheet.getRow(row+1).getCell(cell));
            		    map.put(key, value);
            		   
            		 data[row]= map;
				}
            	  list.add(map);
            	
			}
			return list;
                






	}


	
	
	
	
}

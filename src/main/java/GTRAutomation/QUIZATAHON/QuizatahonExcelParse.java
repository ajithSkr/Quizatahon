package GTRAutomation.QUIZATAHON;
import java.util.*;
import java.io.*;

import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

public class QuizatahonExcelParse 
{
	public static ArrayList<Object[]>parseExcelData()
	{
		ArrayList<Object[]>userData=new ArrayList<Object[]>();
		try
		{
			File file= new File("/home/ajith/Documents/AutomationTasks/QUIZATAHON/resources/ParticipantsDataQuizatahon.xlsx");
			FileInputStream fileInputStream= new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet sheet = workbook.getSheetAt(0);
			XSSFRow row = null;
			Iterator iterator = sheet.rowIterator();
			int rownum=0;
			while(iterator.hasNext())
			{
				row = (XSSFRow) iterator.next();
				if(rownum>10)
				{
					String fullName= row.getCell(0).toString();
					String email= row.getCell(1).toString();
					String permanentEmail= row.getCell(2).toString();
					String organization= row.getCell(3).toString();
					String city= row.getCell(4).toString();
					XSSFCell number= row.getCell(5);
					long contact= (long) number.getNumericCellValue();
					String contactNumber=new Long(contact).toString();
					String linkedIn=  row.getCell(6).toString();
					String Question1= row.getCell(7).toString();
					String Question2= row.getCell(8).toString();
					String Question3= row.getCell(9).toString();
					String Question4= row.getCell(10).toString();
					String Question5= row.getCell(11).toString();
					String Question6= row.getCell(12).toString();
					String Question7= row.getCell(13).toString();
					String Question8= row.getCell(14).toString();
					String Question9= row.getCell(15).toString();
					String Question10=row.getCell(16).toString();
					String image =    row.getCell(17).toString();
					Object data[]= {fullName,email,permanentEmail,organization,city,contactNumber,linkedIn,Question1,Question2,Question3,Question4,Question5,Question6,Question7,Question8,Question9,Question10,image};
					userData.add(data);
				}
				rownum++;
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return userData;

	}
	public static void main(String args[])
	{
		parseExcelData();
	}
}

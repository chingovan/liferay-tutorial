package com.blogspot.chingovan.firstreport;

import java.io.FileNotFoundException;
import java.util.HashMap;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

public class App {

	public static void main(String[] args) throws FileNotFoundException {

		try {

			String reportTemplateFolder = App.class.getClassLoader().getResource("report-templates").getPath();
			System.out.println("reportTemplateFolder: " + reportTemplateFolder);

			JasperDesign jasperDesign = JRXmlLoader.load(reportTemplateFolder + "/first-report.jrxml");
			JasperReport report = JasperCompileManager.compileReport(jasperDesign);

			JasperPrint jasperPrint = JasperFillManager.fillReport(report, new HashMap<String, Object>());

			JasperExportManager.exportReportToHtmlFile(jasperPrint, "D:\\first-report.html");

			JasperExportManager.exportReportToPdfFile(jasperPrint, "D:\\first-report.pdf");
		} catch (JRException e) {
			e.printStackTrace();
		}
	}
}

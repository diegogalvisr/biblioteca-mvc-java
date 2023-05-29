package proyectobiblioteca.reportes;

import net.sf.jasperreports.engine.*;

public class ReportGenerator {
    public static void main(String[] args) {
        try {
            // Cargar el archivo JRXML y compilarlo
            JasperReport report = JasperCompileManager.compileReport("ruta_al_archivo.jrxml");

            // Crear un origen de datos (puede ser una lista de objetos Java)
            JRDataSource dataSource = new JREmptyDataSource();

            // Llenar el informe con los datos
            JasperPrint print = JasperFillManager.fillReport(report, null, dataSource);

            // Exportar el informe a PDF
            JasperExportManager.exportReportToPdfFile(print, "ruta_del_archivo.pdf");

            System.out.println("Informe generado correctamente.");
        } catch (JRException e) {
            e.printStackTrace();
        }
    }
}

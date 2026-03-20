package br.com.fiap.winery;

import java.net.URL;

import javax.xml.namespace.QName;

import jakarta.xml.ws.Service;

public class ApplicationClient1 {

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://localhost:8086/WineStockService?wsdl");

        QName qName = new QName(
                "http://winery.fiap.com.br/",
                "WineStockServiceImplementationService"
        );

        Service service = Service.create(url, qName);

        WineStockService wine = service.getPort(WineStockService.class);

        String menu = wine.getMenu();

        System.out.println("🍷 MENU:");
        System.out.println(menu);
    }
}
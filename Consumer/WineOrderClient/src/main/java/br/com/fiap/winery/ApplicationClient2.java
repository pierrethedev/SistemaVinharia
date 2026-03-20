package br.com.fiap.winery;

import java.net.URL;

import javax.xml.namespace.QName;

import jakarta.xml.ws.Service;

public class ApplicationClient2 {

    public static void main(String[] args) throws Exception {

        // ========================
        // SERVIÇO DE PEDIDO
        // ========================
        URL url1 = new URL("http://localhost:8085/WineStockService?wsdl");

        QName qName1 = new QName(
                "http://winery.fiap.com.br/",
                "WineStockServiceImplementationService"
        );

        Service service1 = Service.create(url1, qName1);

        WineStockService wineStock = service1.getPort(WineStockService.class);

        String order = wineStock.placeOrder("Merlot", 2);

        System.out.println("📦 PEDIDO:");
        System.out.println(order);

        // ========================
        // SERVIÇO DE AVISO
        // ========================
        URL url2 = new URL("http://localhost:8086/WineWarningService?wsdl");

        QName qName2 = new QName(
                "http://winery.fiap.com.br/",
                "WineWarningServiceImplementationService"
        );

        Service service2 = Service.create(url2, qName2);

        WineWarningService warning = service2.getPort(WineWarningService.class);

        String warn = warning.sendWarn();

        System.out.println("\n⚠️ AVISO:");
        System.out.println(warn);
    }
}